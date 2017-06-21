package cn.bdqn.tangcco.entity;

import java.sql.Timestamp;
import java.util.Date;

public class Tbuser {
    private Integer userid;

    private String username;

    private String password;
    private String roleid;

    private String nickname;

    private Timestamp registrationtime;

    private Date dateofbirth;

    private Timestamp systemtime;

    public Tbuser() {
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public Tbuser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Tbuser{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rolesid='" + roleid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", registrationtime=" + registrationtime +
                ", dateofbirth=" + dateofbirth +
                ", systemtime=" + systemtime +
                '}';
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Timestamp getRegistrationtime() {
        return registrationtime;
    }

    public void setRegistrationtime(Timestamp registrationtime) {
        this.registrationtime = registrationtime;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Timestamp getSystemtime() {
        return systemtime;
    }

    public void setSystemtime(Timestamp systemtime) {
        this.systemtime = systemtime;
    }
}