package persistingdata

import com.opencsv.bean.CsvToBeanBuilder;

class UtilsService {

    static List<GuiaHospital> openFaturaCsv(String path) throws IOException {
        List<GuiaHospital> guias = new CsvToBeanBuilder(new FileReader(path))
                .withType(GuiaHospital.class)
                .build()
                .parse();

        return guias
    }

    static List<GuiaConvenio> openDemonstrativoCsv(String path) throws IOException {
        List<GuiaConvenio> guias = new CsvToBeanBuilder(new FileReader(path))
                .withType(GuiaConvenio.class)
                .build()
                .parse();

        return guias
    }
}
