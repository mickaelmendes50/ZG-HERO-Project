package persistingdata

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class GuiaConvenioSpec  extends Specification implements DomainUnitTest<GuiaConvenio> {
    def "criando Guia Convenio"(){
        given:
        GuiaConvenio guiaConvenio = new GuiaConvenio(convenio:"Bom Atendimento",numeroGuia:"1111111",
                numGuiaHospital:"2222222", senha:"qwe123d132",  numeroProtocolo: "3333333");
        when:
        guiaConvenio.convenio
        then:
        guiaConvenio.convenio == "Bom Atendimento"
    }
}
