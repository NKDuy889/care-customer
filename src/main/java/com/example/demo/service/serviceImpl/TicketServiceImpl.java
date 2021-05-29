package com.example.demo.service.serviceImpl;

import com.example.demo.DTO.TicketDTO;
import com.example.demo.model.Ticket;
import com.example.demo.repository.TicketRepo;
import com.example.demo.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService<Ticket> {
    @Autowired
    private TicketRepo ticketRepo;

    @Override
    public List<Ticket> findAll() {
        return ticketRepo.findAll();
    }

    @Override
    public Ticket findById(Long id) {
        return ticketRepo.findById(id).get();
    }

    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepo.save(ticket);
    }

    @Override
    public void remove(Long id) {
        ticketRepo.deleteById(id);
    }

    @Override
    public List<Ticket> findTicketByCondition(TicketDTO ticketDTO) {
        return ticketRepo.findTicketByCondition(ticketDTO);
    }
}
