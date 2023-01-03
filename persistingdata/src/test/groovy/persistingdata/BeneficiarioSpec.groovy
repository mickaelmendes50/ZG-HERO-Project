package persistingdata

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class BeneficiarioSpec extends Specification implements DomainUnitTest<Beneficiario> {

    def "criando beneficiario"(){
        given:
        Beneficiario beneficiario = new Beneficiario(matricula:"c4584f51cef023a3", nome: "ALCIDES")
        when:
        beneficiario.matricula
        then:
        beneficiario.matricula == "c4584f51cef023a3"
    }
}
