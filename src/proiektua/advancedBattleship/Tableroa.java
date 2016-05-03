package proiektua.advancedBattleship;

import proiektua.salbuespenak.EzinKokatu;
import proiektua.salbuespenak.PosizioaOkupatua;
import proiektua.salbuespenak.TablerotikKanpo;

public class Tableroa {
	
	private ItsasoIbilgailua[][] ibilgailuMatrizea;

	public Tableroa(){
		int tableroTamaina = 15;
		ibilgailuMatrizea = new ItsasoIbilgailua[tableroTamaina][tableroTamaina];
	}
	
	public void erasoaGehitu(ItsasoIbilgailua ibil, ListaErasoMota lista) throws EzinKokatu{
		int[] koor = Teklatua.getTeklatua().koordenatuakAukeratu();
		int x=koor[0], y=koor[1];
		char nora = Teklatua.getTeklatua().brujula();
		int luz = ibil.getLuzera();
		if(nora=='i' || nora=='I'){
			if(!kokatuDaiteke(ibil, x, y, nora)){
				{throw new EzinKokatu();}
			}
			while(luz>0){
				ibilgailuMatrizea[x][y-(luz-1)] = ibil;
				ibil.kokalekuBatGehitu(luz-1, x, y-(luz-1));
				luz--;
			}
		}
		else if(nora=='h' || nora=='H'){
			if(!kokatuDaiteke(ibil, x, y, nora)){
				{throw new EzinKokatu();}
			}
			while(luz>0){
				ibilgailuMatrizea[x][y+(luz-1)] = ibil;
				ibil.kokalekuBatGehitu(luz-1, x, y+(luz-1));
				luz--;
				
			}
		}
		else if(nora=='m' || nora=='M'){
			if(!kokatuDaiteke(ibil, x, y, nora)){
				{throw new EzinKokatu();}
			}
			while(luz>0){
				ibilgailuMatrizea[x-(luz-1)][y] = ibil;
				ibil.kokalekuBatGehitu(luz-1, x-(luz-1), y);
				luz--;
			}	
		}
		else if(nora=='e' || nora=='E'){
			if(!kokatuDaiteke(ibil, x, y, nora)){
				{throw new EzinKokatu();}
			}
			while(luz>0){
				ibilgailuMatrizea[x+(luz-1)][y] = ibil;
				ibil.kokalekuBatGehitu(luz-1, x+(luz-1), y);
				luz--;
			}
		}
		lista.erasoaGehitu(ibil);
		tableroaInprimatu();
	}
	
	private boolean kokatuDaiteke(ItsasoIbilgailua ibil, int x, int y, char nora){
		boolean kokatu = true;
		int l = 0;
		while(l<ibil.getLuzera() && kokatu){
			try{
				if(x<0 || x>14 || y<0 || y>14){
					{throw new TablerotikKanpo();}
				}
				try{
					if(ibilgailuMatrizea[x][y] != null){
						{throw new PosizioaOkupatua();}
					}
					l++;
				}
				catch(PosizioaOkupatua e){
					System.out.println("Posizio honetan ezin daiteko ontzirik jarri");
					kokatu = false;
				}
			}
			catch(TablerotikKanpo e){
				System.out.println("Ezin daiteke itsasontzi kokatu. Posizioa tablerotik KANPO dago.");
				kokatu = false;
			}
			if(nora=='i' || nora=='I'){
				y--;
			}
			else if(nora=='h' || nora=='H'){
				y++;
			}
			else if(nora=='m' || nora=='M'){
				x--;
			}
			else if(nora=='e' || nora=='E'){
				x++;
			}
		}
		return kokatu;
	}
	
	public void tableroaInprimatu(){
		char c = 'A';
		for(int i=0; i<15; i++){
			System.out.print(c+" ");
			c++;
		}
		System.out.println();
		for(int y = 0; y < ibilgailuMatrizea.length; y++){
			for(int x = 0; x < ibilgailuMatrizea.length; x++){
				if(ibilgailuMatrizea[x][y] == null){
					System.out.print("O ");
				}
				else if(ibilgailuMatrizea[x][y] instanceof Ura){
					System.out.print("0 ");
				}
				else {
					System.out.print("X ");
				}
			}
			System.out.println(y);
		}
	}
	
	public void erasoTableroaInprimatu(){
		for(int y = 0; y < ibilgailuMatrizea.length; y++){
			for(int x = 0; x < ibilgailuMatrizea.length; x++){
				System.out.println(x);
				if(ibilgailuMatrizea[x][y] == null){
					System.out.print("≈");
				}
				else if(ibilgailuMatrizea[x][y] instanceof Ura){
					System.out.print("0");
				}
				else if(ibilgailuMatrizea[x][y].joEginda(x,y)){
					System.out.print("X");
				}
				else if(!ibilgailuMatrizea[x][y].joEginda(x,y)){
					System.out.print("≈");
				}
			}
			System.out.println();
		}
		
	}
	
	public boolean erasoaJaso(int x, int y){
		boolean jo = false;
		try{
			if(x<0 || x>14 || y<0 || y>14){
				{throw new TablerotikKanpo();}
			}
			if(ibilgailuMatrizea[x][y] != null && !(ibilgailuMatrizea[x][y] instanceof Ura)){
				ibilgailuMatrizea[x][y].erasoaJaso(x, y);
				jo=true;
			}
			else if(ibilgailuMatrizea[x][y] == null){
				ibilgailuMatrizea[x][y] = new Ura();
			}
			erasoTableroaInprimatu();
		}
		catch(TablerotikKanpo e){}
		
		return jo;
	}

	public boolean itsaspekoErasoaJaso(int x, int y) {
		boolean jo = false;
		try{
			if(x<0 || x>14 || y<0 || y>14){
				{throw new TablerotikKanpo();}
			}
			if(ibilgailuMatrizea[x][y] != null && !(ibilgailuMatrizea[x][y] instanceof Ura)){
				ibilgailuMatrizea[x][y].itsaspekoErasoaJaso();
				jo=true;
			}
			else if(ibilgailuMatrizea[x][y] == null){
				ibilgailuMatrizea[x][y] = new Ura();
			}
			erasoTableroaInprimatu();
		}
		catch(TablerotikKanpo e){}
		
		return jo;
	}
}
