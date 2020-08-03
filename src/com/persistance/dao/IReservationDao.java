package com.persistance.dao;

import java.util.List;

import com.persistance.entities.Reservation;


public interface IReservationDao {
	public void addHotel (Reservation r);
	public List<Reservation>findAll();
	public void updateReservation (Reservation r);
	public void deleteReservation (Reservation r);


}
