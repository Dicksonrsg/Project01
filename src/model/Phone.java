
package model;

public class Phone {
    
    private String phone;
    private Teacher teacher;

    public Phone(){}
    
    public Phone (String phone, Teacher teacher){
        this.phone = phone;
        this.teacher = teacher;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Phone{" + "phone=" + phone + ", teacher=" + teacher.toString() + '}';
    }
    
    
    
}
