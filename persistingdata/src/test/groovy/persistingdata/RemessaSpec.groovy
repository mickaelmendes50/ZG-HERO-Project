package persistingdata

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class RemessaSpec extends Specification implements DomainUnitTest<Remessa> {
    def"criando Remessa"(){
        given:
        Remessa remessa = new Remessa(remssa: "15005", numero_remessa:"15005", data_faturamento:"15/03/2022")
        when:
        remessa.data_faturamento
        then:
        remessa.data_faturamento == "15/03/2022"
    }
}
