
package CTRL;

import DAO.PhonesDAO;
import DAO.TeacherDAO;
import java.util.List;
import model.Phone;

public class PhoneCtrl {
    private PhonesDAO pdao;
    TeacherDAO  tdao = new TeacherDAO();
    
    public PhoneCtrl(){
        pdao = new PhonesDAO();
    }
    
    public boolean register(int id, String phone){
        Phone newp = new Phone();        
        newp.setTeacher(tdao.select(id));
        newp.setPhone(phone);
        return pdao.insert(newp);
    }
    
    public boolean update(int id, String phone){
        Phone newp = new Phone();        
        newp.setTeacher(tdao.select(id));
        newp.setPhone(phone);
        return pdao.update(newp);
    }
    
    public List<Phone> list(int id){
        if(id == 0){
            return pdao.selectAll();
        }
        else{
            return pdao.select(id);
        }
    } 
    
    public boolean delete(int id){
        Phone newp = new Phone();        
        newp.setTeacher(tdao.select(id));
        return pdao.delete(newp);
    }
    
}
