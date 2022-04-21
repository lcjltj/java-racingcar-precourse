package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacerTest {

    @Test
    void 이동() {
        Racer racer = new Racer("jun");
        racer.move("8");

        assertEquals(1, racer.getLocation());
    }
}
