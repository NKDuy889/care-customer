package com.example.demo.controller;

import com.example.demo.model.Department;
import com.example.demo.model.Ticket;
import com.example.demo.repository.repoImpl.TicketRepoImpl;
import com.example.demo.service.TicketService;
import com.example.demo.service.serviceImpl.DepartmentServiceImpl;
import com.example.demo.service.serviceImpl.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketServiceImpl ticketService;

    @GetMapping("")
    public ResponseEntity<List<Ticket>> showAll() {
        List<Ticket> ticket = ticketService.findAll();
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    private ResponseEntity<Ticket> getDepartment(@PathVariable("id") Long id) {
        Ticket ticket = ticketService.findById(id);
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }
    @GetMapping(value = "/view/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ticket> view(@PathVariable Long id) {
        Ticket ticket = ticketService.findById(id);
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Ticket> create(@RequestBody Ticket ticket) {
        ticketService.save(ticket);
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }

    @PostMapping("/edit")
    public ResponseEntity<Ticket> edit( @RequestBody Ticket ticket) {
        ticketService.save(ticket);
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Ticket> delete(@PathVariable Long id) {
        ticketService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
