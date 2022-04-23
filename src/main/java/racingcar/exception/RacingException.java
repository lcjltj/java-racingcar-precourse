package racingcar.exception;

import racingcar.view.OutputView;

public class RacingException extends RuntimeException {
    private static final String ERROR = "[ERROR]";

    public RacingException(final RacingExceptionType racerException) {
        super(racerException.getMessage());
        printErrorMessage(racerException.getMessage());
    }

    private void printErrorMessage(final String message) {
        String errorMessage = new StringBuilder()
                .append(ERROR)
                .append(" ")
                .append(message)
                .toString();

        OutputView.printErrorMessage(errorMessage);
    }
}
