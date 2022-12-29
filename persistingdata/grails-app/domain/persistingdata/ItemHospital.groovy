package persistingdata

import com.opencsv.bean.CsvBindByName

class ItemHospital {



    @CsvBindByName(column = "codigo")
    String codigo

    @CsvBindByName(column = "descricao")
    String descricao

    @CsvBindByName(column = "valor_cobrado")
    String valorCobrado

    ItemConvenio itemConvenio
    GuiaHospital guiaHospital

    static constraints = {
        itemConvenio nullable: true
        guiaHospital nullable: true
    }
    static mapping = {
        codigo column: 'codigo'
        descricao column: 'decricao'
        valorCobrado column: 'valor_cobrado'

    }

    @Override
    String toString() {
        return  "Codigo: " + codigo + "\n" +
                "Descricao: " + descricao + "\n" +
                "Valor cobrado: " + valorCobrado + "\n"
    }
}
