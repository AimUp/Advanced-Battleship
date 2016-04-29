 package proiektua.advancedBattleship;

import java.util.Scanner;

import java.util.Scanner;

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
		jokalariakSortu();
		hasierakoErasoaKokatu();
		while(!bukatu){
			while(JokalariZerrenda.getJokalariZerrenda().txandaDu(txanda)){
				JokalariZerrenda.getJokalariZerrenda().jokatu(txanda);
			}
		}
	}
	
	private void hasierakoErasoaKokatu(){
		int erasoKopurua;
		int erasoMota = 0;
		int fragata = 4;
		int akorazatua = 3;
		int hegazkinGarraiolaria = 1;
		
<<<<<<< HEAD
		for(int x=0; x<JokalariZerrenda.getJokalariZerrenda().luzera(); x++){
=======
		for(int x=0; x<jokalariak.length; x++){
>>>>>>> addc46ac5105b534b0ff60f0d6a00c7a297d0541
			erasoKopurua = 8;
			System.out.println(x+" jokalariaren txanda");
			/*while(erasoKopurua>=0){
				Syso
<<<<<<< HEAD
				JokalariZerrenda.getJokalariZerrenda().erasoaErosi(x);
=======
				jokalariak[x].ErasoaErosi();
>>>>>>> addc46ac5105b534b0ff60f0d6a00c7a297d0541
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
	public void erasoaEgin(int x, int y){
		int erasoJok;
		if(txanda==JokalariZerrenda.getJokalariZerrenda().luzera()){ 
			erasoJok=0;}
		else{
			erasoJok=txanda+1;
		}
		JokalariZerrenda.getJokalariZerrenda().erasoaEgin(x, y, erasoJok);
	}
	public void erasoaEgin(int x, int y){
		int erasoJok;
		if(txanda==JokalariZerrenda.getJokalariZerrenda().luzera()){ 
			erasoJok=0;}
		else{
			erasoJok=txanda+1;
		}
		JokalariZerrenda.getJokalariZerrenda().erasoaEgin(x, y, erasoJok);
	}
	public void erasoaEgin(int x, int y){
		if(txanda==JokalariZerrenda.getJokalariZerrenda().luzera()){ 
			JokalariZerrenda.getJokalariZerrenda().erasoaEgin();
		}
		this.jokalariak[]
	}
	public void erasoaEgin(int x, int y){
		int erasoJok;
		if(txanda==JokalariZerrenda.getJokalariZerrenda().luzera()){ 
			erasoJok=0;}
		else{
			erasoJok=txanda+1;
		}
		JokalariZerrenda.getJokalariZerrenda().erasoaEgin(x, y, erasoJok);
	}
	public void erasoaEgin(int x, int y){
		int erasoJok;
		if(txanda==JokalariZerrenda.getJokalariZerrenda().luzera()){ 
			erasoJok=0;}
		else{
			erasoJok=txanda+1;
		}
		JokalariZerrenda.getJokalariZerrenda().erasoaEgin(x, y, erasoJok);
	}
}
