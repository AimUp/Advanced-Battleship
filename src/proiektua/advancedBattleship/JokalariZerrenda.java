package proiektua.advancedBattleship;

public class JokalariZerrenda {

	private Jokalaria[] lista;
	private static JokalariZerrenda nJokalariZerrenda = null;
	
	private JokalariZerrenda(){
		int jokalariKopurua = 2;
		lista = new Jokalaria[jokalariKopurua];
	}
	
	public static JokalariZerrenda getJokalariZerrenda(){
		if(nJokalariZerrenda==null){
			nJokalariZerrenda = new JokalariZerrenda();
		}
		return nJokalariZerrenda;
	}
	
	public boolean erasoaEgin(int x, int y, int jokPos){
		return lista[jokPos].erasoaJaso(x,y);
	}
	
	public int luzera(){
		return lista.length;
	}
	
	public void jokalariaGehitu(Jokalaria pJok, int pPos){
		lista[pPos] = pJok;
	}
	
	public void erasoaErosi(int txanda){
		lista[txanda].ErasoaErosi();
	}
	
	public void jokatu(int txanda){
		lista[txanda].jokatu();
	}
	
	public void erasoaGehitu(int txanda, ItsasoIbilgailua em){
		nJokalariZerrenda.lista[txanda].erasoaGehitu(em);
	}
	
	public String getJokalariarenIzena(int pPos){
		return lista[pPos].getIzena();
	}
}
