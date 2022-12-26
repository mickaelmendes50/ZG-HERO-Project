package persistingdata

import com.google.gson.Gson
import grails.converters.JSON

class BeneficiarioController {
    def service = new BeneficiarioService()
    def gson = new Gson();

    def index() {
        def beneficiarios = Beneficiario.list()
        def json = gson.toJson(beneficiarios)
        render(json)
    }

    def update() {
        service.saveDataBase()
        render(new response(message: "updated database successfuly") as JSON)
    }
}
