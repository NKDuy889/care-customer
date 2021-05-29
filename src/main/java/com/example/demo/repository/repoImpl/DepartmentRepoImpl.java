package com.example.demo.repository.repoImpl;

import com.example.demo.DTO.DepartmentDTO;
import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DepartmentRepoImpl implements DepartmentRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Department> findTicketByCondition(DepartmentDTO departmentDTO) {
        StringBuilder sql = new StringBuilder();
        sql.append("from Department where 1 = 1 ");
        if(departmentDTO.getName() != null && !"".equals(departmentDTO.getName().trim())){
            sql.append(" and name like '%").append(departmentDTO.getName()).append("%'");
        }
        return entityManager.createQuery(sql.toString()).getResultList();
    }
}
