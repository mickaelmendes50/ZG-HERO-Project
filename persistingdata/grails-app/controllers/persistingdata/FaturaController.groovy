package persistingdata

import grails.converters.JSON
import groovy.json.JsonSlurper

import static persistingdata.UtilsService.openFaturaCsv

class FaturaController {

    def index() {
        URL apiUrl = new URL("http://localhost:8080/hospital")
        def absolutePath = new JsonSlurper().parse(apiUrl)

        List<Fatura> faturas = []
        for (String path in absolutePath) {
            Fatura fatura = new Fatura()

            List<GuiaHospital> guias = openFaturaCsv(path)
            fatura.setGuias(guias)

            faturas.add(fatura)
        }

        render(faturas as JSON)
    }
}
