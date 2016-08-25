
package model;

public class Days {
    
    private Teacher teacher;
    private int shift;
    private String name;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Days{" + "teacher=" + teacher.toString() + ", shift=" + shift + ", name=" + name +'}';
    }
   
}
