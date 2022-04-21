package racingcar.domain;

import org.junit.jupiter.api.Test;
import racingcar.exception.RacerException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class RacerNameTest {
    @Test
    void 레이서_이름_입력_오류_확인() {
        assertThrows(RacerException.class, () -> new RacerName(null));
        assertThrows(RacerException.class, () -> new RacerName("hello java"));
    }
}
