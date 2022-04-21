package racingcar.domain;

public class Location {
    private int location;

    public Location() {
        location = 0;
    }

    public int getLocation() {
        return location;
    }

    public void move(final String move) {
        if (RacingRule.move(move).isMoved()) {
            location++;
        }
    }
}
