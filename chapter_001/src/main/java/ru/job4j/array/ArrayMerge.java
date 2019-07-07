package ru.job4j.array;

public class ArrayMerge {
    public int[] merge(int[] left, int[] rigth) {
        int [] merged = new int [left.length + rigth.length];
        for (int i = 0; i <merged.length/2; i++) {
            if (left[i]>rigth[i]) {
                merged[i+i] = rigth[i];
                merged [i+i+1] = left [i];
            } else {
                merged [i+i] = left [i];
                merged [i+i+1] = rigth [i];

            }

        }
        for (int i=0; i<merged.length-1; i++) {
            int t = merged[i];
            if (merged[i]>merged[i+1]) {
                merged[i] = merged[i+1];
                merged [i+1] = t;
            }

        }
        return merged;
    }
}