package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayMergeTest {
    @Test
    public void whenArrayMerged() {
        ArrayMerge array = new ArrayMerge();
        int[] left = new int[]{1, 2, 4, 6, 11};
        int[] rigth = new int[] {3, 5, 8, 10};
        int[] result = array.merge(left, rigth);
        int[] expect = new int[]{1, 2, 3, 4, 5, 6, 8, 10, 11};
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayMerged1to10() {
        ArrayMerge array = new ArrayMerge();
        int[] left = new int[]{1, 2, 3, 4, 5};
        int[] rigth = new int[] {6, 7, 8, 9, 10};
        int[] result = array.merge(left, rigth);
        int[] expect = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayMerged1to2() {
        ArrayMerge array = new ArrayMerge();
        int[] left = new int[]{1, 1, 1, 1, 1};
        int[] rigth = new int[] {1, 1, 1, 1, 2};
        int[] result = array.merge(left, rigth);
        int[] expect = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayNegativeAndPozitiveMerged() {
        ArrayMerge array = new ArrayMerge();
        int[] left = new int[]{-5, -4, -3, -2, -1};
        int[] rigth = new int[] {0, 1, 2, 3, 4, 5};
        int[] result = array.merge(left, rigth);
        int[] expect = new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
}
