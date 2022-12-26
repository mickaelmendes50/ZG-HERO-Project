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



    //static belongsTo = [guiaConvenio : GuiaConvenio]
    //static hasOne = [itemHospital : ItemHospital]

    static constraints = {
        //guiaConvenio nullable: true
        //itemHospital nullable: true

        prestador column: 'prestador'
        dataAtendimento column: 'data_atendimento'
        numeroGuia column: 'numero_guia'
        senha column: 'senha'
    }

    static mapping = {
        prestador column: 'prestador'
        dataAtendimento column: 'data_atendimento'
        numeroGuia column: 'numero_guia'
        senha column: 'senha'
    }

    @Override
    String toString() {
        return "\nPrestador: " + prestador + "\n" +
                "Data Atendimento: " + dataAtendimento + "\n"+
                "Numero Guia: " + numeroGuia + "\n" +
                "Senha: " + senha + "\n"
    }

}