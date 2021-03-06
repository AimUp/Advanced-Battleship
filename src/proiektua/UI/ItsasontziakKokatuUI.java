 package proiektua.UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import proiektua.advancedBattleship.Fragata;
import proiektua.advancedBattleship.HegazkinGarraiolaria;
import proiektua.advancedBattleship.JokalariZerrenda;
import proiektua.advancedBattleship.Korazatua;
import proiektua.advanncedBattleship.baliabideak.Irudiak;
import proiektua.advanncedBattleship.baliabideak.Textua;
import proiektua.salbuespenak.EzinKokatu;
import proiektua.salbuespenak.HasierakoakJarrita;

import javax.swing.JComboBox;

public class ItsasontziakKokatuUI extends JPanel{

	private static final long serialVersionUID = 1L;
	private JRadioButton horiz;
	private JRadioButton bert;
	private JComboBox<String> comBox;
	private TableroaUI tableroa;
	private int jokalaria;  

	public ItsasontziakKokatuUI(int jokPos){
		jokalaria=jokPos;
		Leihoa.getLeihoa().setSize(284, 405);
		setLayout(new BorderLayout());
		Leihoa.getLeihoa().setJMenuBar(new MenuaUI());
		
		JPanel TextuPanela = new JPanel();
		TextuPanela.setLayout(new GridLayout(3, 1));
		
		JLabel titul = new JLabel(JokalariZerrenda.getJokalariZerrenda().getJokalariarenIzena(jokalaria) + Textua.kokatuZureItsasontziak , SwingConstants.CENTER);
		titul.setForeground(new Color(177, 177, 177));
		TextuPanela.add(titul);
		  
		JPanel auk = new JPanel();
		auk.setLayout(new BorderLayout());
		JLabel textua = new JLabel(Textua.aukeratu);
		auk.add(textua, BorderLayout.WEST);
		String[] a = {Textua.fragata, Textua.korazatua, Textua.HegazkinGarraiolaria};
		comBox = new JComboBox<String>(a);
		auk.add(comBox);
		TextuPanela.add(auk, BorderLayout.EAST);
		
		JPanel bot = new JPanel();
		ButtonGroup norantzaAuk = new ButtonGroup();
		horiz = new JRadioButton(Textua.horizontal);
		horiz.setSelected(true);
		bert = new JRadioButton(Textua.bertikal);
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
	}
	
