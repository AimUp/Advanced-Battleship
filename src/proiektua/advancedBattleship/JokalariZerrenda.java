package proiektua.advancedBattleship;

import proiektua.salbuespenak.DirurikEz;
import proiektua.salbuespenak.EzinKokatu;
import proiektua.salbuespenak.HasierakoakJarrita;
import proiektua.salbuespenak.Hondoratua;

import java.util.Observable;
import java.util.Observer;

public class JokalariZerrenda extends Observable{
	
	private static JokalariZerrenda nJokalariZerrenda = null;
	private Jokalaria[] lista;
	private int unekoJok = -1;
	
	private JokalariZerrenda(){
		int jokalariKopurua = 2;
		lista = new Jokalaria[jokalariKopurua];
	}
	
	public static JokalariZerrenda getJokalariZerrenda(){
		if(nJokalariZerrenda==null){
			nJokalariZerrenda = new JokalariZerrenda();
		}
		return nJokalariZerrenda;
	}
	
	public void erasoaErosi(int em, int pos)throws DirurikEz{
		Denda.getDenda().erosi(lista[pos], em);
	}
	
	public boolean erasoaBurutu(int x, int y,ErasoMota em, int jokPos){
		return lista[jokPos].erasoEgin(x, y, em);
	}
	
	public boolean erasoaEgin(int x, int y, int jokPos) throws Hondoratua{
		return lista[jokPos].erasoaJaso(x, y);
	}
	
	public int luzera(){
		return lista.length;
	}
	
	public void jokalariaGehitu(Jokalaria pJok, int pPos){
		lista[pPos] = pJok;
	}
	
	public String getJokalariarenIzena(int pPos){
		return lista[pPos].getIzena();
	}

	public boolean itsaspekoErasoaEgin(int x, int y, int erasoJok) throws Hondoratua{
		return lista[erasoJok].itsaspekoErasoaJaso(x,y);
	}
	
	public void uavErasoa(int zut, int err,int jokPos){
		lista[jokPos].uavErasoa(zut, err);
	}
	
	public void hasierakoErasoaKokatu(ItsasoIbilgailua i, char c, int x, int y, int jokPos) throws EzinKokatu, HasierakoakJarrita{
		lista[jokPos].hasierakoErasoakKokatu(i, c, x, y);
	}
	
	public void hasierakoa(){
		unekoJok++;
		if(unekoJok<=lista.length-1){
			setChanged();
			notifyObservers(unekoJok);
		}
		else{
			setChanged();
			notifyObservers();
		}
	}
	
	public ListaErasoMota jokalariarenErasoMotak(int txanda){
		return lista[txanda].getErasoMotak();
	}
	
	public void tableroetanObservablea(int jok, Observer o){
		lista[jok].tablerokoObserverra(o);	
	}
	
	public Jokalaria irabazleaLortu(Jokalaria j){
		boolean topatu = false;
		int i=0;
		while(!topatu){
			if(!lista[i].equals(j)) topatu = true;
		}
		return lista[i];
	}
}
