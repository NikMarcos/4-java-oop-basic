package com.example.task04;

public class Line {

    private Point P1;
    private Point P2;

    public Line(Point P1, Point P2){
        this.P1 = P1;
        this.P2 = P2;
    }

    public Point getP1() {
        return P1;
    }

    public Point getP2() {
        return P2;
    }

    public boolean isCollinearLine(Point p){

        return (p.getX()-P1.getX())/(P2.getX()-P1.getX())==(p.getY()-P1.getY())/(P2.getY()-P1.getY());
    }


    @Override
    public String toString() {
        return "Line { " +
                "P1 = (" + P1.getX() + ", " + P1.getY() + "), " +
                "P2 = (" + P2.getX() + ", " + P2.getY() + ") }";
    }
}
