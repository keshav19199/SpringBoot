package com.punemetro.pune_metro_ticket_booking.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "routes")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Route {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
	private List<Booking> bookings;

	private String routeName;

	@ManyToOne
	@JoinColumn(name = "source_station_id")
	private Station sourceStation;

	@ManyToOne
	@JoinColumn(name = "destination_station_id")
	private Station destinationStation;

	private Double totalDistance;

	private Integer estimatedTime;
}
