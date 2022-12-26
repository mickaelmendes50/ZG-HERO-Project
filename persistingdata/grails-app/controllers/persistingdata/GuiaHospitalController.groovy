package persistingdata

import com.google.gson.Gson
import grails.converters.JSON

class GuiaHospitalController {
    def service = new GuiaHospitalService()
    def gson = new Gson();

    def index() {
        def guiasHospital = GuiaHospital.list()
        def json = gson.toJson(guiasHospital)
        render(json)
    }

    def update() {
        service.saveDataBase()
        render(new response(message: "updated database successfuly") as JSON)
    }
}
