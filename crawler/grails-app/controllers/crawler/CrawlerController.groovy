package crawler

import grails.converters.JSON

class CrawlerController {

    def index() {
        render "<h1>Actions: convenio / hospital</h1>"
    }

    def convenio() {
        Convenio convenio = new Convenio()

        def token = CrawlerService.getToken(convenio.getUri(), convenio.getEmail(), convenio.getSenha())
        def parameter = CrawlerService.getParameter(convenio.getUri(), token)

        CrawlerService.DownloadConvenioFiles(parameter,token,convenio.getUri())
        render(new response(message:"Demonstrativos baixados com sucesso") as JSON)
    }

    def hospital() {
        Hospital hospital = new Hospital()
        CrawlerService.DownloadHospitalFiles(hospital.getURI())
        render(new response(message: "Faturas baixadas com sucesso") as JSON)
    }
}
