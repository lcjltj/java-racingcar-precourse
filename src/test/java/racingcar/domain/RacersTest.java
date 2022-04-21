package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacersTest {
    @Test
    void 자동차_입력_받기() {
        Racers racers = new Racers(Arrays.asList("chan", "jun", "lee", "racer"));
        assertEquals(4, racers.size());
    }
}
