 package proiektua.advancedBattleship;

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
		int korazatua = 3;
		int hegazkinGarraiolariak = 1;
		
		for(int x=0; x<JokalariZerrenda.getJokalariZerrenda().luzera(); x++){
			
			erasoKopurua = 8;
			System.out.println(x+" jokalariaren txanda");
			//for (int erasoMota = 0; erasoMota < 3; erasoMota++){
				switch(erasoMota){
				case '0' :
					while ( fragata >= 0){
						System.out.println("Kokatu fragata (x,y) koordentuan:");
						int[] koor = Teklatua.getTeklatua().koordenatuakAukeratu();
						JokalariZerrenda.getJokalariZerrenda().erasoaGehitu(txanda, new Fragata(), koor[0], koor[1], fragata);
						fragata--;
					}
					break;
				case '1' :
					while ( korazatua >= 0){
						System.out.println("Kokatu akorazatua (x,y) koordentuan:");
						int[] koor = Teklatua.getTeklatua().koordenatuakAukeratu();
						JokalariZerrenda.getJokalariZerrenda().erasoaGehitu(txanda, new Korazatua(), koor[0], koor[1], korazatua);
						korazatua--;
					}
					break;
				case '2' :
					System.out.println("Kokatu hegazkinGarraiolariak (x,y) koordentuan:");
					int[] koor = Teklatua.getTeklatua().koordenatuakAukeratu();
					JokalariZerrenda.getJokalariZerrenda().erasoaGehitu(txanda, new Fragata(), koor[0], koor[1], hegazkinGarraiolariak);
				//}
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
		int erasoJok;
		if(txanda==JokalariZerrenda.getJokalariZerrenda().luzera()){ 
			erasoJok=0;}
		else{
			erasoJok=txanda+1;
		}
		JokalariZerrenda.getJokalariZerrenda().erasoaEgin(x, y, erasoJok);
	}
}
