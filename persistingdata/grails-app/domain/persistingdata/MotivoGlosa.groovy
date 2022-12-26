package persistingdata

import com.opencsv.bean.CsvBindByName

class MotivoGlosa {

    @CsvBindByName(column = "codigo_motivo")
    String codigoMotivo

    @CsvBindByName(column = "descricao_motivo")
    String descricaoMotivo

   static belongsTo = [itemConvenio: ItemConvenio]

    static constraints = {
        itemConvenio nullable: true
    }


    static mapping = {
        codigoMotivo column: 'codigo_motivo'
        descricaoMotivo column: 'descricao_motivo'
    }

    @Override
    String toString(){
        return "\n Código do Motivo: " + codigoMotivo + "\n" +
                "Descrição do Motivo: " + descricaoMotivo + "\n"
    }
}
