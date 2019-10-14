package com.boc.springcloud.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.boc.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptFeignFallbackFactory implements FallbackFactory<DeptFeignService> {

    @Override
    public DeptFeignService create(Throwable cause) {
        return new DeptFeignService() {
            
            @Override
            public List<Dept> list() {
                return null;
            }
            
            @Override
            public Dept get(Long id) {
                return new Dept().setDeptId(-1L).setDeptName("获取员工失败，因为：" + cause.getMessage());
            }
            
            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }

}
