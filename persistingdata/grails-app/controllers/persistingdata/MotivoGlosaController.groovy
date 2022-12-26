package persistingdata

import com.google.gson.Gson
import grails.converters.JSON

class MotivoGlosaController {
    def service = new MotivoGlosaService()
    def gson = new Gson();

    def index() {
        def motivos = MotivoGlosa.list()
        def json = gson.toJson(motivos)
        render(json)
    }

    def update() {
        service.saveDataBase()
        render(new response(message: "updated database successfuly") as JSON)
    }
}
