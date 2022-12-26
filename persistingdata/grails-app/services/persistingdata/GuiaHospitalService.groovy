package persistingdata

import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.updateData

@Transactional
class GuiaHospitalService {
    def saveDataBase() {
        updateData(GuiaHospital, "/hospital")
    }
}
