package racingcar.domain.wrapper;

import racingcar.domain.RacingRule;

public class Location {
    private static final int ZERO = 0;
    private static final String EMPTY = "";
    private static final String DASH = "-";

    private int distance;
    private String dashDistance;

    public Location() {
        distance = DEFAULT_DISTANCE;
        dashDistance = EMPTY;
    }

    public int getDistance() {
        return distance;
    }

    public String getDashDistance() {
        return dashDistance;
    }

    public void moveForward() {
        distance++;
        dashDistance += DASH;
    }
}
