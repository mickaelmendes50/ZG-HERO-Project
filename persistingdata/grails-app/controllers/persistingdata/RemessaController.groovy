package persistingdata

import com.google.gson.Gson

class RemessaController {
    def remessaService
    def index() {
        def remessas = Remessa.list()
        save()
        Gson gson = new Gson();
        def json = gson.toJson(remessas)
        render(json)
    }

    def save(){
        remessaService.saveDataBase()
    }
}
