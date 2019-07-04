package ru.job4j.array;

public class ArrayMerge {
    public int[] merge(int[] left, int[] rigth) {
        int [] merged = new int [left.length + rigth.length];
        int i = 0;
        int j = 0;
            while(i < left.length && j < rigth.length) {
                if (left[i] < rigth[j]) {
                    merged[i + j] = left[i];
                    i++;
                }
                 if  (left[i] > rigth[j]){
                    merged[i + j] = rigth[j];
                    j++;
                }
            }
             if (i < left.length) {
            System.arraycopy(left, i, merged, i+j, merged.length - 1 - i - j);
             }
            else if (j < rigth.length) {
            System.arraycopy(rigth, j, merged, i+j, merged.length - 1 - i - j);
            }
        return merged;
    }
}