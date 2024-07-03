package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double rsl = Point.distance(x1, x2, y1, y2);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10to90then8() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 9;
        int y2 = 0;
        int expected = 8;
        double rsl = Point.distance(x1, x2, y1, y2);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus10to90then10() {
        int x1 = -1;
        int y1 = 0;
        int x2 = 9;
        int y2 = 0;
        int expected = 10;
        double rsl = Point.distance(x1, x2, y1, y2);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

}