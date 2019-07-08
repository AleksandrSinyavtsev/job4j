package ru.job4j.array;

public class ArrayMerge {
    public int[] merge(int[] left, int[] rigth) {
        int [] merged = new int [left.length + rigth.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < rigth.length) {
            merged[k++] = left[i] < rigth[j] ? left[i++] : rigth[j++];
        }
        while (i < left.length) {
            merged[k++] = left[i++];
        }

        while (j < rigth.length) {
            merged[k++] = rigth[j++];
        }
        return merged;
    }
}