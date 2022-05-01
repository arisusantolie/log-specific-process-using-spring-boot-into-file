package com.arisusantolie.springboot.logprocess.controller;

import com.arisusantolie.springboot.logprocess.dto.CreateEmployeeDTO;
import com.arisusantolie.springboot.logprocess.model.Employee;
import com.arisusantolie.springboot.logprocess.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

/*
Credit By : Ari Susanto Lie
website : https://arisusantolie.my.id
 */

@RestController
@RequestMapping("process")
public class ProcessController {

    @Autowired
    ProcessService processService;

    @PostMapping("employee")
    public Employee createNewEmployee(@RequestBody CreateEmployeeDTO requestPayload) throws FileNotFoundException {
        return processService.createNewEmployee(requestPayload);
    }
}
