package ru.job4j.condition;

public class Max {
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }
    public int max(int first, int second, int third) {
        int rsl = max(first, second);
        return (rsl > third) ? rsl : third;
    }
    public int max(int first, int second, int third, int fourth) {
        int rsl = max(first, second, third);
        return (rsl > fourth) ? rsl : fourth;
    }
}

