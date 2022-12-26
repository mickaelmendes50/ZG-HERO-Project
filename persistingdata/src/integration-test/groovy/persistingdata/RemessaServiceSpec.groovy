package persistingdata

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class RemessaServiceSpec extends Specification {

    RemessaService remessaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Remessa(...).save(flush: true, failOnError: true)
        //new Remessa(...).save(flush: true, failOnError: true)
        //Remessa remessa = new Remessa(...).save(flush: true, failOnError: true)
        //new Remessa(...).save(flush: true, failOnError: true)
        //new Remessa(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //remessa.id
    }

    void "test get"() {
        setupData()

        expect:
        remessaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Remessa> remessaList = remessaService.list(max: 2, offset: 2)

        then:
        remessaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        remessaService.count() == 5
    }

    void "test delete"() {
        Long remessaId = setupData()

        expect:
        remessaService.count() == 5

        when:
        remessaService.delete(remessaId)
        sessionFactory.currentSession.flush()

        then:
        remessaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Remessa remessa = new Remessa()
        remessaService.save(remessa)

        then:
        remessa.id != null
    }
}
