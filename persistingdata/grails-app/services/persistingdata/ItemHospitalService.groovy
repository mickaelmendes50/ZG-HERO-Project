package persistingdata


import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.filesPath
import static persistingdata.UtilsService.openCSV

@Transactional
class ItemHospitalService {
    def saveDataBase() {
        def paths = filesPath("/hospital")

        for(path in paths) {
            List<ItemHospital> itens = openCSV(path, ItemHospital)
            for (item in itens) {
                item.save()
            }
        }
    }
}
