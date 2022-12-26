package persistingdata

import com.google.gson.Gson
import grails.converters.JSON

class ItemConvenioController {
    def service = new ItemConvenioService()
    def gson = new Gson();

    def index() {
        def itens = ItemConvenio.list()
        def json = gson.toJson(itens)
        render(json)
    }

    def update() {
        service.saveDataBase()
        render(new response(message: "updated database successfuly") as JSON)
    }
}
