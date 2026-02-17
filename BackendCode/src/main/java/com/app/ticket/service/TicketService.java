package com.app.ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ticket.dao.TicketDao;
import com.app.ticket.model.Ticket;

@Service
public class TicketService {
	@Autowired
	private TicketDao ticketDao;
	
	//retrive all tickets
	public Iterable<Ticket> getAllTickets() {
		return ticketDao.findAll();
		
	}
	
	//retrive singe ticket
	public Ticket getTicket(Integer ticketId) {
		return ticketDao.findById(ticketId).orElse(new Ticket());
		
		
	}
	
	//create ticket
	public Ticket createTicket(Ticket inputObj) {
		
		return ticketDao.save(inputObj);
		
	}
	
	//update ticket when i book only update sms,mobno,email
	public Ticket updateTicket(Integer ticketId,String newEmail) {
		//1st id should know
		Ticket dbObj= getTicket(ticketId);
		dbObj.setEmail(newEmail);
		return ticketDao.save(dbObj);
		//save update ticket set email= newemail where ticketid=ticketid;
		
	}
	
	//delete ticket
	public void deleteTicket(Integer ticketId) {
		ticketDao.deleteById(ticketId);
	}

}
