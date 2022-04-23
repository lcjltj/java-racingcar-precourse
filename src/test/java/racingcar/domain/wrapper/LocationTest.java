package racingcar.domain.wrapper;

import org.junit.jupiter.api.Test;
import racingcar.domain.wrapper.Location;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {
    @Test
    void 이동() {
        Location location = new Location();
        location.move(8);

        assertEquals(1, location.getLocation());
        assertEquals("-", location.getDashDistance());
    }

    @Test
    void 멈춤() {
        Location location = new Location();
        location.move(3);

        assertEquals(0, location.getLocation());
        assertEquals("", location.getDashDistance());
    }
}