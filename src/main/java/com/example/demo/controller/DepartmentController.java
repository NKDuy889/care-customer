package com.example.demo.controller;

import com.example.demo.DTO.DepartmentDTO;
import com.example.demo.model.Department;
import com.example.demo.service.serviceImpl.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentServiceImpl departmentService;

    @GetMapping("")
    public ResponseEntity<List<Department>> showAll() {
        List<Department> departmentList = departmentService.findAll();
        return new ResponseEntity<>(departmentList, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    private ResponseEntity<Department> getDepartment(@PathVariable("id") Long id) {
        Department department = departmentService.findById(id);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }
    @GetMapping(value = "/view/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Department> view(@PathVariable Long id) {
        Department department = departmentService.findById(id);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Department> create(@RequestBody Department department) {
        departmentService.save(department);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

    @PostMapping("/edit")
    public ResponseEntity<Department> edit( @RequestBody Department department) {
        departmentService.save(department);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Department> delete(@PathVariable Long id) {
        departmentService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/search")
    public ResponseEntity<List<Department>> search(@RequestBody DepartmentDTO departmentDTO) {
        List<Department> departmentList = departmentService.findDepartmentByCondition(departmentDTO);
        return new ResponseEntity<>(departmentList, HttpStatus.OK);
    }
}
