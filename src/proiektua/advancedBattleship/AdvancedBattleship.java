package proiektua.advancedBattleship;

import java.util.Scanner;

public class AdvancedBattleship {

	private static AdvancedBattleship nAdvancedBattleship = null;
	private int txanda = 0;
	private Jokalaria[] jokalariak;
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
		int jokalariKopurua = 2;
		jokalariak = new Jokalaria[jokalariKopurua];
		String[] izenak = Teklatua.getTeklatua().jokalariIzenak(jokalariKopurua);
		for(int x=0; x<jokalariKopurua; x++){
			Jokalaria j = new Jokalaria(izenak[x]);
			jokalariak[x] = j;
		}
	}
	
	public void jokatu(){
		jokalariakSortu();
		hasierakoErasoaKokatu();
		while(!bukatu){
			while(jokalariak[txanda].txandaDu()){
				jokalariak[txanda].jokatu();
			}
		}
	}
	
	private void hasierakoErasoaKokatu(){
		int erasoKopurua;
		int erasoMota = 0;
		int fragata = 4;
		int akorazatua = 3;
		int hegazkinGarraiolaria = 1;
		
		for(int x=0; x<jokalariak.length; x++){
			erasoKopurua = 8;
			System.out.println(x+" jokalariaren txanda");
			/*while(erasoKopurua>=0){
				Syso
				jokalariak[x].ErasoaErosi();
				erasoKopurua--;
			}*/
			
			switch(erasoMota){
			case '0' :
				while ( fragata >= 0){
					System.out.println("Kokatu fragata (x,y) koordentuan:");
					int[] koor = Teklatua.getTeklatua().koordenatuakAukeratu();
					JokalariZerrenda.getJokalariZerrenda().erasoaGehitu(txanda, new Fragata(), koor[0], koor[1], fragata);
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
	public void erasoaEgin(int x, int y){
		if(txanda==JokalariZerrenda.getJokalariZerrenda().luzera()){ 
			JokalariZerrenda.getJokalariZerrenda().erasoaEgin();
		}
		this.jokalariak[]
	}
}
