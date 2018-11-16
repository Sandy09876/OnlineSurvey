package com.qdu.beans;

import com.qdu.dao.UserDao;
import com.qdu.pojo.User;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class DataBean {

    private int userId;//输入的编号
    private String spwd=null;//输入的密码
    private User user=new User();
    private String message;
    private String color;
 public String findUser() {
        UserDao dao = new UserDao();
        user = dao.findUserBystidspwd(userId, spwd);
        if (user != null) {
            return "index_2";
        } else {
            return "fail";
        }
    }
    // 学生信息注册
    public void registerUser() {
        UserDao dao = new UserDao();
        int rows = dao.insert(user);
        if (rows != 0) {
            message = "注册成功，请跳转到登陆页面登录！";
            color = "green";
        } else {
            message = "注册失败，请检查信息！";
            color = "red";
        }
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}