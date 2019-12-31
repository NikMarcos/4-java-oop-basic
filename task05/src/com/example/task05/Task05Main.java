package com.example.task05;

import javax.sound.sampled.Line;
import java.lang.reflect.Array;

public class Task05Main {
    public static void main(String[] args) {
        Point[] arr = new Point[] {new Point(10, 5), new Point(20, 12), new Point(30, 9), new Point(22, 16)};
        PolygonalLine l = new PolygonalLine();
        l.setPoints(arr);
        System.out.println(l.getLength());
        l.addPoint(new Point(5, 6));
        System.out.println(l.getLength());

    }
}
