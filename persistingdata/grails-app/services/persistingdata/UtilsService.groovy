package persistingdata

import com.opencsv.bean.CsvToBeanBuilder;

class UtilsService {

    static List<Guia> openFaturaCsv(String path) throws IOException {
        List<Guia> guias = new CsvToBeanBuilder(new FileReader(path))
                .withType(Guia.class)
                .build()
                .parse();

        return guias
    }
}
