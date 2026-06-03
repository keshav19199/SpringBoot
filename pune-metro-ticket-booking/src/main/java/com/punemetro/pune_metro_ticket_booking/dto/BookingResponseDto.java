package com.punemetro.pune_metro_ticket_booking.dto;

import java.time.LocalDateTime;

import lombok.Data;

public class BookingResponseDto {
	
	 private Long id;
	 private String sourceStation;
	 private String destinationStation;
	 private Double fare;
	 private LocalDateTime bookingTime;
	 private String ticketNumber;
}