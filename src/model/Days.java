
package model;

public class Days {
    
    private Teacher teacher;
    private int shift;
    private String name;
    private String sigla;

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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Days{" + "teacher=" + teacher.toString() + ", shift=" + shift + ", name=" + name + ", sigla=" + sigla + '}';
    }
   
}
