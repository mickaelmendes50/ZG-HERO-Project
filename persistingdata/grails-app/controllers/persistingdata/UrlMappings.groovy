package persistingdata

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        get "/fatura" (
                controller:"FaturaController",
                action: "index"
        )

        get "/demonstrativo" (
                controller:"DemonstrativoController",
                action: "index"
        )

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
