package persistingdata

import com.opencsv.bean.CsvBindByName


class Remessa {
    @CsvBindByName(column = "remessa")
    String remessa = getRemessa()

    @CsvBindByName(column = "numero_remessa")
    String numero_remessa

    @CsvBindByName(column = "data_faturamento")
    String data_faturamento

    static hasMany = [guiaHospital: GuiaHospital, guiaConvenio: GuiaConvenio]

    static constraints = {
        guiaHospital nullable: true
        guiaConvenio nullable: true
    }

    def getRemessa() {
        if (remessa)
            return remessa
        return numero_remessa
    }

    static mapping = {
        remessa column: 'remessa'
        data_faturamento column: 'data_faturamento'
    }

    @Override
    String toString(){
        return "\n Numero Remessa:" + getRemessa() + "\n" +
                "Data faturamento: " + data_faturamento + "\n"
    }
}
