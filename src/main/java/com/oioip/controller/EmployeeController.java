package com.oioip.controller;

import com.oioip.mapper.DepartmentMapper;
import com.oioip.mapper.EmployeeMapper;
import com.oioip.poji.Department;
import com.oioip.poji.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/**
 * 员工 controller
 * @author Administrator
 */
@Controller
@RequestMapping("/emp")
public class EmployeeController {
    @Resource(name = "employeeMapper")
    private EmployeeMapper em;

    @Resource(name = "departmentMapper")
    private DepartmentMapper dm;

    @RequestMapping("/findAll")
    public ModelAndView findAllEmp(){
        ModelAndView mv=new ModelAndView();
        Collection<Employee> allEmployee = em.getAllEmployee();
        mv.addObject("emps",allEmployee);
        mv.setViewName("emp/list");
        return mv;
    }

    @PostMapping("/save")
    public String save(Employee emp){
        em.saveEmp(emp);
        return "redirect:/emp/findAll";
    }

    @GetMapping("/toEmpPage/{page}")
    public ModelAndView toAddPage(@PathVariable String page){
        ModelAndView mv=new ModelAndView();
        if (page.equals("add")){
            Collection<Department> allDepartment = dm.getAllDepartment();
            mv.addObject("dept",allDepartment);
            mv.setViewName("emp/"+page);
            return mv;
        }else {
            mv.setViewName("emp/"+page);
            return mv;
        }
    }
}
