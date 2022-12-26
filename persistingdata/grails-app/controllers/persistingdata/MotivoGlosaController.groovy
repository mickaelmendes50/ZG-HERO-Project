package persistingdata

import com.google.gson.Gson

class MotivoGlosaController {
    def motivoGlosaService
    def index() {
        def motivos = MotivoGlosa.list()
        save()
        Gson gson = new Gson();
        def json = gson.toJson(motivos)
        render(json)
    }

    def  save(){
        motivoGlosaService.saveDataBase()
    }
}
