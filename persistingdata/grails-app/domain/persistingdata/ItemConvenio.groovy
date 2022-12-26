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

    static belongsTo = [guiaConvenio: GuiaConvenio]
    static hasOne = [itemHospital: ItemHospital, motivoGlosa: MotivoGlosa]

    static constraints = {

    }

    static mapping = {
        codigo column: 'codigo'
        descricao column: 'descricao'
        valorApresentado column: 'valor_apresentado'
        valorPago column: 'valor_pago'
        valorGlosa column: 'valor_glosa'

    }

    @Override
    String toString() {
        return  "Codigo: " + codigo + "\n" +
                "Descricao: " + descricao + "\n" +
                "Valor Apresentado: " + valorApresentado + "\n" +
                "Valor Pago: " + valorPago + "\n" +
                "Valor Glosa: " + valorGlosa + "\n"
    }

}
