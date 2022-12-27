package crawler

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class ConvenioControllerSpec extends Specification implements ControllerUnitTest<ConvenioController> {

    def setup() {
    }

    def cleanup() {
    }

    void "verifica o retorno"() {
        def result = [
                "/home/mesquita/ZG-MVP/crawler/downloads/demonstrativos/1_convenio_associacaoMedica_2017-11-27_55084598.txt.csv",
                "/home/mesquita/ZG-MVP/crawler/downloads/demonstrativos/2_convenio_associacaoMedica_2017-12-10_50131802.txt.csv",
                "/home/mesquita/ZG-MVP/crawler/downloads/demonstrativos/3_convenio_associacaoMedica_2018-01-10.txt.csv",
                "/home/mesquita/ZG-MVP/crawler/downloads/demonstrativos/4_convenio_associacaoMedica_2018-02-12.txt.csv"
        ]

        expect: result.size() == 4
    }
}
