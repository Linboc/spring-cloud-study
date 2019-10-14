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

@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService deptService;
    
    @GetMapping("/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
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












