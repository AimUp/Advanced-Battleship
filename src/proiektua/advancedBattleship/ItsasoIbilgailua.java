package proiektua.advancedBattleship;

import proiektua.salbuespenak.Hondoratua;

public abstract class ItsasoIbilgailua extends ErasoMota{
	
	private int luzera;
	private ItsasontziKokalekua[] kokalekua;
	
	public ItsasoIbilgailua(String pIzena, int pPrezioa, int pLuzera){
		super(pIzena, pPrezioa);
		luzera=pLuzera;
		kokalekua = new ItsasontziKokalekua[luzera];
		for(int x=0; x<luzera; x++){
			kokalekua[x] = new ItsasontziKokalekua();
		}
	}
	
	public int getLuzera(){
		return luzera;
	}
	
	public void erasoaJaso(int x, int y) throws Hondoratua{
		int i=0;
		while(!kokalekua[i].kokalekuHauDa(x, y)){
			i++;
		}
		kokalekua[i].jo();
		luzera--;
		if(luzera<=0){
			{throw new Hondoratua(kokalekua.length);}
		}
	}
	public ItsasontziKokalekua[] itsaspekoErasoaJaso(){
		int i=0;
		while(i<kokalekua.length){
			kokalekua[i].jo();
			i++;
		}	
		luzera=0;
		return kokalekua;
	}
	
	public void kokalekuBatGehitu(int pos, int x, int y){
		kokalekua[pos].setZutEtaErr(x, y);
	}
	
	public boolean joEginda(int x, int y){
		int i=0;
		while(!kokalekua[i].kokalekuHauDa(x, y)){
			i++;
		}
		return kokalekua[i].jotaDago();
	}
	
	public abstract String informazioaInprimatu();
	public abstract boolean erasoaEgin(int zut, int err) throws Hondoratua;

}
