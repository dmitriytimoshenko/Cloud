package Splitter.entity;

import javax.persistence.*;

@Entity
public class Splitter {
    private int id;
    private String login;
    private String password;
    private String fullname;
    private String email;
    private Boolean updatebyemail;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "fullname")
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "updatebyemail")
    public Boolean getUpdatebyemail() {
        return updatebyemail;
    }

    public void setUpdatebyemail(Boolean updatebyemail) {
        this.updatebyemail = updatebyemail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Splitter splitter = (Splitter) o;

        if (id != splitter.id) return false;
        if (login != null ? !login.equals(splitter.login) : splitter.login != null) return false;
        if (password != null ? !password.equals(splitter.password) : splitter.password != null) return false;
        if (fullname != null ? !fullname.equals(splitter.fullname) : splitter.fullname != null) return false;
        if (email != null ? !email.equals(splitter.email) : splitter.email != null) return false;
        if (updatebyemail != null ? !updatebyemail.equals(splitter.updatebyemail) : splitter.updatebyemail != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (fullname != null ? fullname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (updatebyemail != null ? updatebyemail.hashCode() : 0);
        return result;
    }
}
