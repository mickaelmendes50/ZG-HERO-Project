package crawler

import grails.converters.JSON

class ConvenioController {

    def index() {
        Convenio convenio = new Convenio()

        def token = CrawlerService.getToken(convenio.getUri(), convenio.getEmail(), convenio.getSenha())
        def parameter = CrawlerService.getParameter(convenio.getUri(), token)

        CrawlerService.DownloadConvenioFiles(parameter,token,convenio.getUri())

        def arquivos = []
        arquivos = CrawlerService.GetAbsolutePath("downloads/demonstrativos")
        println(arquivos)

        render(arquivos as JSON)
    }
}
