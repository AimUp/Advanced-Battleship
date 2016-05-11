package proiektua.advancedBattleship;

import java.util.Random;

public class Korazatua extends ItsasoIbilgailua {
	
	public Korazatua(){
		super("Korazatua",6,3);
	}

	@Override
	protected void informazioaInprimatu() {
		System.out.println("Luzera: 3 \n Erasoa: 5x5ko laukian 3 misileko randoma");
	}

	@Override
	protected String getIzena(){
		return "Korazatua";
	}

	@Override
	protected boolean erasoaEgin(int zut, int err) {
		boolean jo=false;
		boolean b = false;
		Random rnd= new Random();
		System.out.println("2<=X<=12 tartean egon beharko da.");
		for(int i=0;i<3;i++){
			//Crear excepcion de ataque fuera de tablero
			int z=rnd.nextInt(zut+2 - zut-2)+zut-2;
			int e=rnd.nextInt(err+2 - err-2)+err-2;
			b = AdvancedBattleship.getAdvancedBattleship().erasoaEgin(z,e);
			if(b){
				jo = true;
			}
		}
		return jo;
	}
}