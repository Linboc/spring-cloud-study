package com.boc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.boc.springcloud.entities.Dept;
import com.boc.springcloud.services.DeptFeignService;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
    
    @Autowired
    private DeptFeignService service;
    
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("list")
    public List<Dept> list() {
        return (List<Dept>) restTemplate.getForEntity("http://MICRO-SERVICE-CLOUD-DEPT/dept/list", List.class).getBody();
    }
    
    @GetMapping("list1")
    public List<Dept> list1() {
        return service.list();
    }
    
    @GetMapping("/dept/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

}
