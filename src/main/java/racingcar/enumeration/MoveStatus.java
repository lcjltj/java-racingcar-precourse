package racingcar.enumeration;

public enum MoveStatus {
    STOP, MOVE;

    public boolean isMoved() {
        return this == MoveStatus.MOVE;
    }
}
