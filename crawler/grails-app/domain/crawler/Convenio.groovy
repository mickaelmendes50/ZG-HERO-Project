package crawler

class Convenio {
    private final String URI = 'https://backend-site-operadora.rj.r.appspot.com'
    private final String EMAIL = 'HospitalBomAtendimento@gmail.com.br'
    private final String SENHA = '34$33'

    static constraints = {
    }

    String getUri() {
        return this.URI
    }

    String getEmail() {
        return EMAIL
    }

    String getSenha() {
        return this.SENHA
    }

    String toString() {
        return this.EMAIL
    }
}
