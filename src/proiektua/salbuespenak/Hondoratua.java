package proiektua.salbuespenak;

public class Hondoratua extends Exception{
	
	private static final long serialVersionUID = 1L;
	private int gehitzekoPuntuak; 

	public Hondoratua(int puntuak){
		super();
		gehitzekoPuntuak = puntuak;
	}
	
	public int getGehitzekoPuntuak(){
		return gehitzekoPuntuak;
	}
}
