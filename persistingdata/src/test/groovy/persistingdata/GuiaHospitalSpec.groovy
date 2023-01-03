package persistingdata

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class GuiaHospitalSpec extends Specification implements DomainUnitTest<GuiaHospital> {
    def"Criando Guia Hospital"(){
        given:
        GuiaHospital guiaHospital = new GuiaHospital(prestador:"Rede Do'r",dataAtendimento:"10/05/2022",numeroGuia:"1236548",senha:"asudq123sd2")
        when:
        guiaHospital.numeroGuia
        then:
        guiaHospital.numeroGuia == "1236548"
    }
}
