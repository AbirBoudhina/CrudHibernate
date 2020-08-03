package com.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import com.persistance.dao.ReservationDaoImp;
import com.persistance.entities.Reservation;

@ManagedBean
public class ReservationManagedBean {

	Reservation r= new Reservation();
	Reservation selectedreservation= new Reservation();
	List<Reservation> listreserv ;
	ReservationDaoImp reservadao= new ReservationDaoImp();
	
	public Reservation getR() {
		return r;
	}
	public void setR(Reservation r) {
		this.r = r;
	}
	public Reservation getSelectedreservation() {
		return selectedreservation;
	}
	public void setSelectedreservation(Reservation selectedreservation) {
		this.selectedreservation = selectedreservation;
	}
	public List<Reservation> getListreserv() {
		listreserv= reservadao.findAll();
		return listreserv;
	}
	public void setListreserv(List<Reservation> listreserv) {
		this.listreserv = listreserv;
	}
	public ReservationDaoImp getReservadao() {
		return reservadao;
	}
	public void setReservadao(ReservationDaoImp reservadao) {
		this.reservadao = reservadao;
	}
	public void ajouter (ActionEvent e){
		reservadao.addHotel(r);
	}
	public void modifier (ActionEvent e){
		reservadao.updateReservation(selectedreservation);
	}
	public void supprimer (ActionEvent e){
		reservadao.deleteReservation(selectedreservation);
	}
	public String Editer () {
		return "modifR";
	}
}
