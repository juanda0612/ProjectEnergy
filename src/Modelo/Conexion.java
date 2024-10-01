package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private String db = "renewableenergy";
    private String url = "jdbc:mysql://localhost:3306/"+db;
    private String user = "root";
    private String pass = "0000";

    Connection conect = null;

    public Connection conecta(){

        try{
            conect = DriverManager.getConnection(url,user,pass);
            System.out.println("Conexión OK");
        } catch (SQLException e){
            System.out.println("Error en la conexión: "+e);
        }

        return conect;
    }
}