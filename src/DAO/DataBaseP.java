
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseP {
    
    
    public Connection connection = null;
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String DATABASE = "Project_01";
    private final String URL = "jdbc:mysql://localhost:3306/" + DATABASE;
    private final String USER = "root";
    private final String PASSWORD = "senac";
    
    public boolean open(){
        try{
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("CONNECTION ON!");
            return true;
        }catch(ClassNotFoundException error){
            System.out.println("DRIVER NOT FOUND");
            System.out.println("Erro: " + error.toString());
        }catch(SQLException error){
            System.out.println("PROBLEMS WITH CONNECTION");
            System.out.println("Erro: " + error.toString());
        }
        return false;
    }
    
    public boolean close(){
        try{
            connection.close();
            System.out.println("CONNECTION OFF");
            return true;
        }catch(SQLException error){
            System.out.println("PROBLEMS WITH DISCONNECTION");
            System.out.println("Erro: " + error.toString());
        }
        return false;
    }    
    
}
