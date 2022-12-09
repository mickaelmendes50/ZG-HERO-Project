package crawler

import grails.converters.JSON

class HospitalController {

    def index() {
        Hospital hospital = new Hospital()
        CrawlerService.DownloadHospitalFiles(hospital.getURI())

        def arquivos = []
        arquivos = CrawlerService.GetAbsolutePath("downloads/faturas")
        println(arquivos)

        render(arquivos as JSON)
    }
}
