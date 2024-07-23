package ru.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int el = 5;
        int[] array = new int[]{5, 3, 1, 6};
        int result = FindLoop.indexOf(array, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int el = 10;
        int[] array = new int[]{5, 3, 1, 6};
        int result = FindLoop.indexOf(array, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}