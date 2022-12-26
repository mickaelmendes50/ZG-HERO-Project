package persistingdata

import com.google.gson.Gson

class BeneficiarioController {
    def beneficiarioService
    def index() {
        def beneficiarios = Beneficiario.list()
        save()
        Gson gson = new Gson();
        def json = gson.toJson(beneficiarios)
        render(json)
    }
    def save(){
        beneficiarioService.saveDataBase()
    }
}
