import spock.lang.Specification

class SimpleAssertionSpec extends Specification {
    def 'should be a simple assertion'() {
        expect:
        2 + 2 == 4
    }

    def 'should fail an assertion'() {
        expect:
        3 * (4 + 7) == 32
    }
}
