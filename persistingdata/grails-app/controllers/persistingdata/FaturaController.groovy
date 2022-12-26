package persistingdata

import grails.converters.JSON
import groovy.json.JsonSlurper

import static persistingdata.UtilsService.openCSV

class FaturaController {

    def index() {
        render("Para atualizar a base de dados use a ação '/update'")
    }

    def update() {
        URL apiUrl = new URL("http://localhost:8080/hospital")
        def absolutePath = new JsonSlurper().parse(apiUrl)

        List<Fatura> faturas = []
        for (String path in absolutePath) {
            Fatura fatura = new Fatura()

            List<GuiaHospital> guias = openCSV(path, GuiaHospital.class)
            fatura.setGuias(guias)

            faturas.add(fatura)
        }

        render(faturas as JSON)
    }
}
