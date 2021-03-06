package proiektua.advancedBattleship;

import java.util.Observable;

import proiektua.salbuespenak.DirurikEz;
import proiektua.salbuespenak.EzinKokatu;
import proiektua.salbuespenak.Hondoratua;
import proiektua.salbuespenak.IzenBerdinak;
import proiektua.salbuespenak.IzenHutsa;

public class AdvancedBattleship extends Observable{

	private static AdvancedBattleship nAdvancedBattleship = null;
	private int txanda = 0;
	
	private AdvancedBattleship(){
		
	}
	
	public static AdvancedBattleship getAdvancedBattleship(){
		if(nAdvancedBattleship==null){
			nAdvancedBattleship = new AdvancedBattleship();
		}
		return nAdvancedBattleship;
	}
	
	public void jokatu(String jok1, String jok2) throws IzenBerdinak, IzenHutsa{
		if(jok1.equals(jok2)){
			throw new IzenBerdinak();
		}
		if((jok1.isEmpty() || jok2.isEmpty())){
			throw new IzenHutsa();
		}
		jokalariakSortu(jok1, jok2);
		JokalariZerrenda.getJokalariZerrenda().hasierakoa();	
	}
	
	private void jokalariakSortu(String izena1, String izena2){
		int jokalariKopurua = JokalariZerrenda.getJokalariZerrenda().luzera();
		String[] izenak = {izena1, izena2};
		for(int x=0; x<jokalariKopurua; x++){
			Jokalaria j = new Jokalaria(izenak[x]);
			JokalariZerrenda.getJokalariZerrenda().jokalariaGehitu(j, x);
		}
	}
	
	private int urrengotxandaAurkitu(){
		int erasoJok;
		if(txanda==JokalariZerrenda.getJokalariZerrenda().luzera()-1){ 
			erasoJok=0;
		}
		else{
			erasoJok=txanda+1;
		}
		return erasoJok;
	}
	
	public int unekoTxanda(){
		return txanda;
	}
	
	public int unekoDirua(){
		return JokalariZerrenda.getJokalariZerrenda().unekoDirua(txanda);
	}
	
	public void dendanErosi(int em) throws DirurikEz{
		JokalariZerrenda.getJokalariZerrenda().erasoaErosi(em, txanda);
		txanda = urrengotxandaAurkitu();
	}
	
	public void erasoBerriaKokatu(ItsasoIbilgailua i, char c, int x, int y) throws EzinKokatu{
		JokalariZerrenda.getJokalariZerrenda().erasoBerriaKokatu(i, c, x, y, urrengotxandaAurkitu());
	}
	
	public boolean jokarariakErasoaBurutu(int x, int y, ErasoMota em){ //True ura jotzen ez badu
		boolean jo = JokalariZerrenda.getJokalariZerrenda().erasoaBurutu(x, y, em, txanda);
		if(!jo){
			txanda = urrengotxandaAurkitu();
			setChanged();
			notifyObservers();
		}
		return jo;
	}

	public boolean erasoaEgin(int x, int y) throws Hondoratua{ //True ura jotzen ez badu
		int t = urrengotxandaAurkitu();
		return JokalariZerrenda.getJokalariZerrenda().erasoaEgin(x, y, t);
	}
	
	public boolean itsaspekoErasoaEgin(int x, int y) throws Hondoratua{
		int erasoJok=urrengotxandaAurkitu();
		return JokalariZerrenda.getJokalariZerrenda().itsaspekoErasoaEgin(x, y, erasoJok);
	}
	
	public void uavErasoa(int x, int y){
		int erasoJok=urrengotxandaAurkitu();
		JokalariZerrenda.getJokalariZerrenda().uavErasoa(x,y,erasoJok);
	}
	
	public void partidaBukatu(Jokalaria galtzailea){
		setChanged();
		notifyObservers(JokalariZerrenda.getJokalariZerrenda().irabazleaLortu(galtzailea));
	}
}
