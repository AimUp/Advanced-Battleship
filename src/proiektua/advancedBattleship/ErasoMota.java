package proiektua.advancedBattleship;

import proiektua.salbuespenak.Hondoratua;

public abstract class ErasoMota {

	private String izena;
	private int prezioa;
	
	public ErasoMota(String pIzena, int pPrezioa){
		izena = pIzena;
		prezioa=pPrezioa;
	}
	
	public int getPrezioa(){
		return prezioa;
	}
	
	public String getIzena(){
		return izena;
	}
	
	public abstract String informazioaInprimatu();
	public abstract boolean erasoaEgin(int zut, int err) throws Hondoratua;
}
 