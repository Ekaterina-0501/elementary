package ru.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen1Dot4Euro() {
        float in = 140;
        float expected = 1.4f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert100RblThen1Euro() {
        float in = 100;
        float expected = 1;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert0RblThen0Euro() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert25RblThen0Dot2778Dlr() {
        float in = 25;
        float expected = 0.2778f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert360RblThen4Dlr() {
        float in = 360;
        float expected = 4;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert180RblThen2Dlr() {
        float in = 180;
        float expected = 2f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}