package racingcar.domain;

import racingcar.enumeration.MoveStatus;
import racingcar.exception.RacerException;
import racingcar.exception.RacerExceptionType;

import java.util.regex.Pattern;

public class RacingRule {
    private static final String REGEX = "^[0-9]";
    private static final Pattern PATTERN = Pattern.compile(REGEX);
    private static final int MOVE_CONDITION = 4;

    public static MoveStatus move(final String move) {
        validateRange(move);
        if (isMoved(move)) {
            return MoveStatus.START;
        }
        return MoveStatus.STOP;
    }

    private static void validateRange(final String move) {
        if (!PATTERN.matcher(move).matches()) {
            throw new RacerException(RacerExceptionType.INVALID_MOVE_RANGE);
        }
    }

    public static boolean isMoved(final String move) {
        return Integer.parseInt(move) >= MOVE_CONDITION;
    }
}
