package persistingdata

import com.opencsv.bean.CsvToBeanBuilder

class UtilsService {

    static def openCSV(String path, Class objeto) throws IOException {
        Object classe = objeto.newInstance()
        def  valor = new CsvToBeanBuilder(new FileReader(path))
                .withType(classe.class)
                .build()
                .parse();

        return valor
    }
}
