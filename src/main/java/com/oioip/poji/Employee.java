package com.oioip.poji;

import java.util.Date;

/**
 *
 * 员工表
 * @author Administrator
 */
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer sex; //0代表女 1代表男
    private Date birthday;
    private Department department;

    public Employee() {
    }

    public Employee(Integer id, String lastName, String email, Integer sex, Date birthday, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.sex = sex;
        this.birthday = birthday;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", department=" + department +
                '}';
    }
}
