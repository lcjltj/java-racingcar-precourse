package racingcar.domain;

import racingcar.exception.RacerException;
import racingcar.exception.RacerExceptionType;

public class RacerName {
    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 5;

    private final String name;

    public RacerName(final String name) {
        validate(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validate(final String name) {
        validNull(name);
        validLength(name);
    }

    private void validNull(final String name) {
        if (name == null) {
            throw new RacerException(RacerExceptionType.INVALID_RACING_NAME_NOT_NULL);
        }
    }

    private void validLength(final String name) {
        if (!isValidLength(name.length())) {
            throw new RacerException(RacerExceptionType.INVALID_RACING_NAME_LENGTH);
        }
    }

    private boolean isValidLength(final int length) {
        return length >= MIN_LENGTH && length <= MAX_LENGTH;
    }
}
