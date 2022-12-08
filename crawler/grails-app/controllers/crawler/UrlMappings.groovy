package crawler

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
            }
        }
        get "/convenio" (
            controller:"ConvenioController",
            action: "index"
        )

        get "/hospital" (
                controller:"HospitalController",
                action: "index"
        )

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
