package com.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import com.persistance.dao.HotelDaoImp;
import com.persistance.entities.Hotel;

@ManagedBean
public class HotelManagedBean {
	Hotel h= new Hotel();
	Hotel selelctedHotel= new Hotel();
	HotelDaoImp hoteldao = new HotelDaoImp();
	List<Hotel> listhtl;
	public Hotel getH() {
		return h;
	}
	public void setH(Hotel h) {
		this.h = h;
	}
	public Hotel getSelelctedHotel() {
		return selelctedHotel;
	}
	public void setSelelctedHotel(Hotel selelctedHotel) {
		this.selelctedHotel = selelctedHotel;
	}
	public HotelDaoImp getHoteldao() {
		return hoteldao;
	}
	public void setHoteldao(HotelDaoImp hoteldao) {
		this.hoteldao = hoteldao;
	}
	public List<Hotel> getListhtl() {
		listhtl=hoteldao.findAll();
		return listhtl;
	}
	public void setListhtl(List<Hotel> listhtl) {
		this.listhtl = listhtl;
	}
	public void ajouter (ActionEvent e){
		hoteldao.addHotel(h);
	}
public void modifier (ActionEvent e){
	hoteldao.updateHotel(selelctedHotel);
}
public void supprimer (ActionEvent e){
	hoteldao.deleteHotel(selelctedHotel);
}
public String Editer(){
	return "modifH";
}
	

}
