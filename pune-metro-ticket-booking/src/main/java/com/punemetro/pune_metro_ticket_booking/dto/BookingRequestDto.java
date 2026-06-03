package com.punemetro.pune_metro_ticket_booking.dto;

import lombok.Data;

@Data
public class BookingRequestDto {
	
	 private Long userId;
	 private Long routeId;
	 private String sourceStation;
	 private String destinationStation;
	 private Double fare;
}