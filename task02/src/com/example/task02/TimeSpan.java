package com.example.task02;

public class TimeSpan {
    private int hour;
    private int min;
    private int sec;

    public TimeSpan(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hours) {
        this.hour = hours;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    void add(TimeSpan time2){
        setHour(time2.hour + this.hour);
        setMin(time2.min + this.min);
        setSec(time2.sec + this.sec);
    }

    void subtract(TimeSpan time3){
        setHour(this.hour - time3.hour);
        setMin(this.min - time3.min);
        setSec(this.sec - time3.sec);
    }

    public String toString(){
        return String.format("%s:%s:%s",hour,min,sec);
    }
}
