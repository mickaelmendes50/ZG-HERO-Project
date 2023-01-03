package conciliation

import grails.gorm.transactions.Transactional

@Transactional
class GuiaHospitalService {

    def serviceMethod() {
        def guiasHospital = GuiaHospital.list()
        def FKS = GuiaConvenio.list()
        GuiaHospital.executeQuery("update GuiaHospital SET guia_convenio_id = $FKS where id = $guiasHospital")
        return guiasHospital.id
    }
}
