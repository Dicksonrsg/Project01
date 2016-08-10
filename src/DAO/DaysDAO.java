
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Days;
import model.Teacher;

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
            sql = "INSERT INTO tb_days (day_name, day_acro, day_shift, day_tea_id) VALUES (?, ?, ?, ?)";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setString(1, day.getName());
                ps.setString(2, day.getSigla());
                ps.setInt(3, day.getShift());
                ps.setInt(4, day.getTeacher().getId());

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
            sql = "UPDATE tb_days SET day_name = ?, day_acro = ?, day_shift = ? WHERE day_tea_id";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setString(1, day.getName());
                ps.setString(2, day.getSigla());
                ps.setInt(3, day.getShift());
                ps.setInt(4, day.getTeacher().getId());
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
                    day.setSigla(rs.getString(3));
                    day.setShift(rs.getInt(4));
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
    
    public Days FindById(Teacher tea){
        if(db.open()){
            sql = "SELECT *  FROM tb_days WHERE day_tea_id = ?";
            try{                
                ps = db.connection.prepareStatement(sql);
                ps.setInt(1, tea.getId());
                rs = ps.executeQuery();
                if(rs.next()){
                    Days day = new Days();
                    TeacherDAO tdao = new TeacherDAO();
                    day.setTeacher(tdao.select(rs.getInt("day_tea_id")));
                    day.setName(rs.getString("day_name"));
                    day.setSigla(rs.getString("day_acro"));
                    day.setShift(rs.getInt("day_shift"));
                    rs.close();
                    ps.close();
                    db.close();
                    return day;  
                }
                rs.close();
                ps.close();
                db.close();
            }catch (SQLException error){
                System.out.println("ERROR: " + error.toString());
                return null;
            }
        }
        return null;
    }
        
    public Days FindByDay(String name){
        if(db.open()){
            sql = "SELECT *  FROM tb_days WHERE day_name = ?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setString(1, name.trim());
                rs = ps.executeQuery();
                if(rs.next()){
                    Days day = new Days();
                    TeacherDAO tdao = new TeacherDAO();
                    day.setTeacher(tdao.select(rs.getInt("day_tea_id")));
                    day.setName(rs.getString("day_name"));
                    day.setSigla(rs.getString("day_acro"));
                    rs.close();
                    ps.close();
                    db.close();
                    return day;  
                }
                rs.close();
                ps.close();
                db.close();
            }catch (SQLException error){
                System.out.println("ERROR: " + error.toString());
                return null;
            }
        }
        return null;
    }
    
    public Days FindByAcro(String acro){
        if(db.open()){
            sql = "SELECT *  FROM tb_days WHERE day_name = ?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setString(1, acro.trim());
                rs = ps.executeQuery();
                if(rs.next()){
                    Days day = new Days();
                    TeacherDAO tdao = new TeacherDAO();
                    day.setTeacher(tdao.select(rs.getInt("day_tea_id")));
                    day.setName(rs.getString("day_name"));
                    day.setSigla(rs.getString("day_acro"));
                    day.setSigla(rs.getString("day_acro"));
                    rs.close();
                    ps.close();
                    db.close();
                    return day;  
                }
                rs.close();
                ps.close();
                db.close();
            }catch (SQLException error){
                System.out.println("ERROR: " + error.toString());
                return null;
            }
        }
        return null;
    }    
}
