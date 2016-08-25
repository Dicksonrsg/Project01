
package CTRL;

import DAO.TeacherDAO;
import java.util.List;
import model.Teacher;

public class TeacherCtrl {
    
    private TeacherDAO tdao;
    
    public TeacherCtrl(){
        tdao = new TeacherDAO();
    }
    
    public boolean register(int rg, String name, String language){
        Teacher newt = new Teacher();
        newt.setRg(rg);
        newt.setName(name);
        newt.setLangauge(language);
        return tdao.insert(newt);
    }
    
    public boolean update(int id, int rg, String name, String language){
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setRg(rg);
        teacher.setName(name);
        teacher.setLangauge(language);
        return tdao.update(teacher);
    }
    
    public List<Teacher> list(String filter){
        if(filter == null){
            return tdao.selectAll();
        }
        else{
            return tdao.SelectFilter(filter);
        }       
    }
    
    public boolean delete(int id){
        Teacher teacher = new Teacher();
        teacher.setId(id);
        return tdao.delete(teacher);
    }
    
    public Teacher FindByRG(int rg){
        return tdao.findByRG(rg);   
    }
}


