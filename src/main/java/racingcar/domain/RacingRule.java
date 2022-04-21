package racingcar.domain;

import racingcar.enumeration.MoveStatus;
import racingcar.exception.RacerException;
import racingcar.exception.RacerExceptionType;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class RacingRule {
    private static final String SEPERATOR = ",";
    private static final String REGEX = "^[0-9]";
    private static final Pattern PATTERN = Pattern.compile(REGEX);
    private static final int MOVE_CONDITION = 4;

    public static List<String> enterRacer(final String enterRacer) {
        return toList(enterRacer);
    }

    public static MoveStatus move(final String move) {
        validateRange(move);
        if (isMoved(move)) {
            return MoveStatus.MOVE;
        }
        return MoveStatus.STOP;
    }

    private static List<String> toList(final String enterRacer) {
        return Arrays.asList(split(enterRacer));
    }

    private static String[] split(final String enterRacer) {
        return enterRacer.split(SEPERATOR);
    }

    private static void validateRange(final String move) {
        if (!PATTERN.matcher(move).matches()) {
            throw new RacerException(RacerExceptionType.INVALID_MOVE_RANGE);
        }
    }

    private static boolean isMoved(final String move) {
        return Integer.parseInt(move) >= MOVE_CONDITION;
    }
}
