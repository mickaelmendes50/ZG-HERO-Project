package persistingdata

import grails.converters.JSON
import groovy.json.JsonSlurper

import static persistingdata.UtilsService.openCSV

class DemonstrativoController {

    def index() {
        render("Para atualizar a base de dados use a ação '/update'")
    }

    def update() {
        URL apiUrl = new URL("http://localhost:8080/convenio")
        def absolutePath = new JsonSlurper().parse(apiUrl)

        List<Demonstrativo> demonstrativos = []
        for (String path in absolutePath) {
            Demonstrativo demonstrativo = new Demonstrativo()

            List<GuiaConvenio> guias = openCSV(path, GuiaConvenio.class)
            demonstrativo.setGuias(guias)

            demonstrativos.add(demonstrativo)
        }

        render(demonstrativos as JSON)
    }
}
