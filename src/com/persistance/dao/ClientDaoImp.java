package com.persistance.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.persistance.entities.Client;

public class ClientDaoImp implements IClientDao {

	@Override
	public void addClient(Client c) {
		// TODO Auto-generated method stub
		Session s= Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		s.save(c);
		tx.commit();
		s.close();
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		Session s= Dbsession.getSessionFactory().openSession();
		List<Client> listclient=s.createQuery("from Client").list();
		s.close();
		return listclient;
		
	}

	@Override
	public void updateClient(Client c) {
		// TODO Auto-generated method stub
		
		Session s= Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		s.update(c);
		tx.commit();
		s.close();
	}

	@Override
	public void deleteClient(Client c) {
		// TODO Auto-generated method stub
		Session s= Dbsession.getSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		s.delete(c);
		tx.commit();
		s.close();
	}

}
