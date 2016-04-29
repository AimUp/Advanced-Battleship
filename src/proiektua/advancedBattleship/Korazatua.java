package proiektua.advancedBattleship;

import java.util.Random;

public class Korazatua extends ItsasoIbilgailua {
	public Korazatua(int pPrezioa,boolean pEgoera, int pLuzera){
		super(pPrezioa,pEgoera,pLuzera);
	}

	@Override
	protected void informazioaInprimatu() {
		// TODO Auto-generated method stub
		System.out.println("Luzera 3 duen itsaso erasoa izango da \n Fragataren eraso kasila bakarrekoa izango da");

		System.out.println("Luzera 3 duen itsaso erasoa izango da \n Fragataren eraso 3 kasilakoa izango da");

	}

	@Override
	protected String getIzena() {
		// TODO Auto-generated method stub
		return "Korazatua";
	}

	@Override
	protected void erasoaEgin(int zut, int err) {
		// TODO Auto-generated method stub
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut,err);
		Random rnd= new Random();
		for(int i=0;i<3;i++){
		//Crear excepcion de ataque fuera de tablero
		int z=rnd.nextInt(zut+2 - zut-2 +1)+zut-2;
		int e=rnd.nextInt(err+2 - err-2 +1)+err-2;
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(z,e);
		}
	}
}