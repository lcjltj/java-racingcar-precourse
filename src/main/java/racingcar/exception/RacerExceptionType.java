package racingcar.exception;

public enum RacerExceptionType {
    INVALID_RACING_NAME_NOT_NULL("레이서 이름은 필수 값 입니다."),
    INVALID_RACING_NAME_LENGTH("레이서 이름은 5자리 이하 여야 합니다.");

    private final String message;

    RacerExceptionType(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
