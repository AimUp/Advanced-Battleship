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
		System.out.println("Erasoa egiteko eraso mota bat aukeratu behar duzu.");
		listaErasoak.inprimatuErasoInfo();
		int aukera = Teklatua.getTeklatua().zenbakiaEskatu(1, listaErasoak.tamaina());
		int[] koor = Teklatua.getTeklatua().koordenatuakAukeratu();
		listaErasoak.posiziokoErasoaLortu(aukera);
	}
	
	public void ErasoaErosi(){
		ErasoMota erositakoa = Denda.getDenda().erosi(this);
		if(erositakoa!=null){
			dirua =- erositakoa.getPrezioa();
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
}
