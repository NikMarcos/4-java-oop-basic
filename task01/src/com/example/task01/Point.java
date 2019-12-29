package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip() {
        System.out.println("x " + -y + ", " + "y " + -x);
    }

    public double distance(Point point){
        double dist = Math.sqrt((point.x - this.x) * 2 + (point.y - this.y) * 2);
        return dist;
    }

    public String toString() {

        return "x " + x + ", " + "y " + y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
