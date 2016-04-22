package proiektua.advancedBattleship;

public class Jokalaria {

	private double dirua;
	private int txandak = 1;
	private String izena;
	private ListaErasoMota listaErasoak;
	private Tableroa jokalariTableroa;
	
	public Jokalaria(String pIzena){
		izena = pIzena;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}
	
}
