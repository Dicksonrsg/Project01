
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Available;
import model.Teacher;

public class AvailableDAO {
    
    private DataBaseP db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;  
    
    public AvailableDAO(){
        db = new DataBaseP();
    }
    
    public Available FindById(int id){
        if(db.open()){
            sql = "SELECT *  FROM tb_available WHERE ava_id = ?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if(rs.next()){
                    Available ava = new Available();
                    TeacherDAO tdao = new TeacherDAO();
                    
                    ava.setId(rs.getInt("ava_id"));
                    ava.setTeacher(tdao.select(rs.getInt("ava_tea_id")));
                    rs.close();
                    ps.close();
                    db.close();
                    return ava;  
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
    
    public Available FindByTeacher(Teacher tea){
        if(db.open()){
            sql = "SELECT *  FROM tb_available WHERE ava_tea_id = ?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setInt(1, tea.getId());
                rs = ps.executeQuery();
                if(rs.next()){
                    Available ava = new Available();
                    TeacherDAO tdao = new TeacherDAO();
                    
                    ava.setId(rs.getInt("ava_id"));
                    ava.setTeacher(tdao.select(rs.getInt("ava_tea_id")));
                    rs.close();
                    ps.close();
                    db.close();
                    return ava;  
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
