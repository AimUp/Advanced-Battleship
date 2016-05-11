package proiektua.advancedBattleship;

public abstract class ItsasoIbilgailua extends ErasoMota{
	
	private boolean egoera;
	private int luzera;
	private ItsasontziKokalekua[] kokalekua;
	
	public ItsasoIbilgailua(String pIzena, int pPrezioa, int pLuzera){
		super(pIzena, pPrezioa);
		luzera=pLuzera;
		egoera=true;
		kokalekua = new ItsasontziKokalekua[luzera];
		for(int x=0; x<luzera; x++){
			kokalekua[x] = new ItsasontziKokalekua();
		}
	}
	
	public int getLuzera(){
		return luzera;
	}
	
	protected void espezifikazioakInprimatu(){
		System.out.println(this.getIzena());
		System.out.println("Prezioa: "+this.getPrezioa());
		System.out.println("Luzera: " +luzera);
	}
	
	public void erasoaJaso(int x, int y){
		int i=0;
		while(!kokalekua[i].kokalekuHauDa(x, y)){
			i++;
		}
		kokalekua[i].jo();
		luzera--;
	}
	public void itsaspekoErasoaJaso(){
		int i=0;
		while(i<kokalekua.length){
			kokalekua[i].jo();
			i++;
			luzera--;
		}	
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
	
	protected abstract void informazioaInprimatu();
	protected abstract boolean erasoaEgin(int zut, int err);

}
