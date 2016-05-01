package proiektua.advancedBattleship;

import proiektua.salbuespenak.TablerotikKanpo;

public class Tableroa {
	
	private ItsasoIbilgailua[][] ibilgailuMatrizea;

	public Tableroa(){
		int tableroTamaina = 15;
		ibilgailuMatrizea = new ItsasoIbilgailua[tableroTamaina][tableroTamaina];
	}
	
	public void erasoaGehitu(ItsasoIbilgailua ibil){
		int[] koor = Teklatua.getTeklatua().koordenatuakAukeratu();
		int x=koor[0], y=koor[1];
		char nora = Teklatua.getTeklatua().brujula();
		int luz = ibil.getLuzera();
		
		switch(nora){
			case'i':
				while(luz > 0){
					kokatuontzia(ibil, x, y+(luz-1));
					luz--;
				}
				break;
			case'h':
				System.out.println("h");
				while(luz > 0){
					kokatuontzia(ibil, x-(luz-1), y);
					luz--;
				}
				break;
			case'm':
				while(luz > 0){
					kokatuontzia(ibil, x, y-(luz-1));
					luz--;
				}
				break;
			case'e':
				while(luz > 0){
					kokatuontzia(ibil, x+(luz-1), y);
					luz--;
				}
				break;
		}
		tableroaInprimatu();
	}
	
	private void kokatuontzia(ItsasoIbilgailua ibil, int x, int y){
		try{
			if(x<0 || x>14 || y<0 || y>14){
				{throw new TablerotikKanpo();}
			}
			try{
				if(ibilgailuMatrizea[x][y] != null){
					{throw new PosizioaOkupatua();}
				}
				ibilgailuMatrizea[x][y]=ibil;
			}
			catch(PosizioaOkupatua e){
				System.out.println("Posizio honetan ezin daiteko ontzirik jarri");
			}
		}
		catch(TablerotikKanpo e){
			System.out.println("Tablerotik kanpo");
		}
	}
	
	public void tableroaInprimatu(){
		for(int x = 0; x < ibilgailuMatrizea.length; x++){
			for(int y = 0; y < ibilgailuMatrizea[x].length; y++){
				if(ibilgailuMatrizea[x][y] == null){
					System.out.print("≈");
				}
				else if(ibilgailuMatrizea[x][y] == null){
					System.out.print("O");
				}
				else if(ibilgailuMatrizea[x][y] instanceof Ura){
					System.out.print("0");
				}
				else {
					System.out.print("X");
				}
			}
			System.out.println();
		}
	}
	
	public boolean erasoaJaso(int x, int y){
		if(ibilgailuMatrizea[x][y] != null && !(ibilgailuMatrizea[x][y] instanceof Ura)){
			ibilgailuMatrizea[x][y].erasoaJaso();
		}
		return false;
	}
}
