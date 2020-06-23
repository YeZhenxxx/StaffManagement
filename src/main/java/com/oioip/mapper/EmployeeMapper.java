package com.oioip.mapper;

import com.oioip.poji.Department;
import com.oioip.poji.Employee;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.*;

/**
 * 员工持久层
 * @author Administrator
 */
@Repository("employeeMapper")
public class EmployeeMapper {
    //模拟数据库中的数据
    private static Map<Integer, Employee> employee=new HashMap<>();
    //模拟员工Id自增长
    private static Integer initId=1008;
    //员工有所属的部门
    @Resource(name = "departmentMapper")
    private DepartmentMapper departmentMapper;

    //初始化数据
    static {
        employee.put(101,new Employee(1001,"aa","6032508@qq.com",1,new Date(),new Department(101,"教学部")));
        employee.put(102,new Employee(1002,"bb","26341362@qq.com",0,new Date(),new Department(102,"后勤部")));
        employee.put(103,new Employee(1003,"cc","62434543@qq.com",0,new Date(),new Department(103,"销售部")));
        employee.put(104,new Employee(1004,"dd","73251415@qq.com",1,new Date(),new Department(104,"市场部")));
        employee.put(105,new Employee(1005,"ee","346356127@qq.com",0,new Date(),new Department(105,"运营部")));
        employee.put(106,new Employee(1006,"ff","2654224832@qq.com",1,new Date(),new Department(106,"教研部")));
        employee.put(107,new Employee(1007,"gg","275482672@qq.com",1,new Date(),new Department(107,"管理部")));
    }

    //添加一个员工
    public void saveEmp(Employee emp){
        //判断ID是否为空
        if (emp.getId()==null){
            emp.setId(initId++);
        }else {
            //判断ID是否存在
            if (employee.containsKey(emp.getId())){
                emp.setId(initId++);
            }
        }
        //根据员工的部门编号获取部门信息
        emp.setDepartment(departmentMapper.getDepartmentById(emp.getDepartment().getId()));
        //
        employee.put(emp.getId(),emp);
    }

    //查询所有员工信息
    public Collection<Employee> getAllEmployee(){
        return employee.values();
    }

    //通过ID查询员工
    public Employee getEmployeeById(int Id){
        return employee.get(initId);
    }

    //根据ID删除员工
    public void delEmployeeById(int id){
        employee.remove(id);
    }

}
