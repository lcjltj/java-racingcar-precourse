package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Racers {
    public final List<Racer> racers;

    public Racers(List<String> racers) {
        this.racers = mapRacers(racers);
    }

    private List<Racer> mapRacers(List<String> racers) {
        List<Racer> mapRacers = new ArrayList<>();
        for (String racer : racers) {
            mapRacers.add(new Racer(racer));
        }
        return mapRacers;
    }

    public int size() {
        return racers.size();
    }
}
