package proiektua.advancedBattleship;

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
	protected void informazioaInprimatu() {
		System.out.println("Minak beste jokalariaren tableroan 3x3ko erasoa egingo du");
	}

	@Override
	protected boolean erasoaEgin(int zut, int err) {
		boolean txandaGehitu=false;
		boolean joDu=AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut-1, err-1);
		if(joDu)txandaGehitu=true;
		joDu=AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut, err-1);
		if(joDu)txandaGehitu=true;
		joDu=AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut+1, err-1);
		if(joDu)txandaGehitu=true;
		joDu=AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut-1, err);
		if(joDu)txandaGehitu=true;
		joDu=AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut, err);
		if(joDu)txandaGehitu=true;
		joDu=AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut+1, err);
		if(joDu)txandaGehitu=true;
		joDu=AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut-1, err+1);
		if(joDu)txandaGehitu=true;
		joDu=AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut, err+1);
		if(joDu)txandaGehitu=true;
		joDu=AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut+1, err+1);
		if(joDu)txandaGehitu=true;
		return txandaGehitu;
	}
	
}
