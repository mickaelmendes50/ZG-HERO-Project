package persistingdata

import com.google.gson.Gson

class GuiaConvenioController {
    def guiaConvenioService
    def index() {
        def guiasConvenio = GuiaConvenio.list()
        save()
        Gson gson = new Gson();
        def json = gson.toJson(guiasConvenio)
        render(json)
    }

    def save(){
        guiaConvenioService.saveDataBase()
    }
}
