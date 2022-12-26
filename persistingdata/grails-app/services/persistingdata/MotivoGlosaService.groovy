package persistingdata


import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.filesPath
import static persistingdata.UtilsService.openCSV

@Transactional
class MotivoGlosaService {

    def saveDataBase() {
        def paths = filesPath("/convenio")

        for(path in paths) {
            List<MotivoGlosa> motivos = openCSV(path, MotivoGlosa)
            for(motivo in motivos){
                motivo.save()
            }
        }
    }
}
