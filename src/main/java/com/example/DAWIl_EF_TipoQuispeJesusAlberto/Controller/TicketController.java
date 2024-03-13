package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Ticket;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service.TicketService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/ticket")
public class TicketController {

	@Autowired
	TicketService service;
	
	
	@GetMapping
    public List<Ticket> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Ticket findById(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @GetMapping(params = "title")
    public List<Ticket> findByTitle(@RequestParam("title") String title) {
        return service.findByTitle(title);
    }

    @PostMapping()
    public Ticket save(@RequestBody Ticket ticket) {
    	System.out.println("Received ticket: " + ticket); 
        return service.save(ticket);
    }

    @PutMapping("/{id}")
    public Ticket update(@PathVariable("id") int id, @RequestBody Ticket ticket) {
    	ticket.setTicketId(id);
        return service.save(ticket);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
        service.deleteById(id);
    }
}
