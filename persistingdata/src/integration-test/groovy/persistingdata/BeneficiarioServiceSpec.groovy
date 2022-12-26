package persistingdata

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class BeneficiarioServiceSpec extends Specification {

    BeneficiarioService beneficiarioService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Beneficiario(...).save(flush: true, failOnError: true)
        //new Beneficiario(...).save(flush: true, failOnError: true)
        //Beneficiario beneficiario = new Beneficiario(...).save(flush: true, failOnError: true)
        //new Beneficiario(...).save(flush: true, failOnError: true)
        //new Beneficiario(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //beneficiario.id
    }

    void "test get"() {
        setupData()

        expect:
        beneficiarioService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Beneficiario> beneficiarioList = beneficiarioService.list(max: 2, offset: 2)

        then:
        beneficiarioList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        beneficiarioService.count() == 5
    }

    void "test delete"() {
        Long beneficiarioId = setupData()

        expect:
        beneficiarioService.count() == 5

        when:
        beneficiarioService.delete(beneficiarioId)
        sessionFactory.currentSession.flush()

        then:
        beneficiarioService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Beneficiario beneficiario = new Beneficiario()
        beneficiarioService.save(beneficiario)

        then:
        beneficiario.id != null
    }
}
