package crawler

import grails.converters.JSON

class ConvenioController {

    def index() {
        Convenio convenio = new Convenio()

        def token = CrawlerService.getToken(convenio.getUri(), convenio.getEmail(), convenio.getSenha())
        def parameter = CrawlerService.getParameter(convenio.getUri(), token)

        CrawlerService.DownloadConvenioFiles(parameter,token,convenio.getUri())
        render(new response(message:"Demonstrativos baixados com sucesso") as JSON)
    }
}
