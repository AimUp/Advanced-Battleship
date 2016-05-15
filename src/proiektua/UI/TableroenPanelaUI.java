package proiektua.UI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import proiektua.advancedBattleship.AdvancedBattleship;
import proiektua.advancedBattleship.Bonbarderoa;
import proiektua.advancedBattleship.ErasoMota;
import proiektua.advancedBattleship.Fragata;
import proiektua.advancedBattleship.HegazkinGarraiolaria;
import proiektua.advancedBattleship.ItsasoIbilgailua;
import proiektua.advancedBattleship.Itsaspekoa;
import proiektua.advancedBattleship.JokalariZerrenda;
import proiektua.advancedBattleship.Korazatua;
import proiektua.advancedBattleship.Mina;
import proiektua.advancedBattleship.UAV;
import proiektua.advanncedBattleship.baliabideak.Irudiak;

public class TableroenPanelaUI extends JPanel{

	private static final long serialVersionUID = 1L;
	private static TableroenPanelaUI nTableroenPanelaUI = null;
	private TableroaUI tableroa1 = new TableroaUI();
	private JPanel aukerakPan = new AukerakPanelaUI("");
	private TableroaUI tableroa2 = new TableroaUI();
	private JPanel tab;
	private ErasoMota unekoErasoa;

	private TableroenPanelaUI(){
		JokalariZerrenda.getJokalariZerrenda().tableroetanObservablea(0,tableroa1);
		JokalariZerrenda.getJokalariZerrenda().tableroetanObservablea(1,tableroa2);
		
		Leihoa.getLeihoa().setSize(854, 322);
		setLayout(new BorderLayout());
		
		JPanel j = new JPanel();
		j.setLayout(new GridLayout(1, 3));
		JLabel jok1 = new JLabel(JokalariZerrenda.getJokalariZerrenda().getJokalariarenIzena(0), SwingConstants.CENTER);
		JLabel jok2 = new JLabel(JokalariZerrenda.getJokalariZerrenda().getJokalariarenIzena(1), SwingConstants.CENTER);
		j.add(jok1);
		j.add(new JLabel(""));
		j.add(jok2);
		add(j, BorderLayout.NORTH);
		
		tab = new JPanel();
		tab.setLayout(new GridLayout(1, 3));
		tab.add(tableroa1, 0);
		tab.add(aukerakPan, 1);
		tab.add(tableroa2, 2);
		add(tab, BorderLayout.CENTER);
	}
	
	public static TableroenPanelaUI getTableroenPanelaUI(){
		if(nTableroenPanelaUI==null){
			nTableroenPanelaUI = new TableroenPanelaUI();
		}
		return nTableroenPanelaUI;
	}
	
	public void aukerakAldatu(JPanel panela){
		tab.remove(1);
		aukerakPan = panela;
		tab.add(aukerakPan, 1);
		Leihoa.getLeihoa().setVisible(true);
	}
	
	public void txandaJokatu(){
		aukerakAldatu(new AukerakPanelaUI(JokalariZerrenda.getJokalariZerrenda().getJokalariarenIzena(AdvancedBattleship.getAdvancedBattleship().unekoTxanda())));
		tableroa1.tableroaDesgaitu(true);
		tableroa1.setEnabled(false);
		tableroa2.tableroaDesgaitu(true);
		tableroa2.setEnabled(false);
	}
	
	public void erasoEgitekoPrest(ErasoMota erasoa){
		unekoErasoa = erasoa;
		int txanda = AdvancedBattleship.getAdvancedBattleship().unekoTxanda();
		if(txanda==0){
			tableroa1.tableroaDesgaitu(true);
			tableroa1.setEnabled(false);
			tableroa2.tableroaDesgaitu(false);
			tableroa2.setEnabled(true);
		}
		else if(txanda==1){
			tableroa2.tableroaDesgaitu(true);
			tableroa2.setEnabled(false);
			tableroa1.tableroaDesgaitu(false);
			tableroa1.setEnabled(true);
		}
	}
	
