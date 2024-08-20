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
    void whenMax1000To99And51And0Then1000() {
        int left = 99;
        int right = 51;
        int middle1 = 1000;
        int middle2 = 0;
        int result = Max.max(left, right, middle1, middle2);
        int expected = 1000;
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
    void whenMax7To1And5Then7() {
        int left = 5;
        int right = 1;
        int middle = 7;
        int result = Max.max(left, right, middle);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

}