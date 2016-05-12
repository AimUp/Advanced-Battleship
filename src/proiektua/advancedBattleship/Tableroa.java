package proiektua.advancedBattleship;

import java.util.Observable;

import proiektua.salbuespenak.Hondoratua;
import proiektua.salbuespenak.TablerotikKanpo;

public class Tableroa extends Observable{
	
	private ItsasoIbilgailua[][] ibilgailuMatrizea;

	public Tableroa(){
		int tableroTamaina = 15;
		ibilgailuMatrizea = new ItsasoIbilgailua[tableroTamaina][tableroTamaina];
	}
	
	public void setIbilgailuMatrizea(ItsasoIbilgailua[][] im){
		ibilgailuMatrizea = im;
	}
	
	public ItsasoIbilgailua posIbilgailua(int x, int y){
		return ibilgailuMatrizea[x][y];
	}
	
	public boolean erasoaJaso(int x, int y) throws Hondoratua{
		boolean jo = false;
		try{
			if(x<0 || x>14 || y<0 || y>14){
				{throw new TablerotikKanpo();}
			}
			if(ibilgailuMatrizea[x][y] != null && !(ibilgailuMatrizea[x][y] instanceof Ura)){
				jo=true;
				Object[] ob = {true, x,y};
				setChanged();
				notifyObservers(ob);
				ibilgailuMatrizea[x][y].erasoaJaso(x, y);
			}
			else if(ibilgailuMatrizea[x][y] == null){
				ibilgailuMatrizea[x][y] = new Ura();
				Object[] ob = {false, x,y};
				setChanged();
				notifyObservers(ob);
			}	
		}
		catch(TablerotikKanpo e){}
		return jo;
	}

	public boolean itsaspekoErasoaJaso(int x, int y) throws Hondoratua{
		boolean jo = false;
		if(ibilgailuMatrizea[x][y] != null && !(ibilgailuMatrizea[x][y] instanceof Ura)){
			ItsasontziKokalekua[] ik = ibilgailuMatrizea[x][y].itsaspekoErasoaJaso();
			jo=true;
			for(int i=0; i<ik.length; i++){
				Object[] ob = {true, ik[i].getX(),ik[i].getY()};
				setChanged();
				notifyObservers(ob);
			}
		}
		else if(ibilgailuMatrizea[x][y] == null){
			ibilgailuMatrizea[x][y] = new Ura();
			Object[] ob = {false, x,y};
			setChanged();
			notifyObservers(ob);
		}
		return jo;
	}
	public void uavErasoa(int zut,int err){
		for(int y=err-2; y < err+2; y++){
			for(int x=zut-2; x < zut+2; x++){
				try{
					if(x<0 || x>14 || y<0 || y>14){
						{throw new TablerotikKanpo();}
					}
					if((ibilgailuMatrizea[x][y] !=null) &&!(ibilgailuMatrizea[x][y] instanceof Ura ) ){
						int[] kor = {x,y};
						setChanged();
						notifyObservers(kor);
					}
				}catch(TablerotikKanpo e){}
			}
		}
	}
}
