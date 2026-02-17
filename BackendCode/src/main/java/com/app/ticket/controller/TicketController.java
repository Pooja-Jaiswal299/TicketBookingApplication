package com.app.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ticket.model.Ticket;
import com.app.ticket.service.TicketService;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {
	@Autowired
	private TicketService ticketService;
	
	//retrive all tickets
	@GetMapping(value = "/all")
	public Iterable<Ticket> getAllTickets() {
		return ticketService.getAllTickets();
		
	}
	
	//retrive single ticket
	@GetMapping(value = "/{ticketId}")
	public Ticket getTicket(@PathVariable("ticketId")Integer ticketId) {
		return ticketService.getTicket(ticketId);
		
	}
	
	//create ticket
	@PostMapping(value = "/create")
	public Ticket createTicket(@RequestBody Ticket inputObj) {
		return ticketService.createTicket(inputObj);
		
	}
	
	//update ticket
	@PutMapping(value = "/{tiketId}/{newEmail}")
	public Ticket updateTicket(@PathVariable("tiketId") Integer ticketId,@PathVariable("newEmail") String newEmail) {
		return ticketService.updateTicket(ticketId, newEmail);
		
		
	}
	//delete ticket
	@DeleteMapping(value = "/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId")Integer ticketId) {
		ticketService.deleteTicket(ticketId);
		
	}

}
