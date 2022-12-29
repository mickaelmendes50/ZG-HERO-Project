package persistingdata

import com.opencsv.bean.CsvBindByName

class GuiaConvenio {

    @CsvBindByName(column = "convenio")
    String convenio

    @CsvBindByName(column = "numero_guia")
    String numeroGuia

    @CsvBindByName(column = "numero_guia_prestador")
    String numGuiaHospital

    @CsvBindByName(column = "senha")
    String senha

    @CsvBindByName(column = "numero_protocolo")
    String numeroProtocolo

    GuiaHospital guiaHospital
    static hasMany = [itemConvenio :ItemConvenio]

    static constraints = {
        guiaHospital nullable: true
        itemConvenio nullable: true
    }

    static mapping = {
        convenio column: 'convenio'
        numeroGuia column: 'numero_guia'
        numGuiaHospital column: 'guia_hospital'
        senha column: 'senha'
        numeroProtocolo column: 'protocolo'
        id column: 'id_convenio'
    }

    @Override
    String toString() {
        return "\nConvenio: " + convenio + "\n" +
                "Numero Guia: " + numeroGuia + "\n" +
                "Numero Hospital: " + numGuiaHospital + "\n" +
                "Senha: " + senha + "\n" +
                "Protocolo: " + numeroProtocolo + "\n"
    }
}
