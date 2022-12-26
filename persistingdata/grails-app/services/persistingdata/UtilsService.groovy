package persistingdata

import com.opencsv.bean.CsvToBeanBuilder
import groovy.json.JsonSlurper

class UtilsService {

    static def filesPath(def host) {
        String Url = "http://localhost:8080"

        URL apiUrl = new URL(Url + host)
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
