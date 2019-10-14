package com.boc.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boc.springcloud.entities.Dept;
import com.boc.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService deptService;
    
    @GetMapping("/{id}")
    @HystrixCommand(fallbackMethod = "getFallback")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.get(id);
        if (dept == null) {
            throw new RuntimeException("该员工不存在");
        }
        return dept;
    }
    
    private Dept getFallback(@PathVariable("id") Long id) {
        return new Dept().setDeptId(-1L).setDeptName("这是一个错误的员工");
    }
    
    @PostMapping
    public boolean add(Dept dept) {
        return deptService.add(dept);
    }
    
    @GetMapping("list")
    public List<Dept> list() {
        return deptService.list();
    }
    
}












