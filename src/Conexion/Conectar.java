package Conexion;

import java.sql.*;

public class Conectar{

    static String bd = "ed";
    static String login = "elpapu";
    static String password = "1234";
    static String url = "jdbc:mysql://localhost/"+bd;
    Connection connection = null;
        
    public Conectar(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url,login,password);
        if (connection!=null){
            System.out.println("Conexión a base de datos "+bd+" OK\n");
        }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public void desconectar(){
        try{
            System.out.println("Cerrando conexion");
            connection.close();
        }catch(Exception ex){}
    }
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub
        Conectar c= new Conectar();
        if(c.getConnection()!=null){
            System.out.println("Conexión exitosa");
        }
    }


}
