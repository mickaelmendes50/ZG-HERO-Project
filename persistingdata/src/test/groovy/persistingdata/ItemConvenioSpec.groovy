package persistingdata

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ItemConvenioSpec extends Specification implements DomainUnitTest<ItemConvenio> {
    def"criando Item Convenio"(){
        given:
        ItemConvenio itemConvenio = new ItemConvenio(codigo:"1140",descricao:"Cisplantina Vermelha 800ml",
                valorApresentado:'750,00',valorPago:'749,60',valorGlosa:'0,40',
                codigoMotivo:'1401',
                descricaoMotivo:'Valor cobrado acima da tabela de preços'
        )
        when:
        itemConvenio.descricao
        then:
        itemConvenio.descricao == "Cisplantina Vermelha 800ml"
    }
}

