package proiektua.advancedBattleship;

import proiektua.salbuespenak.Hondoratua;

public class Mina extends ErasoMota{
	
	public Mina(){
		super("Mina",10);
	}

	@Override
	public String informazioaInprimatu() {
		return "3x3ko eztanda egingo du";
	}

	@Override
	public boolean erasoaEgin(int zut, int err) throws Hondoratua{
		Hondoratua hondoratu=null;
		boolean joDu=false;
		boolean b=false;
		for(int x=-1; x<2; x++){
			for(int y=-1; y<2; y++){
				try {
					b=AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut+x, err+y);
				} catch (Hondoratua e) {
					hondoratu=e;
				}
				if(b){
					joDu=true;
				}
			}
		}
		if(hondoratu!=null){
				{throw hondoratu;}
		}
		return joDu;
	}
}
