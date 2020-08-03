package com.persistance.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.persistance.entities.Reservation;

public class ReservationDaoImp implements IReservationDao{

	@Override
	public void addHotel(Reservation r) {
		// TODO Auto-generated method stub
		Session s= Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		s.save(r);
		tx.commit();
		s.close();
	}

	@Override
	public List<Reservation> findAll() {
		// TODO Auto-generated method stub
		Session s= Dbsession.getSessionFactory().openSession();
        List<Reservation> listreservation =s.createQuery("from Reservation").list(); 
        s.close();
		return listreservation;
	}

	@Override
	public void updateReservation(Reservation r) {
		// TODO Auto-generated method stub
		Session s= Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		s.update(r);
		tx.commit();
		s.close();
	}

	@Override
	public void deleteReservation(Reservation r) {
		// TODO Auto-generated method stub
		Session s= Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		s.delete(r);
		tx.commit();
		s.close();
	}

}
