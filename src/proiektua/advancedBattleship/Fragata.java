package proiektua.advancedBattleship;

public class Fragata extends ItsasoIbilgailua{
	
	public Fragata(){
		super(10,2);
	}

	@Override
	protected void informazioaInprimatu() {
		// TODO Auto-generated method stub
		System.out.println("Luzera 2 duen itsaso erasoa izango da \n Fragataren eraso kasila bakarrekoa izango da");
	}

	@Override
	protected String getIzena() {
		// TODO Auto-generated method stub
		return "Fragata";
	}
	
	@Override
	protected void erasoaEgin() {
		// TODO Auto-generated method stub
		int txanda=AdvancedBattleship.getAdvancedBattleship().erasoaEgin();
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut,err);
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut,err);
		int txanda=AdvancedBattleship.getAdvancedBattleship().erasoaEgin();
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut,err);
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut,err);
		
	}
}