package persistingdata


import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.openCSV

@Transactional
class GuiaConvenioService {

    def saveDataBase() {
        File folder = new File("downloads/convenio/")
        def arq = []
        for (File arquivo : folder.listFiles()) {
            arq << arquivo.getAbsolutePath()
        }
        for(file in arq){
            List<GuiaConvenio> guias = openCSV(file, GuiaConvenio)
            for(GuiaConvenio guia in guias){
                guia.save()
            }
        }
    }
}
