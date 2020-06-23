package com.oioip.mapper;

import com.oioip.poji.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 部门持久层
 * @author Administrator
 */
@Repository("departmentMapper")
public class DepartmentMapper {
   //模拟数据库中的数据
   private static Map<Integer, Department> department=new HashMap<>();
   //初始化数据
   static {
       department.put(101,new Department(101,"教学部"));
       department.put(102,new Department(102,"后勤部"));
       department.put(103,new Department(103,"销售部"));
       department.put(104,new Department(104,"市场部"));
       department.put(105,new Department(105,"运营部"));
       department.put(106,new Department(106,"教研部"));
       department.put(107,new Department(107,"管理部"));
   }

    //获取所有部门信息
    public Collection<Department> getAllDepartment(){
       return department.values();
    }

    //通过ID获取部门信息
    public Department getDepartmentById(int id){
       return department.get(id);
    }
}
