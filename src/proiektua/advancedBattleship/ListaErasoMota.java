package proiektua.advancedBattleship;

import java.util.ArrayList;

public class ListaErasoMota {

	private ArrayList<ErasoMota> lista;
	
	public ListaErasoMota(){
		lista = new ArrayList<ErasoMota>();
	}
	
	public void erasoaGehitu(ErasoMota e){
		lista.add(e);
	}
	
	public void erasoaKendu(ErasoMota e){
		lista.remove(e);
	}
	
	public ErasoMota posiziokoErasoaLortu(int pPos){
		return lista.get(pPos);
	}
	
	public int tamaina(){
		return lista.size();
	}
	
	public boolean itsasoIbilgailurik(){
		return lista.stream().anyMatch(e -> e instanceof ItsasoIbilgailua);
	}
}
