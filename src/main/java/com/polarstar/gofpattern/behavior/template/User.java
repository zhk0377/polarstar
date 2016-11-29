package com.polarstar.gofpattern.behavior.template;

import java.sql.Date;

/**
 * Created by zhangxuegang on 2016/5/18.
 */
public class User {

    private int id;
    private String userName;
    private Date birth;
    private Date createDate;

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
