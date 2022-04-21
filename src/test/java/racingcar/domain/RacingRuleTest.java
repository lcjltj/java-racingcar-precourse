package racingcar.domain;

import org.junit.jupiter.api.Test;
import racingcar.enumeration.MoveStatus;
import racingcar.exception.RacerException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RacingRuleTest {

    @Test
    void 전진() {
        MoveStatus moveStatus = RacingRule.move("8");
        assertEquals(moveStatus, MoveStatus.START);
    }

    @Test
    void 멈춤() {
        MoveStatus moveStatus = RacingRule.move("0");
        assertEquals(moveStatus, MoveStatus.STOP);
    }

    @Test
    void 허용_범위_오류() {
        assertThrows(RacerException.class, () -> RacingRule.move("10"));
    }
}
