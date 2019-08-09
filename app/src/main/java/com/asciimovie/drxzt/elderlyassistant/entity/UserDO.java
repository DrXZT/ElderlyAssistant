package com.asciimovie.drxzt.elderlyassistant.entity;

public class UserDO {
    private Integer id;
    private String userName;
    private String password;
    private String sex;
    private String phone;
    private String phone2;
    private String address;

    public UserDO(Integer id, String userName, String password, String sex, String phone, String phone2, String address) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.phone = phone;
        this.phone2 = phone2;
        this.address = address;
    }

    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
