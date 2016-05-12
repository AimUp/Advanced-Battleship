package proiektua.advancedBattleship;

import java.util.Observer;

import proiektua.salbuespenak.EzinKokatu;
import proiektua.salbuespenak.HasierakoakJarrita;
import proiektua.salbuespenak.Hondoratua;
import proiektua.salbuespenak.PartidaGaldu;

public class Jokalaria {

	private int dirua;
	private String izena;
	private ListaErasoMota listaErasoak;
	private Tableroa jokalariTableroa;
	private HasierakoTableroaBuilder builder;
	
	public Jokalaria(String pIzena){
		builder = new HasierakoTableroaBuilder();
		izena = pIzena;
		dirua = 0; 	//Hasierako diru kantitatea
		listaErasoak = new ListaErasoMota();
		jokalariTableroa = new Tableroa();
	}
	
	public void erosketaGorde(ErasoMota em){
		dirua = dirua - em.getPrezioa();
		listaErasoak.erasoaGehitu(em);
	}
	
	public boolean diruNahikoa(int pKostua){
		if(dirua>pKostua) return true;
		else return false;
	}
	
	public boolean erasoEgin(int x, int y, ErasoMota em){
		boolean jo = false;
		try {
			jo = em.erasoaEgin(x, y);
		} catch (Hondoratua e) {
			jo = true;
			dirua = dirua+10;
		}
		return jo;
	}
	
	public boolean erasoaJaso(int x, int y) throws Hondoratua{
		try {
			return jokalariTableroa.erasoaJaso(x,y);
		} catch (Hondoratua e) {
			listaErasoak.erasoaKendu(jokalariTableroa.posIbilgailua(x, y));
			try{
				if(listaErasoak.tamaina()<=0){
					{throw new PartidaGaldu(this);}
				} 
			}catch (PartidaGaldu e1) {
				e1.partidaBukatu();
			}
			{throw new Hondoratua();}
		}
	}

	public String getIzena() {
		return izena;
	}
	
	public ListaErasoMota getErasoMotak(){
		return listaErasoak;
	}
	
	public double getDirua(){
		return dirua;
	}
	
	public boolean itsaspekoErasoaJaso(int x, int y) throws Hondoratua{
		try {
			return jokalariTableroa.itsaspekoErasoaJaso(x,y);
		} catch (Hondoratua e) {
			listaErasoak.erasoaKendu(jokalariTableroa.posIbilgailua(x, y));
			try{
				if(listaErasoak.tamaina()<=0){
					{throw new PartidaGaldu(this);}
				} 
			}catch (PartidaGaldu e1) {
				e1.partidaBukatu();
			}
			{throw new Hondoratua();}
		}
	}
	
	public void uavErasoa(int zut, int err){
		jokalariTableroa.uavErasoa(zut, err);
	}
	
	public void hasierakoErasoakKokatu(ItsasoIbilgailua i, char c, int x, int y) throws EzinKokatu, HasierakoakJarrita{
		try {
			builder.erasoaGehitu(i, c, x, y);
			jokalariTableroa.setIbilgailuMatrizea(builder.getMatrizea());
			listaErasoak = builder.getListaErasoak();
		} catch (HasierakoakJarrita e) {
			{throw new HasierakoakJarrita();}
		}
	}
	
	public void tablerokoObserverra(Observer o){
		jokalariTableroa.addObserver(o);
	}
}
