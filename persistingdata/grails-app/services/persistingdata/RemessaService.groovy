package persistingdata

import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.updateData

@Transactional
class RemessaService {
    def saveDataBase() {
        updateData(Remessa, "/hospital")
    }
}
