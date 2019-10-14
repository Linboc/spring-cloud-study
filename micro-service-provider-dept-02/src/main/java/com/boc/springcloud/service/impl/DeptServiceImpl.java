package com.boc.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boc.springcloud.entities.Dept;
import com.boc.springcloud.mapper.DeptMapper;
import com.boc.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    
    @Override
    public boolean add(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Long deptId) {
        return deptMapper.findById(deptId);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }

}
