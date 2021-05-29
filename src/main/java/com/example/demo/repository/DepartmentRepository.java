package com.example.demo.repository;

import com.example.demo.DTO.DepartmentDTO;
import com.example.demo.model.Department;

import java.util.List;

public interface DepartmentRepository {
    List<Department> findTicketByCondition(DepartmentDTO departmentDTO);
}
