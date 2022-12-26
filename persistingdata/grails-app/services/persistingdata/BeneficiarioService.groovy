package persistingdata

import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.*

@Transactional
class BeneficiarioService {
   def saveDataBase() {
       updateData(Beneficiario, "/hospital")
   }
}
