package persistingdata

import com.google.gson.Gson
import grails.converters.JSON

class RemessaController {
    def service = new RemessaService()
    def gson = new Gson();

    def index() {
        def remessas = Remessa.list()
        def json = gson.toJson(remessas)
        render(json)
    }

    def update() {
        service.saveDataBase()
        render(new response(message: "updated database successfuly") as JSON)
    }
}
