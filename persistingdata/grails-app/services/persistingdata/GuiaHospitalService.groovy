package persistingdata


import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.openCSV

@Transactional
class GuiaHospitalService {
    def saveDataBase() {
        File folder = new File("downloads/hospital/")
        def arq = []
        for (File arquivo : folder.listFiles()) {
            arq << arquivo.getAbsolutePath()
        }
        for(file in arq){
            List<GuiaHospital> guias = openCSV(file, GuiaHospital)
            for(guia in guias){
                guia.save()
            }
        }
    }
}
