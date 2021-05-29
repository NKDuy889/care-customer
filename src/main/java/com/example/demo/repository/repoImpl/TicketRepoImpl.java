package com.example.demo.repository.repoImpl;

import com.example.demo.DTO.TicketDTO;
import com.example.demo.model.Ticket;
import com.example.demo.repository.TicketRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TicketRepoImpl implements TicketRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Ticket> findTicketByCondition(TicketDTO ticketDTO) {
        StringBuilder sql = new StringBuilder();
        sql.append("from Ticket where 1 = 1 ");
        if(ticketDTO.getPhoneNumber() != null && !"".equals(ticketDTO.getPhoneNumber().trim())){
            sql.append(" and phone_number like '%").append(ticketDTO.getPhoneNumber()).append("%'");
        }
        if(ticketDTO.getTicketId() != null && !"".equals(ticketDTO.getTicketId().trim())){
            sql.append(" and ticket_id like '%").append(ticketDTO.getTicketId()).append("%'");
        }
        if(ticketDTO.getIdDepartment() != null && !"".equals(ticketDTO.getIdDepartment().trim())){
            sql.append(" and id_department like '%").append(ticketDTO.getIdDepartment()).append("%'");
        }
        if(ticketDTO.getReceptionTime() != null && !"".equals(ticketDTO.getReceptionTime().trim()) &&
            ticketDTO.getProcessingTime() != null && !"".equals(ticketDTO.getProcessingTime().trim())){
            sql.append(" and date between " + ticketDTO.getReceptionTime() + " and " + ticketDTO.getProcessingTime());
        }
        return entityManager.createQuery(sql.toString()).getResultList();
    }
}
