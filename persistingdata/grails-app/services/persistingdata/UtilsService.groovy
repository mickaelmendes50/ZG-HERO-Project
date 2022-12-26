package persistingdata

import com.opencsv.bean.CsvToBeanBuilder
import groovy.json.JsonSlurper

class UtilsService {

    static def updateData(Class objeto, String endpoint) {
        Object classe = objeto.newInstance()

        def paths = filesPath(endpoint)

        for(path in paths) {
            def array = openCSV(path, classe.class)
            for(element in array){
                element.save()
            }
        }
    }

    static def filesPath(def endpoint) {
        String Url = "http://localhost:8080"

        URL apiUrl = new URL(Url + endpoint)
        String[] absolutePath = new JsonSlurper().parse(apiUrl)

        return  absolutePath
    }

    static def openCSV(String path, Class objeto) throws IOException {
        Object classe = objeto.newInstance()
        def  valor = new CsvToBeanBuilder(new FileReader(path))
                .withType(classe.class)
                .build()
                .parse();

        return valor
    }
}
