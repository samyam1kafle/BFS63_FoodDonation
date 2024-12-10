package org.example.pojo;

/**
 * @Author : Samyam Kafle
 * @Portfolio : https://samyamkafle.com.np
 * @Project : OOP
 * @CreatedDate : 10/12/2024, Tuesday
 **/
public class User {
    private int id = 0;
    private String username;
    private String password;

    private String type = "USER"; // Admin/ NGO/ etc
    public User() {}
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.id++;
    }

    public int getId() {
        return id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [" +
                "id : " + id +
                ", username :'" + username + '\'' +
                ", password :'" + password + '\'' +
                ']';
    }
}
