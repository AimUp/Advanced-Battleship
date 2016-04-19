package proiektua.advancedBattleship;

public class AdvancedBattleship {

	private static AdvancedBattleship nAdvancedBattleship = null;
	private int txanda = 0;
	private Jokalaria[] jokalariak;
	
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
		hasierakoErasoakErosi();
		boolean partidaAmaitu = false;
		while(!partidaAmaitu){
			
		}
	}
	
	private void hasierakoErasoakErosi(){
		for(int x=0; x<jokalariak.length; x++){
			jokalariak[x].ErasoaErosi();
		}
	}
}
