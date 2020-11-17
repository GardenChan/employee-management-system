package com.myharbour.ems_thymeleaf.controller;

import com.myharbour.ems_thymeleaf.entity.Emp;
import com.myharbour.ems_thymeleaf.service.EmpService;
import com.myharbour.ems_thymeleaf.service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @PostMapping("/update")
    public String update(Emp emp){
        empService.update(emp);
        return "redirect:/emp/findAll";
    }

    //id查询员工信息
    @GetMapping("/find")
    public String find(String id,Model model){
        Emp emp = empService.find(id);
        model.addAttribute("emp",emp);
        return "/ems/updateEmp";
    }

    //保存员工信息
    @PostMapping("/save")
    public String save(Emp emp){
        empService.save(emp);
        return "redirect:/emp/findAll";
    }

    //查询所有
    @GetMapping("/findAll")
    public String findAll(Model model){
        List<Emp> emps = empService.findAll();
        model.addAttribute("emps",emps);
        return "/ems/emplist";
    }
    //删除员工
    @GetMapping("/delete")
    public String delete(String id){
        empService.delete(id);
        return "redirect:/emp/findAll";
    }
}
