package com.codeBuffer.CodeBuffer.controller;

import com.codeBuffer.CodeBuffer.entity.Department;
import com.codeBuffer.CodeBuffer.service.DepartmentService;
import com.codeBuffer.CodeBuffer.service.DepartmentServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// this is where all the functionalities are

@RestController
public class DepartmentController {
    // create services and repository on their package
    @Autowired
    private DepartmentService departmentService;
    // saving into the department
    // added valis to make sure its validated

    // adding the loggers
        private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
        @PostMapping("/departments")
        public Department saveDepartment( @Valid @RequestBody Department department){
            LOGGER.info(("inside saveDepartment of DepartmentController"));
            return departmentService.saveDepartment(department);
        }

        // fetching department
        @GetMapping("/departments")
        public List<Department> fetchDepartmentList(){
            return departmentService.fetchDepartmentList();
        }
        // fetching department by id
    // use path variable to map the Ids to each other
        @GetMapping("/departments/{id}")
        public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
              return departmentService.fetchDepartmentById(departmentId);
        }
// deleting from the database by mapping
    @DeleteMapping("/departments/{id}")
        public String deleteDepartmentById(@PathVariable("id") Long departmentId){
              // the method has a data type that is why we are returning that sentence
              departmentService.deleteDepartmentById(departmentId);
              return "Department deleted successfully";
        }

        // put mapping is used for update so we get the path variable for the id and request body to update with the new values present

    @PutMapping("/departments/{id}")
        public Department updateDepartment(@PathVariable("id") Long departmentId , @RequestBody Department department){
             return  departmentService.updateDepartment(departmentId, department);
        }
        // to fetch the department by name
    @GetMapping("/departments/name/{name}")
        public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
              return departmentService.fetchDepartmentByName(departmentName);
        }
    }

