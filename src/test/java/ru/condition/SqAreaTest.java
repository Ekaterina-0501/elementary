package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(6, 2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP92K6Square259Dot102() {
        double expected = 259.102;
        int p = 92;
        double k = 6;
        double out = SqArea.square(92, 6);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP11K1Dot3Square7Dot4338() {
        double expected = 7.4338;
        int p = 11;
        double k = 1.3;
        double out = SqArea.square(11, 1.3);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}