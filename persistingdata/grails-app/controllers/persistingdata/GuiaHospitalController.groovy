package persistingdata

import com.google.gson.Gson

class GuiaHospitalController {
    def guiaHospitalService
    def index() {
        def guiasHospital = GuiaHospital.list()
        save()
        Gson gson = new Gson();
        def json = gson.toJson(guiasHospital)
        render(json)

    }

    def save(){
        guiaHospitalService.saveDataBase()
    }
}