	public void tableroanKlik(int x, int y){
		if(unekoErasoa != null){
			AdvancedBattleship.getAdvancedBattleship().jokarariakErasoaBurutu(x, y, unekoErasoa);
			if(!(unekoErasoa instanceof ItsasoIbilgailua)){
				TableroaUI tablero = erabilgarriTableroa();
				for(int i=0; i<15; i++){
					for(int j=0; j<15; j++){
						tablero.kasilaBerrezarri(i, j);
					}
				}
				unekoErasoa=null;
				aukerakAldatu(new ErasoaAukeratuUI());
			}
		}
	}
	
	public void erasoaKokatu(ItsasoIbilgailua its){
		aukerakAldatu(new JPanel());
	}
	
	private TableroaUI erabilgarriTableroa(){
		if(tableroa1.isEnabled()) return tableroa1;
		else return tableroa2;
	}
	
	public void kasilaGainean(boolean b, int x, int y){
		TableroaUI tablero = erabilgarriTableroa();
		
		if(b){
			if(unekoErasoa instanceof Korazatua){
				int pos = 0;
				for(int i=-2; i<3; i++){
					for(int j=-2; j<3; j++){
						tablero.kasilaIrudiaAldatu(Irudiak.korazatuaTarget[pos], x+i, y+j);
						pos++;
					}
				}
			}
			else if(unekoErasoa instanceof HegazkinGarraiolaria){
				tablero.kasilaIrudiaAldatu(Irudiak.target[0], x, y);
			}
			else if(unekoErasoa instanceof Fragata){
				tablero.kasilaIrudiaAldatu(Irudiak.target[0], x, y);
			}
			else if(unekoErasoa instanceof Itsaspekoa){
				tablero.kasilaIrudiaAldatu(Irudiak.target[0], x, y);
			}
			else if(unekoErasoa instanceof Bonbarderoa){
				for(int i=-1; i<2; i++){
					for(int j=0; j<15; j++){
						tablero.kasilaIrudiaAldatu(Irudiak.kasilaGorria, j, y+i);
					}
				}
			}
			else if(unekoErasoa instanceof UAV){
				int pos = 0;
				for(int i=-2; i<3; i++){
					for(int j=-2; j<3; j++){
						tablero.kasilaIrudiaAldatu(Irudiak.radar[pos], x+i, y+j);
						pos++;
					}
				}
			}
			else if(unekoErasoa instanceof Mina){
				int pos = 1;
				for(int i=-1; i<2; i++){
					for(int j=-1; j<2; j++){
						tablero.kasilaIrudiaAldatu(Irudiak.target[pos], x+i, y+j);
						pos++;
					}
				}
			}
		}
		else{
			if(unekoErasoa instanceof Korazatua){
				for(int i=-2; i<3; i++){
					for(int j=-2; j<3; j++){
						tablero.kasilaBerrezarri(x+i, y+j);
					}
				}
			}
			else if(unekoErasoa instanceof HegazkinGarraiolaria){
				tablero.kasilaBerrezarri(x, y);
			}
			else if(unekoErasoa instanceof Fragata){
				tablero.kasilaBerrezarri(x, y);
			}
			else if(unekoErasoa instanceof Itsaspekoa){
				tablero.kasilaBerrezarri(x, y);
			}
			else if(unekoErasoa instanceof Bonbarderoa){
				for(int i=-1; i<2; i++){
					for(int j=0; j<15; j++){
						tablero.kasilaBerrezarri(j, y+i);
					}
				}
			}
			else if(unekoErasoa instanceof UAV){
				for(int i=-2; i<3; i++){
					for(int j=-2; j<3; j++){
						tablero.kasilaBerrezarri(x+i, y+j);
					}
				}
			}
			else if(unekoErasoa instanceof Mina){
				for(int i=-1; i<2; i++){
					for(int j=-1; j<2; j++){
						tablero.kasilaBerrezarri(x+i, y+j);
					}
				}
			}
		}
	}
}
