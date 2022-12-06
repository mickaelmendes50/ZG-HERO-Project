package crawler

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
            }
        }
        get "/crawler" (
            controller:"CrawlerController",
            action: "convenio"
        )

        get "/crawler" (
                controller:"CrawlerController",
                action: "hospital"
        )

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
