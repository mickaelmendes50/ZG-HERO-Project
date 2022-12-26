package persistingdata


import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.openCSV

@Transactional
class RemessaService {

    def saveDataBase() {
        File folder = new File("downloads/hospital/")
        def arq = []
        for (File arquivo : folder.listFiles()) {
            arq << arquivo.getAbsolutePath()
        }

        for(file in arq){
            List<Remessa> remessas = openCSV(file, Remessa)
            for(remessa in remessas){
                remessa.save()
            }
        }
    }

}
