package proiektua.advancedBattleship;

import proiektua.salbuespenak.EzinKokatu;

public class AdvancedBattleship {

	private static AdvancedBattleship nAdvancedBattleship = null;
	private int txanda = 0;
	private boolean bukatu = false;
	
	private AdvancedBattleship(){
		Teklatua.getTeklatua().hasierakoMezua();
	}
	
	public static AdvancedBattleship getAdvancedBattleship(){
		if(nAdvancedBattleship==null){
			nAdvancedBattleship = new AdvancedBattleship();
		}
		return nAdvancedBattleship;
	}
	
	private void jokalariakSortu(){
		int jokalariKopurua = JokalariZerrenda.getJokalariZerrenda().luzera();
		String[] izenak = Teklatua.getTeklatua().jokalariIzenak(jokalariKopurua);
		for(int x=0; x<jokalariKopurua; x++){
			Jokalaria j = new Jokalaria(izenak[x]);
			JokalariZerrenda.getJokalariZerrenda().jokalariaGehitu(j, x);
		}
	}
	
	public void jokatu(){
		String unekoJok;
		jokalariakSortu();
		hasierakoErasoaKokatu();
		while(!bukatu){
			System.out.println("\n\n");
			unekoJok =  JokalariZerrenda.getJokalariZerrenda().getJokalariarenIzena(txanda);
			System.out.println(unekoJok +" ZURE TXADA");
			JokalariZerrenda.getJokalariZerrenda().jokatu(txanda);
			if(txanda==JokalariZerrenda.getJokalariZerrenda().luzera()-1){ 
				txanda = 0;
			}
			else{
				txanda = txanda+1;
			}
		}
	}
	
	private void hasierakoErasoaKokatu(){
		int fragata;
		int akorazatua;
		int hegazGarraio;
		
		for(int x=0; x<JokalariZerrenda.getJokalariZerrenda().luzera(); x++){
			fragata = 4;
			akorazatua = 3;
			hegazGarraio = 1;
			System.out.println(JokalariZerrenda.getJokalariZerrenda().getJokalariarenIzena(x)+", itsasontziak kokatu:");
			System.out.println();
			while (fragata>0){
				System.out.println("Kokatu fragata (x,y) koordentuan:");
				try {
					JokalariZerrenda.getJokalariZerrenda().erasoaGehitu(x, new Fragata());
					fragata--;
				} catch (EzinKokatu e) {
					e.erroreaInprimatu();
					System.out.println("Berriro koka ezazu");
				}
			}
			while (akorazatua>0){
				System.out.println("Kokatu akorazatua (x,y) koordentuan:");
				try {
					JokalariZerrenda.getJokalariZerrenda().erasoaGehitu(x, new Korazatua());
					akorazatua--;
				} catch (EzinKokatu e) {
					e.erroreaInprimatu();
					System.out.println("Berriro koka ezazu");
				}
			}
			while (hegazGarraio>0){
				System.out.println("Kokatu hegazkin garraiolaria (x,y) koordentuan:");
				try {
					JokalariZerrenda.getJokalariZerrenda().erasoaGehitu(x, new HegazkinGarraiolaria());
					hegazGarraio--;
				} catch (EzinKokatu e) {
					e.erroreaInprimatu();
					System.out.println("Berriro koka ezazu");
				}
			}
		}
	}
	
	public void partidaBukatu(){
		System.out.println("Zihur zaude partida bukatu nahi duzula?");
		if(Teklatua.getTeklatua().baiEdoEz()){
			bukatu = true;
		}
	}

	public boolean erasoaEgin(int x, int y){ //True ura jotzen ez badu
		int erasoJok;
		if(txanda==JokalariZerrenda.getJokalariZerrenda().luzera()-1){ 
			erasoJok=0;
		}
		else{
			erasoJok=txanda+1;
		}
		return JokalariZerrenda.getJokalariZerrenda().erasoaEgin(x, y, erasoJok);
	}
}
