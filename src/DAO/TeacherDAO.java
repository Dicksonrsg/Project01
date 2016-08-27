
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Teacher;

public class TeacherDAO {
    
    private DataBaseP db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    public TeacherDAO(){
        db = new DataBaseP();
    }
    
    public boolean insert(Teacher teacher){
        if(db.open()){
            sql = "INSERT INTO tb_teachers (tea_rg, tea_name, tea_language) VALUES (?, ?, ?)";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setInt(1, teacher.getRg());
                ps.setString(2, teacher.getName());
                ps.setString(3, teacher.getLangauge());
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
    
    public boolean delete(Teacher teacher){
        if(db.open()){
            sql = "DELETE FROM tb_teachers WHERE tea_id = ?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setInt(1, teacher.getId());
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

    public boolean update(Teacher teacher){
        if(db.open()){
            sql = "UPDATE tb_teachers SET tea_rg = ?, tea_name = ?, tea_language = ? WHERE tea_id=?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setInt(1, teacher.getRg());
                ps.setString(2, teacher.getName());
                ps.setString(3, teacher.getLangauge());
                ps.setInt(4, teacher.getId());
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
    
    public List<Teacher> selectAll(){
        if(db.open()){
            List<Teacher> teachers = new ArrayList();
            sql = "SELECT * FROM tb_teachers";
            try{
                ps = db.connection.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    Teacher teacher = new Teacher();
                    teacher.setRg(rs.getInt(1));
                    teacher.setName(rs.getString(2));
                    teacher.setLangauge(rs.getString(3));
                    teachers.add(teacher);
                }
                rs.close();
                ps.close();
                db.close();
                return teachers;
            }catch(SQLException error){
                System.out.println("ERRO: " + error.toString());
            } 
        }
        return null;
    }
    
    public List<Teacher> SelectFilter(String filter){
        if(db.open()){
            List<Teacher> teachers = new ArrayList();
            String filtro = "%" + filter + "%";
            sql = "SELECT * FROM tb_teachers WHERE tea_name LIKE ? OR tea_language LIKE ? OR tea_rg LIKE ?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setString(1, filtro);
                ps.setString(2, filtro);
                ps.setString(3, filtro);
                rs = ps.executeQuery();
                while(rs.next()){
                    Teacher teacher = new Teacher();
                    teacher.setRg(rs.getInt(4));
                    teacher.setName(rs.getString(2));
                    teacher.setLangauge(rs.getString(3));
                    teachers.add(teacher);
                }
                rs.close();
                ps.close();
                db.close();
                return teachers;
            }catch(SQLException error){
                System.out.println("ERRO: " + error.toString());
            } 
        }
        return null;   
    }
    
    public Teacher select(int id){
        if(db.open()){
            Teacher teacher = new Teacher();
            sql = "SELECT * FROM tb_teachers WHERE tea_id = ?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if(rs.next()){
                    teacher.setId(rs.getInt(1));
                    teacher.setName(rs.getString(2));
                    teacher.setLangauge(rs.getString(3));
                    teacher.setRg(rs.getInt(4));
                }
                rs.close();
                ps.close();
                db.close();
                return teacher;
            }catch(SQLException error){
                System.out.println("ERRO: " + error.toString());
            } 
        }
        db.close();
        return null;   
    } 
    
    public Teacher findByRG(int rg){
        if(db.open()){
            Teacher teacher = new Teacher();
            sql = "SELECT * FROM tb_teachers WHERE tea_rg = ?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setInt(1, rg);
                rs = ps.executeQuery();
                if(rs.next()){
                    teacher.setId(rs.getInt(1));
                    teacher.setName(rs.getString(2));
                    teacher.setLangauge(rs.getString(3));
                    teacher.setRg(rs.getInt(4));
                }
                rs.close();
                ps.close();
                db.close();
                return teacher;
            }catch(SQLException error){
                System.out.println("ERRO: " + error.toString());
            } 
        }
        db.close();
        return null;   
    }    
}
