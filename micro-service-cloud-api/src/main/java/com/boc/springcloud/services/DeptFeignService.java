package com.boc.springcloud.services;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.boc.springcloud.entities.Dept;

@FeignClient(value = "MICRO-SERVICE-CLOUD-DEPT", fallbackFactory = DeptFeignFallbackFactory.class)
public interface DeptFeignService {

    @GetMapping("/dept/{id}")
    public Dept get(@PathVariable("id") Long id);
    
    @PostMapping("/dept")
    public boolean add(Dept dept);
    
    @GetMapping("/dept/list")
    public List<Dept> list();
    
    
}

