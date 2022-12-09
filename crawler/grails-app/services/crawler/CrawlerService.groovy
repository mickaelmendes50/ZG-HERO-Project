package crawler

import groovyx.net.http.NativeHandlers
import groovyx.net.http.optional.Download

import static groovyx.net.http.ContentTypes.JSON
import static groovyx.net.http.HttpBuilder.configure

class CrawlerService {

    static getToken(def URI , def EMAIL, def SENHA){
        def result = configure {
            request.uri = URI
            request.contentType = JSON[0]
        }.post{
            request.uri.path = '/login'
            request.body = [email: EMAIL, senha: SENHA]
            request.contentType = 'application/json'
            request.encoder 'application/x-www-form-urlencoded', NativeHandlers.Encoders.&form
        }
        def token = result.tokenDeAcesso
        return token
    }

    static getParameter(def URI, def token){
        def parameter = configure {
            request.uri = URI
        }.get{
            request.uri.path = '/demonstrativos'
            request.uri.query = [listarTodos : true , tokenDeAcesso : token ]
        }
    }

    static DownloadConvenioFiles(def parameter, token, URI){
        new File("downloads/demonstrativos").mkdirs();
        def listaDemonstrativos = parameter.demonstrativos.url
        for(def demosnstrativos : listaDemonstrativos){
            def arquivoSplit = demosnstrativos.toString().split("/demonstrativoFiles([?!.,])fileName=")
            def arquivo = arquivoSplit[1].toString()
            def endpoint = "/demonstrativoFiles"

            File newFile = new File("downloads/demonstrativos/${arquivo}.xlsx");
            File file = configure {
                request.uri = URI
                request.uri.path = endpoint
                request.uri.query = [fileName : arquivo, tokenDeAcesso: token]
            }.get{
                Download.toFile(delegate, newFile)
            }
            file.createNewFile()

        }
        println "Arquivos baixados com sucesso!"
    }

    static DownloadHospitalFiles(def URI){
        new File("downloads/faturas").mkdirs();
        def id = [1,2,3,4]
        for(ids in id){
            File newFile = new File("downloads/faturas/fatura${ids}.csv");
            File file = configure {
                request.uri = URI
                request.uri.path = "/fatura"
                request.uri.query = [id: ids]
            }.get{
                Download.toFile(delegate, newFile)
            }
            file.createNewFile()
        }
    }
}
