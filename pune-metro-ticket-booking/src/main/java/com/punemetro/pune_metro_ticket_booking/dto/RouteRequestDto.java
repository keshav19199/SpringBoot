package com.punemetro.pune_metro_ticket_booking.dto;

import lombok.Data;

@Data
public class RouteRequestDto {
	
    private Long sourceStationId;
    private Long destinationStationId;
    private Double distance;
    private Double fare;
}