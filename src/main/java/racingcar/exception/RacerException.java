package racingcar.exception;

public class RacerException extends RuntimeException {

    public RacerException(final RacerExceptionType racerException) {
        super(racerException.getMessage());
    }
}
