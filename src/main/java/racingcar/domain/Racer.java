package racingcar.domain;

public class Racer {
    private final RacerName name;
    private final Location location;

    public Racer(final String name) {
        this.name = new RacerName(name);
        this.location = new Location();
    }

    public String getName() {
        return name.getName();
    }

    public int getLocation() {
        return location.getLocation();
    }

    public void move(final String move) {
        location.move(move);
    }
}
