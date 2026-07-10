package com.cognizant.spring_learn.controller;

import java.util.ArrayList;
import com.cognizant.spring_learn.model.Department;
import com.cognizant.spring_learn.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public ArrayList<Department> getAllDepartments() {
        LOGGER.info("Start getAllDepartments() method - Department REST service called");
        ArrayList<Department> departments = departmentService.getAllDepartments();
        LOGGER.info("End getAllDepartments() method");
        return departments;
    }
}
