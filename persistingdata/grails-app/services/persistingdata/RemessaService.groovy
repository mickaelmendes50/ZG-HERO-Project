package persistingdata


import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.filesPath
import static persistingdata.UtilsService.openCSV

@Transactional
class RemessaService {

    def saveDataBase() {
        def paths = filesPath("/hospital")

        for(path in paths) {
            List<Remessa> remessas = openCSV(path, Remessa)
            for(remessa in remessas){
                remessa.save()
            }
        }
    }
}
