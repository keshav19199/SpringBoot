package com.punemetro.pune_metro_ticket_booking.dto;

import lombok.Data;

@Data
public class StationDto {
	
	 private String stationName;
	 private String stationCode;
	 private String lineName;
	 private Double distanceFromStart;

}
