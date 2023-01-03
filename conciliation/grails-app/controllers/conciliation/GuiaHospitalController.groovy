package conciliation

class GuiaHospitalController {

    GuiaHospitalService guiaHospitalService
    def index() {
            def guia = guiaHospitalService.serviceMethod()
        render(guia)
    }
}
