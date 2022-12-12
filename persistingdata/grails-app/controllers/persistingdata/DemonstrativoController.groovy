package persistingdata

import grails.converters.JSON
import groovy.json.JsonSlurper

import static persistingdata.UtilsService.openDemonstrativoCsv

class DemonstrativoController {

    def index() {
        URL apiUrl = new URL("http://localhost:8080/convenio")
        def absolutePath = new JsonSlurper().parse(apiUrl)

        List<Demonstrativo> demonstrativos = []
        for (String path in absolutePath) {
            Demonstrativo demonstrativo = new Demonstrativo()

            List<GuiaConvenio> guias = openDemonstrativoCsv(path)
            demonstrativo.setGuias(guias)

            demonstrativos.add(demonstrativo)
        }

        render(demonstrativos as JSON)
    }
}
