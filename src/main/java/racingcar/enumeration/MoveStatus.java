package racingcar.enumeration;

public enum MoveStatus {
    STOP, MOVING_FORWARD;

    public boolean isMoved() {
        return this == MoveStatus.MOVING_FORWARD;
    }
}
