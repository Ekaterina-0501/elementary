package ru.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenManHeight180then92() {
        short height = 180;
        double expected = 92;
        double rsl = Fit.manWeight(height);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWomanHeight170then69() {
        short height = 170;
        double expected = 69;
        double rsl = Fit.womanWeight(height);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }
}