package com.example.demo.service.serviceImpl;
import com.example.demo.DTO.DepartmentDTO;
import com.example.demo.model.Department;
import com.example.demo.repository.DerpartmentRepo;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService<Department> {
    @Autowired
    private DerpartmentRepo derpartmentRepo;

    @Override
    public List<Department> findAll() {
        return derpartmentRepo.findAll();
    }

    @Override
    public Department findById(Long id) {
        return derpartmentRepo.findById(id).get();
    }

    @Override
    public Department save(Department department) {
        return derpartmentRepo.save(department);
    }

    @Override
    public void remove(Long id) {
        derpartmentRepo.deleteById(id);
    }

    @Override
    public List<Department> findDepartmentByCondition(DepartmentDTO departmentDTO) {
        return derpartmentRepo.findTicketByCondition(departmentDTO);
    }
}
