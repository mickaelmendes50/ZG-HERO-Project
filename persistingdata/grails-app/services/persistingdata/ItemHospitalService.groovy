package persistingdata

import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.updateData

@Transactional
class ItemHospitalService {
    def saveDataBase() {
        updateData(ItemHospital, "/hospital")
    }
}
