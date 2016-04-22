package proiektua.advancedBattleship;

public class Jokalaria {

	private double dirua;
	private String izena;
	private int txandak = 1;
	private ListaErasoMota listaErasoak;
	private Tableroa jokalariTableroa;
	
	public Jokalaria(String pIzena){
		izena = pIzena;
		dirua = 1000; //Hasierako diru kantitatea
		listaErasoak = new ListaErasoMota();
		jokalariTableroa = new Tableroa();
	}
	
	public void jokatu(){
		
		int aukera = Teklatua.getTeklatua().jokalariakJokatzekoAukerak();
		switch (aukera) {
		case 0: AdvancedBattleship.getAdvancedBattleship().partidaBukatu();
				break;
		case 1: ErasoEgin();
				break;
		case 2: ErasoaErosi();
				break;
		}
	}
	
	private void ErasoEgin(){
		
	}
	
	public void ErasoaErosi(){
		ErasoMota erositakoa = Denda.getDenda().erosi(this);
		if(erositakoa!=null){
			jokalariTableroa.erasoaGehitu(erositakoa);
			listaErasoak.erasoaGehitu(erositakoa);
		}
	}
	
	public boolean diruNahikoa(int pKostua){
		if(dirua>pKostua) return true;
		else return false;
	}
	
	public boolean txandaDu(){
		if(txandak>0) return true;
		else return false;
	}
	
	public void diruaGehitu(int pDiruKop){
		dirua =+ pDiruKop;
	}
	
	public void erasoaJaso(int[][] pKoord){
		
	}
	
	public void hondoratu(){
		
	}
	
	public void galdu(){
		
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}
	
}
