package com.suxin.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Long id;
    private String username;
    private String password;
    private String salt;

    private Boolean locked = Boolean.FALSE;

    public User() {

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getCredentialsSalt() {
        return username + salt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
//        if (username != null ? !username.equals(user.username) : user.username != null) return false;
//        if (password != null ? !password.equals(user.password) : user.password != null) return false;
//        if (salt != null ? !salt.equals(user.salt) : user.salt != null) return false;
//        return locked != null ? locked.equals(user.locked) : user.locked == null;
        return true;
    }

    @Override
    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + (id != null ? id.hashCode() : 0);
//        result = 31 * result + (username != null ? username.hashCode() : 0);
//        result = 31 * result + (password != null ? password.hashCode() : 0);
//        result = 31 * result + (salt != null ? salt.hashCode() : 0);
//        result = 31 * result + (locked != null ? locked.hashCode() : 0);
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", locked=" + locked +
                '}';
    }
}
