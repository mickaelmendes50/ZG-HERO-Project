package persistingdata

import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.updateData

@Transactional
class ItemConvenioService {
    def saveDataBase() {
        updateData(ItemConvenio, "/convenio")
    }
}
