package persistingdata

import com.opencsv.bean.CsvBindByName

class ItemConvenio {

    @CsvBindByName(column = "codigo")
    String  codigo

    @CsvBindByName(column = "descricao")
    String descricao

    @CsvBindByName(column = "valor_apresentado")
    String valorApresentado

    @CsvBindByName(column = "valor_pago")
    String valorPago

    @CsvBindByName(column = "valor_glosa")
    String valorGlosa

    @CsvBindByName(column = "codigo_motivo")
    String codigoMotivo

    @CsvBindByName(column = "descricao_motivo")
    String descricaoMotivo

    GuiaConvenio guiaConvenio
    ItemHospital itemHospital


    static constraints = {
        guiaConvenio nullable: true
        itemHospital nullable: true
    }

    static mapping = {
        codigo column: 'codigo'
        descricao column: 'descricao'
        valorApresentado column: 'valor_apresentado'
        valorPago column: 'valor_pago'
        valorGlosa column: 'valor_glosa'
        codigoMotivo column: 'codigo_motivo'
        descricaoMotivo colum: 'descricao_motivo'
    }

    @Override
    String toString() {
        return  "Codigo: " + codigo + "\n" +
                "Descricao: " + descricao + "\n" +
                "Valor Apresentado: " + valorApresentado + "\n" +
                "Valor Pago: " + valorPago + "\n" +
                "Valor Glosa: " + valorGlosa + "\n" +
                "Codigo do Motivo" + codigoMotivo + "\n" +
                "Descrição" + descricaoMotivo + "\n"
    }
}