
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Days;

public class DaysDAO{ 

    private DataBaseP db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    public DaysDAO(){
        db = new DataBaseP();
    }
    
    public boolean insert(Days day){
        if(db.open()){
            sql = "INSERT INTO tb_days (day_name, day_shift, day_tea_id) VALUES (?, ?, ?)";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setString(1, day.getName());
                ps.setInt(2, day.getShift());
                ps.setInt(3, day.getTeacher().getId());

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
    
        public boolean delete(Days day){
        if(db.open()){
            sql = "DELETE FROM tb_days WHERE day_tea_id = ?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setInt(1, day.getTeacher().getId());
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
        
    public boolean update(Days day){
        if(db.open()){
            sql = "UPDATE tb_days SET day_name = ?, day_shift = ? WHERE day_tea_id = ?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setString(1, day.getName());
                ps.setInt(2, day.getShift());
                ps.setInt(3, day.getTeacher().getId());
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
    
        public List<Days> selectAll(){
        if(db.open()){
            List<Days> days = new ArrayList();
            sql = "SELECT * FROM tb_days";
            try{
                ps = db.connection.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    Days day = new Days();
                    TeacherDAO tdao = new TeacherDAO(); 
                    day.setTeacher(tdao.select(rs.getInt("pot_tea_id")));
                    day.setName(rs.getString(2));
                    day.setShift(rs.getInt(3));
                    days.add(day);
                }
                rs.close();
                ps.close();
                db.close();
                return days;
            }catch(SQLException error){
                System.out.println("ERRO: " + error.toString());
            } 
        }
        return null;
    }
        
      
    
    public List<Days> FindById(int id){
        if(db.open()){
            List<Days> ds = new ArrayList<>();
            sql = "SELECT *  FROM tb_days WHERE day_tea_id = ?";
            try{                
                ps = db.connection.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                while(rs.next()){
                    Days day = new Days();
                    TeacherDAO tdao = new TeacherDAO();
                    day.setTeacher(tdao.select(rs.getInt("day_tea_id")));
                    day.setName(rs.getString("day_name"));
                    day.setShift(rs.getInt("day_shift"));
                    ds.add(day);                   
                }
                rs.close();
                ps.close();
                db.close();
                return ds;
            }catch (SQLException error){
                System.out.println("ERROR: " + error.toString());
                return null;
            }
        }
        return null;
    }
        
    public List<Days> FindByDS(String name, int shift){
        if(db.open()){
            List<Days> ds2 = new ArrayList<>();
            sql = "SELECT *  FROM tb_days WHERE day_name = ? AND day_shift";
            try{                
                ps = db.connection.prepareStatement(sql);
                ps.setString(1, name);
                ps.setInt(2, shift);
                rs = ps.executeQuery();
                while(rs.next()){
                    Days day = new Days();
                    TeacherDAO tdao = new TeacherDAO();
                    day.setTeacher(tdao.select(rs.getInt("day_tea_id")));
                    day.setName(rs.getString("day_name"));
                    day.setShift(rs.getInt("day_shift"));
                    ds2.add(day);                   
                }
                rs.close();
                ps.close();
                db.close();
                return ds2;
            }catch (SQLException error){
                System.out.println("ERROR: " + error.toString());
                return null;
            }
        }
        return null;
    }   
}
