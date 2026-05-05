package com.metro.Ticket_Booking.Service;

import java.util.List;

import com.metro.Ticket_Booking.Entity.Ticket;

public interface TicketService {
	
	Ticket bookTicket(Ticket ticket);
	List<Ticket> getAllTicket();
	List<Ticket> getTicketByUser(Long userId);

}
