package com.example.demo.model;

public class Usuario {
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    private String login;
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Usuario(){}
    /**
     * @param login
     * @param password
     */
    public Usuario(String login, String password){
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString(){
        return "User{" +
        "login="+login+'\''+
        ", password= "+password+
        "}";
    }

}
