package proiektua.advancedBattleship;

public class UAV extends AireIbilgailua{
	
	public UAV(){
		super("UAV",50);
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