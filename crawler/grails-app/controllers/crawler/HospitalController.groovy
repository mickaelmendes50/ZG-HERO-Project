package crawler

import grails.converters.JSON

class HospitalController {

    def index() {
        Hospital hospital = new Hospital()
        CrawlerService.DownloadHospitalFiles(hospital.getURI())
        render(new response(message: "Faturas baixadas com sucesso") as JSON)
    }
}
