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
		for(int x=0; x<JokalariZerrenda.getJokalariZerrenda().luzera(); x++){
			erasoKopurua = 10;
			while(erasoKopurua>=0){
				JokalariZerrenda.getJokalariZerrenda().erasoaErosi(x);
				erasoKopurua--;
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
