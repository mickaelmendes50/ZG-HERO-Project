package crawler

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
            }
        }
        get "/convenio" (
            controller:"ConvenioController",
            action: "teste"
        )
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
