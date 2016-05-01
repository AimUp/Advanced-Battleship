package proiektua.salbuespenak;

public class EzinKokatu extends Exception{

	private static final long serialVersionUID = 1L;

	public EzinKokatu(){
		super();
	}
	
	public void erroreaInprimatu(){
		System.out.println("Itsasontzi hau ezin da posizio honetan kokatu.");
	}
}
