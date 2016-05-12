package proiektua.advancedBattleship;

import proiektua.salbuespenak.Hondoratua;

public class Mina extends ErasoMota{
	
	public Mina(){
		super("Mina",10);
	}

	@Override
	protected void espezifikazioakInprimatu() {
		System.out.println("Izena: Mina");
		System.out.println("Prezioa: " +this.getPrezioa());
		
	}

	@Override
	public String informazioaInprimatu() {
		return "3x3ko eztanda egingo du";
	}

	@Override
	public boolean erasoaEgin(int zut, int err) throws Hondoratua{
		boolean joDu=false;
		boolean b=false;
		for(int x=-1; x<2; x++){
			for(int y=-1; y<2; y++){
				b=AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut+x, err+y);
				if(b){
					joDu=true;
				}
			}
		}
		return joDu;
	}
	
}
