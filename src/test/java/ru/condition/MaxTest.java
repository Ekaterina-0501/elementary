package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax99To51Then99() {
        int left = 99;
        int right = 51;
        int result = Max.max(left, right);
        int expected = 99;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax0ToMinus1Then0() {
        int left = -1;
        int right = 0;
        int result = Max.max(left, right);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5ToMinus5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

}