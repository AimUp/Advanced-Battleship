package proiektua.advancedBattleship;

import proiektua.advanncedBattleship.baliabideak.Textua;

public class UAV extends AireIbilgailua{
	
	public UAV(){
		super(Textua.UAV,20);
	}

	@Override
	public String informazioaInprimatu() {
		return "5x5 area bistaratuko du aurkarian";	
	}

	@Override
	public boolean erasoaEgin(int x, int y) {
		AdvancedBattleship.getAdvancedBattleship().uavErasoa(x, y);
		return false;
	}
}