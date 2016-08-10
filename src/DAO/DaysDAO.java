
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Days;

public class DaysDAO{ 

    private DataBaseP db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    public DaysDAO(){
        db = new DataBaseP();
    }
    
    public Days FindById(int id){
        if(db.open()){
            sql = "SELECT *  FROM tb_days WHERE day_id = ?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if(rs.next()){
                    Days day = new Days();
                    day.setId(rs.getInt("day_id"));
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
        
    public Days FindByDay(String name){
        if(db.open()){
            sql = "SELECT *  FROM tb_days WHERE day_name = ?";
            try{
                ps = db.connection.prepareStatement(sql);
                ps.setString(1, name.trim());
                rs = ps.executeQuery();
                if(rs.next()){
                    Days day = new Days();
                    day.setId(rs.getInt("day_id"));
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
                    day.setId(rs.getInt("day_id"));
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
}
