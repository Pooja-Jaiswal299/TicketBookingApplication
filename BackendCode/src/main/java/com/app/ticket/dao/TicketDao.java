package com.app.ticket.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.ticket.model.Ticket;

@Repository  //db connection automatically- read property file
public interface TicketDao extends CrudRepository<Ticket, Integer> {
	//save,finadall,findbyid,save,deletebyid by default available no need to write 

}
