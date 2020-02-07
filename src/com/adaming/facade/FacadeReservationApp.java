package com.adaming.facade;

import java.time.LocalDate;

public class FacadeReservationApp {
	public static void main(String[] args) {
		FacadeReservation f = new FacadeReservation();
		f.reserverHotel(LocalDate.of(2020, 04, 22), LocalDate.of(2020, 05, 01));
		f.reserverAvion(LocalDate.of(2020, 04, 22), LocalDate.of(2020, 05, 01));
	}
}
