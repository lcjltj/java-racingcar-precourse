package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {
    @Test
    void 이동() {
        String move = "8";
        Location location = new Location();
        location.move(move);

        assertEquals(1, location.getLocation());
    }

    @Test
    void 멈춤() {
        String move = "3";
        Location location = new Location();
        location.move(move);

        assertEquals(0, location.getLocation());
    }
}