package com.ljnpng.annotation.dto;

import java.util.Date;

import com.ljnpng.annotation.annotation.Constraints;
import com.ljnpng.annotation.annotation.DBTable;
import com.ljnpng.annotation.annotation.SqlChar;
import com.ljnpng.annotation.annotation.SqlDate;
import com.ljnpng.annotation.annotation.SqlInteger;
import com.ljnpng.annotation.annotation.SqlString;

/**
 * @Classname Menber
 * @Description TODO
 * @Author liaojp
 * @Date 2020/10/23 16:36
 */
@DBTable("STUDENT")
public class Student {
    @SqlString(30)
    private String firstName;
    @SqlString(50)
    private String lastName;
    @SqlInteger
    private int age;
    @SqlInteger(constraints = @Constraints(primaryKey = true))
    private int id;
    @SqlChar
    private char gender;
    @SqlDate
    private Date loginTime;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}
