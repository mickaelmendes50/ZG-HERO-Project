package persistingdata


import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.filesPath
import static persistingdata.UtilsService.openCSV

@Transactional
class GuiaConvenioService {

    def saveDataBase() {
        def paths = filesPath("/convenio")

        for(path in paths) {
            List<GuiaConvenio> guias = openCSV(path, GuiaConvenio)
            for(guia in guias){
                guia.save()
            }
        }
    }
}
