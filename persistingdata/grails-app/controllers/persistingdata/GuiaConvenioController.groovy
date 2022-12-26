package persistingdata

import com.google.gson.Gson
import grails.converters.JSON

class GuiaConvenioController {
    def service = new GuiaConvenioService()
    def gson = new Gson();

    def index() {
        def guiasConvenio = GuiaConvenio.list()
        def json = gson.toJson(guiasConvenio)
        render(json)
    }

    def update() {
        service.saveDataBase()
        render(new response(message: "updated database successfuly") as JSON)
    }
}
