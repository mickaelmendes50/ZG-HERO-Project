package persistingdata


import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.openCSV

@Transactional
class ItemConvenioService {
    def saveDataBase() {
        File folder = new File("downloads/convenio/")
        def arq = []
        for (File arquivo : folder.listFiles()) {
            arq << arquivo.getAbsolutePath()
        }
        for(file in arq){
            List<ItemConvenio> itens = openCSV(file, ItemConvenio)
            for(item in itens){
                item.save()
            }
        }
    }
}
