package proiektua.advancedBattleship;

import proiektua.salbuespenak.JotaDago;

public class ItsasontziKokalekua {
	
	private int zut;
	private int err;
	private boolean jota = false;
	
	public ItsasontziKokalekua(){
	}
	
	public void setZutEtaErr(int x, int y){
		zut = x;
		err = y;
	}
	
	public void jo() throws JotaDago{
		if(jota){
			{throw new JotaDago();}
		}
		jota = true;
	}
	
	public boolean jotaDago(){
		return jota;
	}
	
	public boolean kokalekuHauDa(int x, int y){
		if(zut==x && err==y) return true;
		else return false;
	}
	
	protected int getX(){
		return zut;
	}
	
	protected int getY(){
		return err;
	}
}
