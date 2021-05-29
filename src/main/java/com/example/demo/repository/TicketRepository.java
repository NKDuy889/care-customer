package com.example.demo.repository;

import com.example.demo.DTO.TicketDTO;
import com.example.demo.model.Ticket;

import java.util.List;

public interface TicketRepository {
    List<Ticket> findTicketByCondition(TicketDTO ticketDTO);
}
