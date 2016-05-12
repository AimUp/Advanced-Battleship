package proiektua.UI;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import proiektua.advanncedBattleship.baliabideak.Irudiak;
import proiektua.salbuespenak.TablerotikKanpo;

public class TableroaUI extends JPanel implements Observer{

	private static final long serialVersionUID = 1L;
	private KasilaUI[][] kasilak;
	boolean itxaron = true;

	public TableroaUI(){
		kasilak = new KasilaUI[15][15];
		tableroaEraiki();
	}
	
	private void tableroaEraiki(){
		setLayout(new GridLayout(15, 15));
		for(int x=0; x<15; x++){
			for(int y=0; y<15; y++){
				KasilaUI k = new KasilaUI(x, y);
				kasilak[x][y] = k;
				add(k);
			}
		}
	}
	
	public void kasilaIrudiaAldatu(ImageIcon ima, int x, int y){
		try{
			if(x<0 || x>14 || y<0 || y>14){
				{throw new TablerotikKanpo();}
			}
			kasilak[x][y].setIcon(ima);
		}
		catch(TablerotikKanpo e){}
	}
	
	public void kasilaAldatu(ImageIcon ima, int x, int y){
		
		try{
			if(x<0 || x>14 || y<0 || y>14){
				{throw new TablerotikKanpo();}
			}
			kasilak[x][y].aldatu(ima);
		}
		catch(TablerotikKanpo e){}
	}
	
	public void kasilaBerrezarri(int x, int y){
		try{
			if(x<0 || x>14 || y<0 || y>14){
				{throw new TablerotikKanpo();}
			}
			kasilak[x][y].irudiaBerrezarri();
		}
		catch(TablerotikKanpo e){}
	}
	
	public void tableroaDesgaitu(boolean b){
		for(int x=0; x<15; x++){
			for(int y=0; y<15; y++){
				kasilak[x][y].kasilaDesgatu(b);
			}
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof Object[]){
			Object[] argumentuak = (Object[]) arg;
			boolean jo = (boolean) argumentuak[0];
			if(jo){
				kasilaAldatu(Irudiak.tiroak[0], (Integer)argumentuak[1], (Integer)argumentuak[2]);
			}
			else{
				kasilaAldatu(Irudiak.tiroak[1], (Integer)argumentuak[1], (Integer)argumentuak[2]);     
			}
		}
		else if(arg instanceof int[]){
			int[] argumentuak = (int[]) arg;
			kasilaAldatu(Irudiak.radarBarkuak, argumentuak[0], argumentuak[1]);
		}
	}
}
