package persistingdata


import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.filesPath
import static persistingdata.UtilsService.openCSV

@Transactional
class ItemConvenioService {
    def saveDataBase() {
        def paths = filesPath("/convenio")

        for(path in paths) {
            List<ItemConvenio> itens = openCSV(path, ItemConvenio)
            for(item in itens){
                item.save()
            }
        }
    }
}
