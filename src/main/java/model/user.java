/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fiat4
 */
public class user {
    private String username;
    private String password;
    private boolean Role;

    public user(String username, String password, boolean Role) {
        this.username = username;
        this.password = password;
        this.Role = Role;
    }

    @Override
    public String toString() {
        return "user{" + "username=" + username + ", password=" + password + ", Role=" + Role + '}';
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isRole() {
        return Role;
    }

    public user() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(boolean Role) {
        this.Role = Role;
    }
    
    
}
