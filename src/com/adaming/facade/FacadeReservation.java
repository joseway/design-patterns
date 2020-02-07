package com.adaming.facade;

import java.time.LocalDate;
import java.util.List;

public class FacadeReservation {
	private ReservationHotel hotels = new ReservationHotel();
	private ReservationAvion vols = new ReservationAvion();
	
	public List<Hotel> reserverHotel(LocalDate a, LocalDate d){
		return hotels.reserverHotel(a, d);
	}
	public List<Avion> reserverAvion(LocalDate d, LocalDate r){
		return vols.reserverAvion(d, r);
	}
}
