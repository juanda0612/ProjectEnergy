package Modelo;

import java.sql.*;

public class Users_db {

    Conexion con = new Conexion();
    Connection conexion = null;
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet res = null;

    public User searchUserbyEmail(String email){

        String sql = "SELECT * FROM users WHERE email = ?";
        User u = null;

        try{
            conexion = con.conecta();
            ps = conexion.prepareStatement(sql);
            ps.setString(1,email);
            res = ps.executeQuery();

            while(res.next()){
                u = new User(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),
                        res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9));
            }

            conexion.close();

        }catch(SQLException e){
            System.out.println("Error al consultar: "+e);
        }

        return u;
    }

    public boolean createUser(User u){

        String sql = "INSERT INTO users(usertype,username,password,forename,surname,email,city,country) VALUES(?,?,?,?,?,?,?,?)";
        boolean resultado = false;
        User us = searchUserbyEmail(u.getEmail());

        try{

            if(us==null){
                conexion = con.conecta();

                ps = conexion.prepareStatement(sql);
                ps.setString(1,u.getUserType());
                ps.setString(2,u.getUserName());
                ps.setString(3,u.getPassword());
                ps.setString(4,u.getForename());
                ps.setString(5,u.getSurname());
                ps.setString(6,u.getEmail());
                ps.setString(7,u.getCity());
                ps.setString(8,u.getCountry());

                resultado = ps.executeUpdate()>0;
                conexion.close();
            }else{
                System.out.println("El usuario ya se encuentra registrado");
            }

        }catch(SQLException e){
            System.out.println("Error al registrar al usuario: "+e);
        }

        return resultado;
    }

    public boolean updateUser(User u){

        User us = searchUserbyEmail(u.getEmail());
        boolean resultado = false;
        String sql = "update users set usertype=?, username=?, password=?, forename=?, surname=?, email=?, city=?, country=? where id=?";

        try{

            if(us != null){
                conexion = con.conecta();

                ps = conexion.prepareStatement(sql);
                ps.setString(1,u.getUserType());
                ps.setString(2,u.getUserName());
                ps.setString(3,u.getPassword());
                ps.setString(4,u.getForename());
                ps.setString(5,u.getSurname());
                ps.setString(6,u.getEmail());
                ps.setString(7,u.getCity());
                ps.setString(8,u.getCountry());
                ps.setInt(9,u.getId());
                resultado = ps.executeUpdate()>0;
                conexion.close();
                System.out.println("Datos actualizados correctamente.");
            }else{
                System.out.println("El usuario no se encuentra registrado.");
            }

        }catch(SQLException e){
            System.out.println("Error en el registro: "+e);
        }
        return resultado;
    }
}
