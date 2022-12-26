package persistingdata


import grails.gorm.transactions.Transactional

import static persistingdata.UtilsService.openCSV

@Transactional
class ItemHospitalService {
    def saveDataBase() {
        File folder = new File("downloads/hospital/")
        def arq = []
        for (File arquivo : folder.listFiles()) {
            arq << arquivo.getAbsolutePath()
        }
        for (file in arq) {
            List<ItemHospital> itens = openCSV(file, ItemHospital)
            for (item in itens) {
                item.save()
            }
        }
    }
}
