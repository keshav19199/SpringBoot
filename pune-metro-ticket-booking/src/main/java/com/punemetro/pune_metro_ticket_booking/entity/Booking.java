package com.punemetro.pune_metro_ticket_booking.entity;

import java.time.LocalDateTime;

//import com.punemetro.pune_metro_ticket_booking.enums.BookingStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bookings")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private String sourceStation;

    private String destinationStation;

    @ManyToOne
    private Route route;

    private Double fare;

    private LocalDateTime bookingTime;

    private String ticketNumber;

//    @Enumerated(EnumType.STRING)
//    private BookingStatus status;
}