
package CTRL;

import DAO.DaysDAO;
import DAO.TeacherDAO;
import java.util.List;
import model.Days;

public class DaysCtrl {
    
    private DaysDAO ddao;
    Days day = new Days();
    TeacherDAO  tdao = new TeacherDAO();
    
    public DaysCtrl(){
        ddao = new DaysDAO();
    }
    
    public boolean register(String name, int shift, int id){
        day.setName(name);
        day.setShift(shift);
        day.setTeacher(tdao.select(id));       
        return ddao.insert(day);   
    }
    
    public boolean update(String name, int shift, int id){
        day.setName(name);
        day.setShift(shift);
        day.setTeacher(tdao.select(id));    
        return ddao.update(day);
    }
    
    public List<Days> list(int id){
        if (id == 0){
            return ddao.selectAll();
        }
        else{
            return ddao.FindById(id);
        }
    }
    
    public boolean delete(int id){
    	day.setTeacher(tdao.select(id));
    	return ddao.delete(day);
    }
    
    public List<Days> findByDS(String name, int shift){
        return ddao.FindByDS(name, shift);
    }    
}
