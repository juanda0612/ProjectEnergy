import Modelo.User;
import Modelo.Users_db;

public class Main {
    public static void main(String[] args) {

        Users_db udb = new Users_db();

        //Prueba insertar usuario
        User u = new User("admin","juanda0612","pass123","Juan David","Herrera Cuartas","juanda0612@gmail.com","Medellín","Colombia");
        udb.createUser(u);

        //Prueba consultar usuario
        System.out.println(udb.searchUserbyEmail("juanda0612@gmail.com"));

        //Prueba actualizar datos
        User us = new User(1,"admin","juanda0612","pass12345","Juan David","Herrera Cuartas","juanda0612@gmail.com","Medellín","Colombia");
        udb.updateUser(us);
    }
}