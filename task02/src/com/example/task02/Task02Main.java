package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(10, 34, 12);
        TimeSpan time2 = new TimeSpan(2, 34, 2);
        TimeSpan time3 = new TimeSpan(1, 34, 1);
        String t = time.toString();
        System.out.println(t);

        time.add(time2);
        time.subtract(time3);
        int h = time.getHour();
        System.out.println(h);
        int m = time.getMin();
        System.out.println(m);
        int s = time.getSec();
        System.out.println(s);

    }
}
