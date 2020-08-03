package com.persistance.dao;

import java.util.List;

import com.persistance.entities.Client;

public interface IClientDao {

	public void addClient (Client c);
	public List<Client>findAll();
	public void updateClient (Client c);
	public void deleteClient (Client c);

}
