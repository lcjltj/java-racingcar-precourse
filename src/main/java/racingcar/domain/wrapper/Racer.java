package racingcar.domain.wrapper;

import racingcar.view.OutputView;

public class Racer {
    private final RacerName name;
    private final Location location;

    public Racer(final String name) {
        this.name = new RacerName(name);
        this.location = new Location();
    }

    public void move(final long move) {
        location.move(move);
    }

    public void currentLocation() {
        OutputView.printEachStage(name.getName(), location.getDashDistance());
    }

    public int maxInstance(final int maxInstance) {
        return Math.max(maxInstance, location.getLocation());
    }

    public String getWinnerName(final int maxInstance) {
        if (isWinner(maxInstance)) {
            return name.getName();
        }
        return null;
    }

    private boolean isWinner(final int maxInstance) {
        return location.getLocation() == maxInstance;
    }
}
