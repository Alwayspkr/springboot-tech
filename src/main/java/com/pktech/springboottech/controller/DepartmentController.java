package com.pktech.springboottech.controller;

import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import com.pktech.springboottech.entity.Department;
import com.pktech.springboottech.error.DepartmentNotFoundException;
import com.pktech.springboottech.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    private final Logger LOGGER =
            LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment( @RequestBody Department department) {
        LOGGER.info("inside fetchdepartmentlist of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/")
        public List<Department> fetchDepartmentList() {
            return departmentService.fetchDepartmentList();
        }

       @GetMapping("/departments/{id}")
        public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return departmentService.fetchDepartmentById(departmentId);
        }

        @DeleteMapping("/departments/{id}")
        public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "department deleted successfully!!";
        }

        @PutMapping("/departments/{id}")
        public String updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department){
         departmentService.updateDepartment(departmentId,department);
            return " department list updated successfully!!";
        }

        @GetMapping("/departments/name/{name}")
        public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
        }    }


