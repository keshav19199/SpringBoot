package com.punemetro.pune_metro_ticket_booking.dto;

import lombok.Data;

@Data
public class RouteResponseDto {
	
    private Long id;
    private String sourceStation;
    private String destinationStation;
    private Double distance;
    private Double fare;
}