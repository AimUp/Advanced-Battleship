package proiektua.advancedBattleship;

import proiektua.salbuespenak.EzinKokatu;

public class Jokalaria {

	private double dirua;
	private String izena;
	private int txandak = 1;
	private ListaErasoMota listaErasoak;
	private Tableroa jokalariTableroa;
	
	public Jokalaria(String pIzena){
		izena = pIzena;
		dirua = 0; 	//Hasierako diru kantitatea
		listaErasoak = new ListaErasoMota();
		jokalariTableroa = new Tableroa();
	}
	
	public void jokatu(){
		while(txandak>0){
			int aukera = Teklatua.getTeklatua().jokalariakJokatzekoAukerak();
			switch (aukera) {
			case 0: AdvancedBattleship.getAdvancedBattleship().partidaBukatu();
					break;
			case 1: ErasoEgin();
					break;
			case 2: ErasoaErosi();
					break;
			case 3: 
				System.out.println("ZURE DIRUA:"+ dirua + " DA.");
				txandak++;
			
			}
			txandak--;
		}
		txandak = 1;
	}
	
	private void ErasoEgin(){
		System.out.println("Erasoa egiteko eraso mota bat aukeratu behar duzu.");
		listaErasoak.inprimatuErasoInfo();
		int aukera = Teklatua.getTeklatua().zenbakiaEskatu(1, listaErasoak.tamaina());
		int[] koor = Teklatua.getTeklatua().koordenatuakAukeratu();
		if(listaErasoak.posiziokoErasoaLortu(aukera).getIzena().equals("Itsaspekoa")){
			listaErasoak.posiziokoErasoaLortu(aukera).itsaspekoErasoaEgin(koor[0], koor[1]);
			txandak++;
		}
		else if(listaErasoak.posiziokoErasoaLortu(aukera).erasoaEgin(koor[0], koor[1])){ //JO BADU
			txandak++;
		}
	}
	
	public void ErasoaErosi(){
		ErasoMota erositakoa = Denda.getDenda().erosi(this);
		if(erositakoa!=null){
			dirua = dirua - erositakoa.getPrezioa();
			if(erositakoa instanceof ItsasoIbilgailua){
				boolean bukatu = false;
				while(!bukatu){
					try {
						System.out.println("Kokatu tableroan erositako " + erositakoa.getIzena());
						erasoaGehitu((ItsasoIbilgailua) erositakoa);
						bukatu=true;
					} catch (EzinKokatu e) {
						System.out.println("Ezin duzu " + erositakoa.getIzena() + " hor kokatu.");
						System.out.println("Berriro kokatzen zaihatu nahi duzu? (Berriro kokatzen ez baduzu dirua itzuliko zaizu)");
						if(!Teklatua.getTeklatua().baiEdoEz()){
							dirua = dirua + erositakoa.getPrezioa();
							bukatu = true;
						}
					}
				}
			}
		}
	}
	
	public boolean diruNahikoa(int pKostua){
		if(dirua>pKostua) return true;
		else return false;
	}
	
	public void diruaGehitu(int pDiruKop){
		dirua =+ pDiruKop;
	}
	
	public boolean erasoaJaso(int x, int y){
		return jokalariTableroa.erasoaJaso(x,y);
	}
			
	public void galdu(){
		
	}

	public String getIzena() {
		return izena;
	}

	public void erasoaGehitu(ItsasoIbilgailua em) throws EzinKokatu{
		jokalariTableroa.erasoaGehitu(em, listaErasoak);
	}
	
	public void setIzena(String izena) {
		this.izena = izena;
	}
	
	public void tableroaInprimatu(){
		jokalariTableroa.tableroaInprimatu();
	}
		

	public boolean itsaspekoErasoaJaso(int x, int y) {
		return jokalariTableroa.itsaspekoErasoaJaso(x,y);
	}
	
}
