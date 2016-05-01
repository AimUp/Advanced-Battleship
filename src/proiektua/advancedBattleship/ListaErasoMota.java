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
	
	public void inprimatuErasoInfo(){
		ArrayList<ErasoMota> erakutzitakoak = new ArrayList<ErasoMota>();
		for(int x=0; x<lista.size(); x++){
			System.out.println(x+1+".");
			lista.get(x).espezifikazioakInprimatu();
			lista.get(x).informazioaInprimatu();
			erakutzitakoak.add(lista.get(x));
		}
	}
}
