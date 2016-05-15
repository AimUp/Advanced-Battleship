package proiektua.UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import proiektua.advancedBattleship.AdvancedBattleship;
import proiektua.advancedBattleship.Fragata;
import proiektua.advancedBattleship.HegazkinGarraiolaria;
import proiektua.advancedBattleship.ItsasoIbilgailua;
import proiektua.advancedBattleship.Itsaspekoa;
import proiektua.advancedBattleship.Korazatua;
import proiektua.advancedBattleship.Ura;
import proiektua.advanncedBattleship.baliabideak.Irudiak;
import proiektua.salbuespenak.EzinKokatu;

public class IbilgailuBerriaKokatuUI extends JPanel{

	private static final long serialVersionUID = 1L;
	private TableroaUI tableroa;
	private JRadioButton horiz;
	private JRadioButton bert;
	private ItsasoIbilgailua ibilgailua;
	private ItsasoIbilgailua[][] matrizea;

	public IbilgailuBerriaKokatuUI(ItsasoIbilgailua[][] m, ItsasoIbilgailua i){
		matrizea = m;
		ibilgailua = i;
		
		Leihoa.getLeihoa().setSize(284, 405);
		setLayout(new BorderLayout());
		
		JPanel TextuPanela = new JPanel();
		TextuPanela.setLayout(new GridLayout(3, 1));
		
		JLabel titul = new JLabel("EROSITAKO ITSASONTZIA KOKATU: " + ibilgailua.getIzena(), SwingConstants.CENTER);
		titul.setForeground(new Color(177, 177, 177));
		TextuPanela.add(titul);
		  
		JPanel bot = new JPanel();
		ButtonGroup norantzaAuk = new ButtonGroup();
		horiz = new JRadioButton("HORIZONTAL");
		horiz.setSelected(true);
		bert = new JRadioButton("BERTIKAL");
		bert.setSize(30, 30);
		norantzaAuk.add(horiz);
		norantzaAuk.add(bert);
		bot.add(horiz);
		bot.add(bert);
		TextuPanela.add(bot);
		
		JPanel tabPanela = new JPanel();
		tabPanela.setLayout(new GridLayout(1,1));
		tableroa = new TableroaUI();
		tabPanela.add(tableroa, BorderLayout.NORTH);
		
		add(TextuPanela, BorderLayout.NORTH);
		add(tabPanela, BorderLayout.CENTER);	
		
		egungoItsasontziakBistaratu();
	}
	
	private void egungoItsasontziakBistaratu(){
		for(int i=0; i<15; i++){
			for(int j=0; j<15; j++){
				if(matrizea[i][j] instanceof ItsasoIbilgailua){
					tableroa.kasilaAldatu(Irudiak.kasilaGorria, i, j);
				}
				else if(matrizea[i][j] instanceof Ura){
					tableroa.kasilaAldatu(Irudiak.ura, i, j);
				}
			}
		}
	}
	
	public void arratoiaGainean(int x, int y){
		if(bert.isSelected()){
			if(ibilgailua instanceof Fragata) {
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[5], x, y);
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[9], x+1, y);
			}
			else if(ibilgailua instanceof Korazatua){
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[5], x, y);
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[6], x+1, y);
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[9], x+2, y);
			}
			else if(ibilgailua instanceof HegazkinGarraiolaria){
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[5], x, y);
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[6], x+1, y);
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[7], x+2, y);
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[9], x+3, y);
			}
			else if(ibilgailua instanceof Itsaspekoa){
				tableroa.kasilaIrudiaAldatu(Irudiak.itsaspekoa, x, y);
			}
		}
		else if(horiz.isSelected()){
			if(ibilgailua instanceof Fragata) {
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[0], x, y);
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[4], x, y+1);
			}
			else if(ibilgailua instanceof Korazatua){
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[0], x, y);
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[1], x, y+1);
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[4], x, y+2);
			}
			else if(ibilgailua instanceof HegazkinGarraiolaria){
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[0], x, y);
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[1], x, y+1);
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[2], x, y+2);
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[4], x, y+3);
			}
			else if(ibilgailua instanceof Itsaspekoa){
				tableroa.kasilaIrudiaAldatu(Irudiak.itsaspekoa, x, y);
			}
		}
	}
	
	public void arratoiaIrten(int x, int y){
		if(bert.isSelected()){
			if(ibilgailua instanceof Fragata) {
				for(int i=0; i<2; i++){
					tableroa.kasilaBerrezarri(x+i, y);
				}
			}
			else if(ibilgailua instanceof Korazatua){
				for(int i=0; i<3; i++){
					tableroa.kasilaBerrezarri(x+i, y);
				}
			}
			else if(ibilgailua instanceof HegazkinGarraiolaria){
				for(int i=0; i<4; i++){
					tableroa.kasilaBerrezarri(x+i, y);
				}
			}
			else if(ibilgailua instanceof Itsaspekoa){
				tableroa.kasilaBerrezarri(x, y);
			}
		}
		else if(horiz.isSelected()){
			if(ibilgailua instanceof Fragata) {
				for(int i=0; i<2; i++){
					tableroa.kasilaBerrezarri(x, y+i);
				}
			}
			else if(ibilgailua instanceof Korazatua){
				for(int i=0; i<3; i++){
					tableroa.kasilaBerrezarri(x, y+i);
				}
			}
			else if(ibilgailua instanceof HegazkinGarraiolaria){
				for(int i=0; i<4; i++){
					tableroa.kasilaBerrezarri(x, y+i);
				}
			}
			else if(ibilgailua instanceof Itsaspekoa){
				tableroa.kasilaBerrezarri(x, y);
			}
		}
	}
	
	public void klikEginDa(int x, int y){
		char norantza = 'b';
		if(bert.isSelected()) norantza = 'b';
		else if(horiz.isSelected()) norantza = 'h';
		try {
			AdvancedBattleship.getAdvancedBattleship().erasoBerriaKokatu(ibilgailua, norantza, x, y);
			Leihoa.getLeihoa().panelaAldatu(TableroenPanelaUI.getTableroenPanelaUI());
			Leihoa.getLeihoa().setSize(854, 322);
			Leihoa.getLeihoa().setLocationRelativeTo(null);
		} catch (EzinKokatu e) {}
	}
}
