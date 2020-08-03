package com.persistance.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.persistance.entities.Hotel;

public class HotelDaoImp implements IHotelDao{

	@Override
	public void addHotel(Hotel h) {
		// TODO Auto-generated method stub
		Session s= Dbsession.getSessionFactory().openSession();
		Transaction tx= s.beginTransaction();
		s.save(h);
		tx.commit();
		s.close();
		
	}

	@Override
	public List<Hotel> findAll() {
		// TODO Auto-generated method stub
		Session s= Dbsession.getSessionFactory().openSession();
		List<Hotel> listhotel =s.createQuery("from Hotel").list();
		s.close();
		return listhotel;
	}

	@Override
	public void updateHotel(Hotel h) {
		// TODO Auto-generated method stub
		Session s= Dbsession.getSessionFactory().openSession();
		Transaction tx= s.beginTransaction();
		s.update(h);
		tx.commit();
		s.close();
		
	}

	@Override
	public void deleteHotel(Hotel h) {
		// TODO Auto-generated method stub
		Session s= Dbsession.getSessionFactory().openSession();
		Transaction tx= s.beginTransaction();
		s.delete(h);
		tx.commit();
		s.close();
		
		
	}
	

}
