package Modelo;

public class User {

    private int id;
    private String userType;
    private String userName;
    private String password;
    private String forename;
    private String surname;
    private String email;
    private String city;
    private String country;

    public User(int id, String userType, String userName, String password, String forename, String surname, String email, String city, String country) {
        this.id = id;
        this.userType = userType;
        this.userName = userName;
        this.password = password;
        this.forename = forename;
        this.surname = surname;
        this.email = email;
        this.city = city;
        this.country = country;
    }

    public User(String userType, String userName, String password, String forename, String surname, String email, String city, String country) {
        this.userType = userType;
        this.userName = userName;
        this.password = password;
        this.forename = forename;
        this.surname = surname;
        this.email = email;
        this.city = city;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User " + id +
                "\nUserType: " + userType +
                "\nUserName: " + userName +
                "\nForename: " + forename +
                "\nSurname: " + surname +
                "\nEmail: " + email +
                "\nCity: " + city +
                "\nCountry: " + country;
    }
}
