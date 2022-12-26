package persistingdata


import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.*

@Transactional
class BeneficiarioService {

   def saveDataBase() {
        def paths = filesPath("/hospital")

        for(path in paths){
            List<Beneficiario> beneficiarios = openCSV(path, Beneficiario)
            for(beneficiario in beneficiarios){
                beneficiario.save()
            }
        }
   }
}
