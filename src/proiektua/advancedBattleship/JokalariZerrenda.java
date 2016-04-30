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
	public void erasoaEgin(int x, int y, int jokPos){
		lista[jokPos].erasoaJaso(x,y);
	}
	public int luzera(){
		return lista.length;
	}
	
	public void jokalariaGehitu(Jokalaria pJok, int pPos){
		lista[pPos] = pJok;
	}

	public boolean txandaDu(int pTxanda){
		if(lista[pTxanda].txandaDu()) return true;
		else return false;
	}
	
	public void erasoaErosi(int txanda){
		
	}
	
	public void jokatu(int txanda){
		
	}
	
	public void erasoaGehitu(int txanda, ErasoMota em, int x, int y, int l){
		
		nJokalariZerrenda.lista[txanda].erasoaGehitu(em, x, y, l);
	}
	
	public void tableroaInprimatu(int txanda){
		nJokalariZerrenda.lista[txanda].tableroaInprimatu();
	}
}
