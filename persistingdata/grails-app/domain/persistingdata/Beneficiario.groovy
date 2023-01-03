package persistingdata

import com.opencsv.bean.CsvBindByName

class Beneficiario {
    @CsvBindByName(column = "matricula")
    String matricula

    @CsvBindByName(column = "nome")
    String nome

    static hasMany = [guiaHospital: GuiaHospital, guiaConvenio: GuiaConvenio]

    static constraints = {
        guiaHospital nullable: true
        guiaConvenio nullable: true
    }
     static mapping = {
         nome column: 'nome'
         matricula column: 'matricula'
     }



    @Override
    String toString() {
        return "Matricula: " + matricula + "\n" +
                "Nome: " + nome + "\n"
    }

}
