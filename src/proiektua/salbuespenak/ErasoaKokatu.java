package proiektua.salbuespenak;

import proiektua.advancedBattleship.ErasoMota;
import proiektua.advancedBattleship.ItsasoIbilgailua;

public class ErasoaKokatu extends Exception{

	private static final long serialVersionUID = 1L;
	private ErasoMota kokatzekoErasoa;

	public ErasoaKokatu(ErasoMota em){
		super();
	}
	
	public ItsasoIbilgailua getKokatzekoErasoa(){
		return (ItsasoIbilgailua) kokatzekoErasoa;
	}
	
}
