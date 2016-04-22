package proiektua.advancedBattleship;

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
		System.out.println("Partida hasiko da: \n\n\t\t"+jokalariak[0].getIzena()+" VS "+jokalariak[1].getIzena()+"!!!");
		
	}
	
	public void jokatu(){
		jokalariakSortu();
		hasierakoErasoakErosi();
		while(!bukatu){
			while(jokalariak[txanda].txandaDu()){
				jokalariak[txanda].jokatu();
			}
		}
	}
	
	private void hasierakoErasoakErosi(){
		int erasoKopurua;
		for(int x=0; x<jokalariak.length; x++){
			erasoKopurua = 10;
			while(erasoKopurua>=0){
				jokalariak[x].ErasoaErosi();
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
}
