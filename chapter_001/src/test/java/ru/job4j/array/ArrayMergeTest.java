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
}
