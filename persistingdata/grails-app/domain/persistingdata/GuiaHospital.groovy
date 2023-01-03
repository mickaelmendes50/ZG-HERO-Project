package persistingdata

import com.opencsv.bean.CsvBindByName

class GuiaHospital {

    @CsvBindByName(column = "prestador")
    String prestador

    @CsvBindByName(column = "data_atendimento")
    String dataAtendimento

    @CsvBindByName(column = "numero_guia")
    String  numeroGuia

    @CsvBindByName(column = "senha")
    String senha

    GuiaConvenio guiaConvenio
    static hasMany = [itemHospital: ItemHospital ]

    static constraints = {
        guiaConvenio nullable: true
        guiaConvenio updateable: true
        itemHospital nullable: true
        senha nullable: true
    }

    static mapping = {
    }

    @Override
    String toString() {
        return "\nPrestador: " + prestador + "\n" +
                "Data Atendimento: " + dataAtendimento + "\n"+
                "Numero Guia: " + numeroGuia + "\n" +
                "Senha: " + senha + "\n"
    }
}
