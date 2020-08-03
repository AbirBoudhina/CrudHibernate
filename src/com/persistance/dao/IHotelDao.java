package com.persistance.dao;

import java.util.List;

import com.persistance.entities.Hotel;


public interface IHotelDao {

	public void addHotel (Hotel h);
	public List<Hotel>findAll();
	public void updateHotel (Hotel h);
	public void deleteHotel (Hotel h);

}
