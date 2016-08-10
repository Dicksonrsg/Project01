
package model;

public class Shift {
    
    private int shift;
    private int day;

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Shift{" + "shift=" + shift + ", day=" + day + '}';
    }
    
    
}
