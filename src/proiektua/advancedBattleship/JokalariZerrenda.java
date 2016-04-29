package proiektua.advancedBattleship;

public class JokalariZerrenda {

	private Jokalaria[] lista;
	private static JokalariZerrenda nJokalariZerrenda = null;
	
	private JokalariZerrenda(){
		
	}
	
	public static JokalariZerrenda getJokalariZerrenda(){
		if(nJokalariZerrenda==null){
			nJokalariZerrenda = new JokalariZerrenda();
		}
		return nJokalariZerrenda;
	}
	public void erasoaEgin(int x, int y, int jokPos){
		lista[jokPos].erasoaJaso(x,y);
	}
	public void erasoaEgin(int x, int y, int jokPos){
		lista[jokPos].erasoaJaso(x,y);
	}
	public int luzera(){
		return lista.length;
	}
	public void erasoaEgin(int x, int y, int jokPos){
		lista[jokPos].erasoaJaso(x,y);
	}
	public int luzera(){
		return lista.length;
	}
	
	public void erasoaGehitu(int txanda, ErasoMota em, int x, int y, int l){
		
		nJokalariZerrenda.lista[txanda].erasoaGehitu(em, x, y, l);
	}
}
