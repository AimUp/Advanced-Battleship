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
<<<<<<< HEAD
<<<<<<< HEAD
=======
	public int luzera(){
		return lista.length;
	}
>>>>>>> branch 'master' of https://aimup@github.com/AimUp/Advanced-Battleship.git
	
	public void jokalariaGehitu(Jokalaria pJok, int pPos){
		lista[pPos] = pJok;
	}
	
=======
	public void erasoaEgin(int x, int y, int jokPos){
		lista[jokPos].erasoaJaso(x,y);
	}
	public int luzera(){
		return lista.length;
	}
	public void erasoaEgin(int x, int y, int jokPos){
		lista[jokPos].erasoaJaso(x,y);
	}
>>>>>>> addc46ac5105b534b0ff60f0d6a00c7a297d0541
	public int luzera(){
		return lista.length;
	}

	public boolean txandaDu(int pTxanda){
		if(lista[pTxanda].txandaDu()) return true;
		else return false;
	}
	
	public void erasoaErosi(int txanda){
		
	}
	
<<<<<<< HEAD
	public void jokatu(int txanda){
		
	}
=======
>>>>>>> addc46ac5105b534b0ff60f0d6a00c7a297d0541
	public void erasoaGehitu(int txanda, ErasoMota em, int x, int y, int l){
		
		nJokalariZerrenda.lista[txanda].erasoaGehitu(em, x, y, l);
	}
}
