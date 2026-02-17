package com.app.ticket;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.ticket.model.Ticket;
import com.app.ticket.service.TicketService;

@SpringBootApplication
public class BackendCodeApplication implements CommandLineRunner {
	@Autowired
	private TicketService ticketService;

	public static void main(String[] args) {
		SpringApplication.run(BackendCodeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Ticket input = new Ticket();
		input.setPassengerName("pooja");
		input.setSourceStation("wardha");
		input.setDestinationStation("pune");
		input.setTravelDate(new Date());
		input.setEmail("pooja@gmail.com");
		ticketService.createTicket(input);
		
	}

}
