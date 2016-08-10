
package model;

public class Available {
    
    private int id;
    private Teacher teacher;
    
    public Available(){}
    
    public Available(int id, Teacher teacher){
        this.id = id;
        this.teacher = teacher;   
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    @Override
    public String toString() {
        return "Available{" + "id=" + id +", teacher=" + teacher.toString() + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
