package racingcar.domain;

import racingcar.enumeration.MoveStatus;
import racingcar.exception.RacingException;
import racingcar.exception.RacingExceptionType;

public class RacingRule {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 9;
    private static final int MOVE_CONDITION = 4;

    public static MoveStatus move(final long move) {
        validateRange(move);
        if (isMoved(move)) {
            return MoveStatus.MOVING_FORWARD;
        }
        return MoveStatus.STOP;
    }

    private static void validateRange(final long move) {
        if (!isValidRange(move)) {
            throw new RacingException(RacingExceptionType.INVALID_MOVE_RANGE);
        }
    }

    private static boolean isValidRange(final long move) {
        return move >= MIN_VALUE && move <= MAX_VALUE;
    }

    private static boolean isMoved(final long move) {
        return move >= MOVE_CONDITION;
    }
}
