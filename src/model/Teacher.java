
package model;

public class Teacher {
    
    private int id;
    private int rg;
    private String name;
    private String langauge;
    private String phone;
    
    public Teacher(){}
    
    public Teacher(int id, int rg, String name, String language, String phone){
        this.id = id;
        this.name = name;
        this.rg = rg;
        this.langauge = language;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLangauge() {
        return langauge;
    }

    public void setLangauge(String langauge) {
        this.langauge = langauge;
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + "rg=" + rg + ", name=" + name + ", langauge=" + langauge + ", phone=" + phone + '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }
    
    
}
