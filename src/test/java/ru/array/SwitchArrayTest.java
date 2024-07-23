package ru.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to3() {
        int index1 = 1;
        int index2 = 3;
        int[] array = {9, 8, 7, 6, 5, 4};
        int[] result = SwitchArray.swap(array, index1, index2);
        int[] expected = {9, 6, 7, 8, 5, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to4() {
        int index1 = 1;
        int index2 = 4;
        int[] array = {0, 0, 0, 1, 1, 1};
        int[] result = SwitchArray.swap(array, index1, index2);
        int[] expected = {0, 1, 0, 1, 0, 1};
        assertThat(result).containsExactly(expected);
    }
}