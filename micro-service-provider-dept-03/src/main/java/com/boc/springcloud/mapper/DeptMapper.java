package com.boc.springcloud.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.boc.springcloud.entities.Dept;

public interface DeptMapper {
    
    boolean addDept(Dept dept);
    
    Dept findById(Long deptId);
    
    List<Dept> findAll(); 

}
