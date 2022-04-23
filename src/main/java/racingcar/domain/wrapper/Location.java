package racingcar.domain.wrapper;

import racingcar.domain.RacingRule;

public class Location {
    private static final int ZERO = 0;
    private static final String EMPTY = "";
    private static final String DASH = "-";

    private int location;

    public Location() {
        location = ZERO;
    }

    public int getLocation() {
        return location;
    }

    public String getDashDistance() {
        StringBuilder dashDistance = new StringBuilder(EMPTY);
        for (int i = 0; i < location; i++) {
            dashDistance.append(dashDistance).append(DASH);
        }
        return dashDistance.toString();
    }

    public void move(final long move) {
        if (RacingRule.move(move).isMoved()) {
            location = location + 1;
        }
    }
}
