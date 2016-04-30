package proiektua.advancedBattleship;

import java.util.Random;

public class Bonbarderoa extends AireIbilgailua{
	
	public Bonbarderoa(){
		super(200);
	}

	@Override
	protected void informazioaInprimatu() {
		System.out.println("Tableroa zeharkatuko du 3 kasilako zabalera duen lerro batean erasoz  \n erasoak random baten bidez egingo dira \n erabilzaileak zutabe bat edo errenkada bat soilik aukeratu beharizango du.");
	}

	@Override
	protected boolean erasoaEgin(int zut, int err) {
		boolean b = false;
		boolean jo = false;
		int e=15;
		Random rnd=new Random();
		for(int i=0;i<5;i++){
			int z=rnd.nextInt(zut+1 - zut-1 +1)+zut-1;
			e=e-rnd.nextInt(2)+1;
			b = AdvancedBattleship.getAdvancedBattleship().erasoaEgin(z,e);
			if(b){
				jo = true;
			}
		}
		return jo;
	}
}
