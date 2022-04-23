package racingcar.domain;

import org.junit.jupiter.api.Test;
import racingcar.enumeration.MoveStatus;
import racingcar.exception.RacingException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RacingRuleTest {
    @Test
    void 전진() {
        assertEquals(MoveStatus.MOVING_FORWARD, RacingRule.move(8));
    }

    @Test
    void 멈춤() {
        assertEquals(MoveStatus.STOP, RacingRule.move(0));
    }

    @Test
    void 허용_범위_오류() {
        assertThrows(RacingException.class, () -> RacingRule.move(10));
    }
}
