package persistingdata


import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.openCSV

@Transactional
class BeneficiarioService {

   def saveDataBase() {
    File folder = new File("downloads/hospital/")
    def arq = []
    for (File arquivo : folder.listFiles()) {
        arq << arquivo.getAbsolutePath()
    }
    for(file in arq){
        List<Beneficiario> beneficiarios = openCSV(file, Beneficiario)
        for( Beneficiario beneficiario in beneficiarios){
            beneficiario.save()
        }
    }
   }
}
