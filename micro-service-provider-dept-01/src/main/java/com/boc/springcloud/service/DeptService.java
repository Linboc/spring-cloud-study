package com.boc.springcloud.service;

import java.util.List;

import com.boc.springcloud.entities.Dept;

public interface DeptService {
    
    public boolean add(Dept dept);
    
    public Dept get(Long deptId);
    
    public List<Dept> list(); 

}
