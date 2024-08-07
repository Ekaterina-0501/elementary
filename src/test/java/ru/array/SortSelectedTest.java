package ru.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSortFiveEl() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortThreeEl() {
        int[] data = new int[] {0, -5, 22};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-5, 0, 22};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSixEl() {
        int[] data = new int[] {5, 4, 1, 2, 5, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 2, 4, 5, 5};
        assertThat(result).containsExactly(expected);
    }
}