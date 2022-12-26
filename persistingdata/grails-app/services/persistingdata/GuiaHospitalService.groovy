package persistingdata


import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.filesPath
import static persistingdata.UtilsService.openCSV

@Transactional
class GuiaHospitalService {
    def saveDataBase() {
        def paths = filesPath("/hospital")

        for(path in paths) {
            List<GuiaHospital> guias = openCSV(path, GuiaHospital)
            for(guia in guias){
                guia.save()
            }
        }
    }
}
