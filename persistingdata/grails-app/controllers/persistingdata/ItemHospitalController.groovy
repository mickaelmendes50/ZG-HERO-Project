package persistingdata

import com.google.gson.Gson

class ItemHospitalController {
    def itemHospitalService
    def index() {
        def itens = ItemHospital.list()
        save()
        Gson gson = new Gson();
        def json = gson.toJson(itens)
        render(json)
    }

    def save(){
        itemHospitalService.saveDataBase()
    }
}
