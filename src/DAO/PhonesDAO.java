
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javafx.beans.binding.Bindings;
import model.Phone;

public class PhonesDAO {
    
    private DataBaseP db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
        
    public PhonesDAO(){
        db = new DataBaseP();
    }
    
    public boolean insert(Phone phone){
        if(db.open()){
            sql = "INSERT INTO tb_phones_of_teachers (pot_phone, pot_tea_id) VALUES (?, ?)";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setString(1, phone.getPhone());
                ps.setInt(2, phone.getTeacher().getId());

                if(ps.executeUpdate() == 1){
                    ps.close();
                    db.close();
                    return true;
                }
            }catch(SQLException error){
                System.out.println("ERRO: " + error.toString());
            }
        }
        db.close();
        return false;
    }
    
    public boolean delete(Phone phone){
        if(db.open()){
            sql = "DELETE FROM tb_phones_of_teachers WHERE pot_tea_id = ?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setInt(1, phone.getTeacher().getId());
                if(ps.executeUpdate() == 1){
                    ps.close();
                    db.close();
                    return true;
                }
            }catch(SQLException error){
                System.out.println("ERRO: " + error.toString());
            }
        }
        db.close();
        return false;       
    }
    
    public boolean update(Phone phone){
        if(db.open()){
            sql = "UPDATE tb_phones_of_teachers SET pot_phone = ? WHERE pot_tea_id = ?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setString(1, phone.getPhone());
                ps.setInt(2, phone.getTeacher().getId());
                if(ps.executeUpdate() == 1){
                    ps.close();
                    db.close();
                    return true;
                }
            }catch(SQLException error){
                System.out.println("ERRO: " + error.toString());
            }
        }
        db.close();
        return false;    
    }
    
    public List<Phone> selectAll(){
        if(db.open()){
            List<Phone> phones = new ArrayList();
            sql = "SELECT * FROM tb_phones_of_teachers";
            try{
                ps = db.connection.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    Phone phone = new Phone();
                    TeacherDAO tdao = new TeacherDAO(); 
                    phone.setTeacher(tdao.select(rs.getInt("pot_tea_id")));
                    phone.setPhone(rs.getString(2));
                    phones.add(phone);
                }
                rs.close();
                ps.close();
                db.close();
                return phones;
            }catch(SQLException error){
                System.out.println("ERRO: " + error.toString());
            } 
        }
        return null;
    }
    
    public List<Phone> select(int id){
        if(db.open()){
            Phone phone = new Phone();
            List<Phone> phones = new ArrayList();
            TeacherDAO tdao = new TeacherDAO();
            sql = "SELECT * FROM tb_phones_of_teachers WHERE pot_tea_id = ?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if(rs.next()){
                    phone.setTeacher(tdao.select(rs.getInt("pot_tea_id")));
                    phone.setPhone(rs.getString(1));
                    phones.add(phone);
                }
                rs.close();
                ps.close();
                db.close();
                return phones;
            }catch(SQLException error){
                System.out.println("ERRO: " + error.toString());
            } 
        }
        db.close();
        return null;   
    }
    
    /*public static void main(String[] args) {
        List ph = new ArrayList();
        int id = 1;
        PhonesDAO pd = new PhonesDAO();
        ph = pd.select(id);
        
        System.out.println(ph.get(0).toString());
    }*/
}
