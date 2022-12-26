package persistingdata


import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.openCSV

@Transactional
class MotivoGlosaService {

    def saveDataBase() {
        File folder = new File("downloads/convenio/")
        def arq = []
        for (File arquivo : folder.listFiles()) {
            arq << arquivo.getAbsolutePath()
        }
        for(file in arq){
            List<MotivoGlosa> motivos = openCSV(file, MotivoGlosa)
            for(motivo in motivos){
                motivo.save()
            }
        }
    }
}
