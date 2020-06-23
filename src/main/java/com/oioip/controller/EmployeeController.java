package com.oioip.controller;

import com.oioip.mapper.EmployeeMapper;
import com.oioip.poji.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * 员工 controller
 * @author Administrator
 */
@Controller
@RequestMapping("/emp")
public class EmployeeController {
    @Resource(name = "employeeMapper")
    private EmployeeMapper em;

    @RequestMapping("/findAll")
    public ModelAndView findAllEmp(){
        ModelAndView mv=new ModelAndView();
        Collection<Employee> allEmployee = em.getAllEmployee();
        mv.addObject("emps",allEmployee);
        mv.setViewName("emp/list");
        return mv;
    }
}
