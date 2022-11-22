package lv.id.jc.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

final class SampleAssertionsTest {

    private final Person agent1 = new Person("Smith");
    private final Person agent2 = new Person("Smith");
    private final Person smith = new Person("Smith");
    private final Person smith2 = smith;
    private final Person neo = new Person("Neo");

    @Test
    void testEquals() {
        Assertions.assertEquals(agent1, agent2);
        Assertions.assertSame(smith, smith2);
    }

    @Test
    void testNotEquals() {
        Assertions.assertNotEquals(neo, smith);
        Assertions.assertNotSame(neo, smith);
    }
}
