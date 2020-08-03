package com.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import com.persistance.dao.ClientDaoImp;
import com.persistance.entities.Client;

@ManagedBean
public class ClientManagedBean {
	Client c = new Client();
	Client selectedclt = new Client();
	ClientDaoImp clientdao= new ClientDaoImp();
	List<Client> listClt;
	
	
	public Client getSelectedclt() {
		return selectedclt;
	}
	public void setSelectedclt(Client selectedclt) {
		this.selectedclt = selectedclt;
	}
	public List<Client> getListClt() {
	 listClt= clientdao.findAll();
		return listClt;
	}
	public void setListClt(List<Client> listClt) {
		this.listClt = listClt;
	}
	public Client getC() {
		return c;
	}
	public void setC(Client c) {
		this.c = c;
	}
	public ClientDaoImp getClientdao() {
		return clientdao;
	}
	public void setClientdao(ClientDaoImp clientdao) {
		this.clientdao = clientdao;
	}
	
public void ajouter (ActionEvent e){
	clientdao.addClient(c);
}
	
public void modifier (ActionEvent e){
	clientdao.updateClient(selectedclt);
	
}
public void supprimer (ActionEvent e){
	clientdao.deleteClient(selectedclt);
}

	public String Editer(){
		return "modif";
	}
}
