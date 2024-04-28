package com.ohracleLand.model.dto;

public class UserDTO {

    private String id;
    private String pwd;
    private String name;
    // private String email;
    // private String phone;

    public UserDTO(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }
    public UserDTO(String id, String pwd, String name/*, String email, String phone*/) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        // this.email = email;
        // this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    */
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                // ", email='" + email + '\'' +
                // ", phone='" + phone + '\'' +
                '}';
    }

}
