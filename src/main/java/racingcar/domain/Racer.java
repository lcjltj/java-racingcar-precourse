package racingcar.domain;

public class Racer {
    private final RacerName name;

    public Racer(final String name) {
        this.name = new RacerName(name);
    }

    public String getName() {
        return name.getName();
    }
}
