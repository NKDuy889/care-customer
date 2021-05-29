package com.example.demo.service;

import com.example.demo.DTO.DepartmentDTO;
import com.example.demo.DTO.TicketDTO;

import java.util.List;

public interface DepartmentService<E> {
    List<E> findAll();

    E findById(Long id);

    E save(E e);

    void remove(Long id);

    List<E> findDepartmentByCondition(DepartmentDTO departmentDTO);
}