	public void arratoiaGainean(int x, int y){
		if(bert.isSelected()){
			tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[5], x, y);
			switch (comBox.getSelectedIndex()) {
				case 0: 
					tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[9], x+1, y);
					break;
	
				case 1:
					tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[6], x+1, y);
					tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[9], x+2, y);
					break;
	
				case 2:
					tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[6], x+1, y);
					tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[7], x+2, y);
					tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[9], x+3, y);
					break;
			}
		}
		else if(horiz.isSelected()){
			tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[0], x, y);
			switch (comBox.getSelectedIndex()) {
			case 0: 
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[4], x, y+1);
				break;

			case 1:
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[1], x, y+1);
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[4], x, y+2);
				break;

			case 2:
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[1], x, y+1);
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[2], x, y+2);
				tableroa.kasilaIrudiaAldatu(Irudiak.itsasontziak[4], x, y+3);
				break;
			}
		}
	}
	
	public void arratoiaIrten(int x, int y){
		if(bert.isSelected()){
			switch (comBox.getSelectedIndex()) {
				case 0: 
					for(int i=0; i<2; i++){
						tableroa.kasilaBerrezarri(x+i, y);
					}
					break;
				case 1:
					for(int i=0; i<3; i++){
						tableroa.kasilaBerrezarri(x+i, y);
					}
					break;
				case 2:
					for(int i=0; i<4; i++){
						tableroa.kasilaBerrezarri(x+i, y);
					}
					break;
			}
		}
		else if(horiz.isSelected()){
			switch (comBox.getSelectedIndex()) {
			case 0: 
				for(int i=0; i<2; i++){
					tableroa.kasilaBerrezarri(x, y+i);
				}
				break;
			case 1:
				for(int i=0; i<3; i++){
					tableroa.kasilaBerrezarri(x, y+i);
				}
				break;
			case 2:
				for(int i=0; i<4; i++){
					tableroa.kasilaBerrezarri(x, y+i);
				}
				break;
			}
		}
	}
	
	public void klikEginDa(int x, int y) throws HasierakoakJarrita{ //Advanced battleship-era bidali itsasontzia, kokatu ezin bada false itsuli eta ez pantailaratu
		if(bert.isSelected()){
			switch (comBox.getSelectedIndex()) {
				case 0:
					Fragata f = new Fragata();
					try {
						JokalariZerrenda.getJokalariZerrenda().hasierakoErasoaKokatu(f, 'b', x, y, jokalaria);
						tableroa.kasilaAldatu(Irudiak.itsasontziak[5], x, y);
						tableroa.kasilaAldatu(Irudiak.itsasontziak[9], x+1, y);
					} catch (EzinKokatu e) {}
					break;
	
				case 1:
					Korazatua k = new Korazatua();
					try {
						JokalariZerrenda.getJokalariZerrenda().hasierakoErasoaKokatu(k, 'b', x, y, jokalaria);
						tableroa.kasilaAldatu(Irudiak.itsasontziak[5], x, y);
						tableroa.kasilaAldatu(Irudiak.itsasontziak[6], x+1, y);
						tableroa.kasilaAldatu(Irudiak.itsasontziak[9], x+2, y);
					} catch (EzinKokatu e) {}
					break;
	
				case 2:
					HegazkinGarraiolaria h = new HegazkinGarraiolaria();
					try {
						JokalariZerrenda.getJokalariZerrenda().hasierakoErasoaKokatu(h, 'b', x, y, jokalaria);
						tableroa.kasilaAldatu(Irudiak.itsasontziak[5], x, y);
						tableroa.kasilaAldatu(Irudiak.itsasontziak[6], x+1, y);
						tableroa.kasilaAldatu(Irudiak.itsasontziak[7], x+2, y);
						tableroa.kasilaAldatu(Irudiak.itsasontziak[9], x+3, y);
					} catch (EzinKokatu e) {}
					break;
			}
		}
		else if(horiz.isSelected()){
			switch (comBox.getSelectedIndex()) {
			case 0: 
				Fragata f = new Fragata();
				try {
					JokalariZerrenda.getJokalariZerrenda().hasierakoErasoaKokatu(f, 'h', x, y, jokalaria);
					tableroa.kasilaAldatu(Irudiak.itsasontziak[0], x, y);
					tableroa.kasilaAldatu(Irudiak.itsasontziak[4], x, y+1);
				} catch (EzinKokatu e) {}
				break;

			case 1:
				Korazatua k = new Korazatua();
				try {
					JokalariZerrenda.getJokalariZerrenda().hasierakoErasoaKokatu(k, 'h', x, y, jokalaria);
					tableroa.kasilaAldatu(Irudiak.itsasontziak[0], x, y);
					tableroa.kasilaAldatu(Irudiak.itsasontziak[1], x, y+1);
					tableroa.kasilaAldatu(Irudiak.itsasontziak[4], x, y+2);
				} catch (EzinKokatu e) {}
				break;
				
			case 2:
				HegazkinGarraiolaria h = new HegazkinGarraiolaria();
				try {
					JokalariZerrenda.getJokalariZerrenda().hasierakoErasoaKokatu(h, 'h', x, y, jokalaria);
					tableroa.kasilaAldatu(Irudiak.itsasontziak[0], x, y);
					tableroa.kasilaAldatu(Irudiak.itsasontziak[1], x, y+1);
					tableroa.kasilaAldatu(Irudiak.itsasontziak[2], x, y+2);
					tableroa.kasilaAldatu(Irudiak.itsasontziak[4], x, y+3);
				} catch (EzinKokatu e) {}
				break;
			}
		}
	}
}