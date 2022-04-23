package racingcar.domain.wrapper;

import racingcar.exception.RacingException;
import racingcar.exception.RacingExceptionType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Racers {
    private static final String SEPERATOR = ",";

    public final List<Racer> racers;

    public Racers(final String racers) {
        validNull(racers);
        this.racers = mapRacers(racers);
    }

    public List<Racer> getRacers() {
        return Collections.unmodifiableList(racers);
    }

    public int getMaxInstance() {
        int maxInstance = 0;
        for (Racer racer : racers) {
            maxInstance = racer.maxInstance(maxInstance);
        }
        return maxInstance;
    }

    private void validNull(final String racers) {
        if (racers == null) {
            throw new RacingException(RacingExceptionType.INVALID_RACING_NAME_NOT_NULL);
        }
    }

    private List<Racer> mapRacers(final String racers) {
        List<Racer> mapRacers = new ArrayList<>();
        for (String racer : split(racers)) {
            mapRacers.add(new Racer(racer.trim()));
        }
        return mapRacers;
    }

    private String[] split(final String racers) {
        return racers.split(SEPERATOR);
    }

}
