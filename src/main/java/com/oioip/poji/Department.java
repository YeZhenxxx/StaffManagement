package com.oioip.poji;

/**
 * 部门表
 * @author Administrator
 */
public class Department {
    private Integer id;
    private short departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public short getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(short departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName=" + departmentName +
                '}';
    }
}
