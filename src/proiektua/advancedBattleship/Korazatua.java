package proiektua.advancedBattleship;

import java.util.Random;

public class Korazatua extends ItsasoIbilgailua {
	
	public Korazatua(){
		super("Korazatua",50,3);
	}

	@Override
	protected void informazioaInprimatu() {
		System.out.println("Luzera 3 duen itsaso erasoa izango da \n Fragataren eraso 3 kasilakoa izango da");
	}

	@Override
	protected String getIzena(){
		return "Korazatua";
	}

	@Override
	protected boolean erasoaEgin(int zut, int err) {
		boolean jo;
		boolean b = false;
		jo = AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut,err);
		Random rnd= new Random();
		for(int i=0;i<3;i++){
			//Crear excepcion de ataque fuera de tablero
			int z=rnd.nextInt(zut+2 - zut-2 +1)+zut-2;
			int e=rnd.nextInt(err+2 - err-2 +1)+err-2;
			b = AdvancedBattleship.getAdvancedBattleship().erasoaEgin(z,e);
			if(b){
				jo = true;
			}
		}
		return jo;
	}

	@Override
	public void itsaspekoErasoaEgin(int x, int i) {
		// TODO Auto-generated method stub
		
	}
}