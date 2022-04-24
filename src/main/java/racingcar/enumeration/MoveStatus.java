package racingcar.enumeration;

public enum MoveStatus {
    STOP, MOVING_FORWARD;

        if (MOVING_FORWARD.isInBoundary(move)) {
            return MOVING_FORWARD;
        }

        OutputView.printErrorMessage(StaticRacingException.INVALID_MOVE_RANGE_EXCEPTION.getMessage());
        throw StaticRacingException.INVALID_MOVE_RANGE_EXCEPTION;
    }

    private boolean isInBoundary(final long move) {
        return move >= startBoundary && move < endBoundary;
    }

}
