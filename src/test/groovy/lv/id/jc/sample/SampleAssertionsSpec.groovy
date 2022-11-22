package lv.id.jc.sample

import spock.lang.Specification

class SampleAssertionsSpec extends Specification {

    def 'compare two agents'() {
        given:
        def agent1 = new Person('Smith')
        def agent2 = new Person('Smith')

        expect:
        agent1 == agent2
        agent1 === agent2
    }
}
