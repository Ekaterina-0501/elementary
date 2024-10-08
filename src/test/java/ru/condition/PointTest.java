package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        int expected = 2;
        double rsl = a.distance(b);;
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10to90then8() {
        Point a = new Point(1, 0);
        Point b = new Point(9, 0);
        int expected = 8;
        double rsl = a.distance(b);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus10to90then10() {
        Point a = new Point(-1, 0);
        Point b = new Point(9, 0);
        int expected = 10;
        double rsl = a.distance(b);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when004to024then2() {
        Point a = new Point(0, 0, 4);
        Point b = new Point(0, 2, 4);
        int expected = 2;
        double rsl = a.distance3d(b);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when104to023then2() {
        Point a = new Point(1, 0, 4);
        Point b = new Point(0, 2, 3);
        double expected = 2.449;
        double rsl = a.distance3d(b);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }
}