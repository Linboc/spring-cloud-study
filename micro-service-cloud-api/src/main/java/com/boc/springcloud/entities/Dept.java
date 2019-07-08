package com.boc.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptId;
    
    private String deptName;
    
    private String dbSource;
    
}
