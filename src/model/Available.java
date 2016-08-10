
package model;

public class Available {
    
    private Teacher teacher;
    private Shift shift;
    private Days day;
    
    public Available(){}
    
    public Available(Teacher teacher, Shift shift, Days day){
        this.teacher = teacher;
        this.shift = shift;
        this.day = day;
    
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public Days getDay() {
        return day;
    }

    public void setDay(Days day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Available{" + "teacher=" + teacher.toString() + ", shift=" + shift.toString() + ", day=" + day.toString() + '}';
    }
    
    
}
