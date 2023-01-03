package persistingdata

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ItemHospitalSpec extends Specification implements DomainUnitTest<ItemHospital> {
    def "criando Item Hospital"(){
        given:
        ItemHospital itemHospital = new ItemHospital(codigo: "1404", descricao:"Cisplatina Vermelha 800ml",valorCobrado:"750,00" )
        when:
        itemHospital.descricao
        then:
        itemHospital.descricao == "Cisplatina Vermelha 800ml"
    }
}
