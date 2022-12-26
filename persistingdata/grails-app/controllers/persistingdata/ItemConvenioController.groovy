package persistingdata

import com.google.gson.Gson

class ItemConvenioController {

    def itemConvenioService
    def index() {
        def itens = ItemConvenio.list()
        save()
        Gson gson = new Gson();
        def json = gson.toJson(itens)
        render(json)
    }

    def save(){
        itemConvenioService.saveDataBase()
    }

}
