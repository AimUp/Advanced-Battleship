package proiektua.advancedBattleship;

import proiektua.salbuespenak.EzinKokatu;
import proiektua.salbuespenak.HasierakoakJarrita;
import proiektua.salbuespenak.PosizioaOkupatua;
import proiektua.salbuespenak.TablerotikKanpo;

public class HasierakoTableroaBuilder {

	private int fragata = 4;
	private int akorazatua = 3;
	private int hegazGarraio = 1;
	private ItsasoIbilgailua[][] ibilgailuMatrizea;
	private ListaErasoMota listaErasoak;
	
	public HasierakoTableroaBuilder(){
		int tableroTamaina = 15;
		ibilgailuMatrizea = new ItsasoIbilgailua[tableroTamaina][tableroTamaina];
		listaErasoak = new ListaErasoMota();
	}
	
	public void erasoaGehitu(ItsasoIbilgailua i, char c, int x, int y) throws EzinKokatu, HasierakoakJarrita{
		int luz = i.getLuzera();
		if(!kokatuDaiteke(i, x, y, c)){
			{throw new EzinKokatu();}
		}
		if(i instanceof Fragata) fragata--;
		else if(i instanceof Korazatua) akorazatua--;
		else if(i instanceof HegazkinGarraiolaria) hegazGarraio--;
		if(c=='b'){
			while(luz>0){
				ibilgailuMatrizea[x+(luz-1)][y] = i;
				i.kokalekuBatGehitu(luz-1, x+(luz-1), y);
				luz--;
			}
		}
		if(c=='h'){
			while(luz>0){
				ibilgailuMatrizea[x][y+(luz-1)] = i;
				i.kokalekuBatGehitu(luz-1, x, y+(luz-1));
				luz--;
			}
		}
		listaErasoak.erasoaGehitu(i);
		guztiakJarritaKonprobatu();
	}
	
	private void guztiakJarritaKonprobatu() throws HasierakoakJarrita{
		if(fragata<=0 && akorazatua<=0 && hegazGarraio<=0){
			{throw new HasierakoakJarrita();}
		}
	}
	
	protected ItsasoIbilgailua[][] getMatrizea(){
		return ibilgailuMatrizea;
	}
	
	protected ListaErasoMota getListaErasoak(){
		return listaErasoak;
	}
	
	private boolean kokatuDaiteke(ItsasoIbilgailua i, int x, int y, char c){
		boolean kokatu = true;
		if(i instanceof Fragata && fragata<=0) kokatu=false;
		else if(i instanceof Korazatua && akorazatua<=0) kokatu=false;
		else if(i instanceof HegazkinGarraiolaria && hegazGarraio<=0) kokatu=false;
		else {
			int l = 0;
			while(l<i.getLuzera() && kokatu){
				try{
					if(x<0 || x>14 || y<0 || y>14){
						{throw new TablerotikKanpo();}
					}
					try{
						if(ibilgailuMatrizea[x][y] != null){
							{throw new PosizioaOkupatua();}
						}
						l++;
						if(c=='b') x++;
						else if(c=='h')	y++;	
					}
					catch(PosizioaOkupatua e){
						kokatu = false;
					}
				}
				catch(TablerotikKanpo e){
					kokatu = false;
				}
			}
		}
		return kokatu;
	}
}
