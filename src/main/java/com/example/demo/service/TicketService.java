package com.example.demo.service;

import com.example.demo.DTO.TicketDTO;

import java.util.List;

public interface TicketService<E> {
    List<E> findAll();

    E findById(Long id);

    E save(E e);

    void remove(Long id);

    List<E> findTicketByCondition(TicketDTO ticketDTO);
}
