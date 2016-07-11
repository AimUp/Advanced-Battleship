package proiektua.UI;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import proiektua.advancedBattleship.AdvancedBattleship;
import proiektua.advancedBattleship.JokalariZerrenda;
import proiektua.advancedBattleship.Jokalaria;
import proiektua.advanncedBattleship.baliabideak.Irudiak;
import proiektua.advanncedBattleship.baliabideak.Textua;

public class Leihoa extends JFrame implements Observer{

	private static final long serialVersionUID = 1L;
	private static Leihoa nLeihoa = null;
	private JPanel unekoPanela;

	private Leihoa() {
		JokalariZerrenda.getJokalariZerrenda().addObserver(this);
		AdvancedBattleship.getAdvancedBattleship().addObserver(this);
		Irudiak.kargatu();
		Textua.kargatu();
		setTitle("ADVANCED BATTLESHIP");
		setIconImage(Irudiak.ikonoa);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static Leihoa getLeihoa(){
		if(nLeihoa==null){
			nLeihoa = new Leihoa();
		}
		return nLeihoa;
	}
	
	public void panelaAldatu(JPanel panela){
		getContentPane().removeAll();
		unekoPanela = panela;
		getContentPane().add(unekoPanela);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public JPanel getUnekoPanela(){
		return unekoPanela;
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof JokalariZerrenda){
			if(arg instanceof Integer){
				panelaAldatu(new ItsasontziakKokatuUI((Integer) arg));
			}
			else{
				panelaAldatu(TableroenPanelaUI.getTableroenPanelaUI());
				TableroenPanelaUI.getTableroenPanelaUI().txandaJokatu();
			}
		}
		else if(o instanceof AdvancedBattleship){
			if(arg instanceof Jokalaria){
				panelaAldatu(new IrabazlePanelaUI((Jokalaria) arg));
			}
			else{
				panelaAldatu(TableroenPanelaUI.getTableroenPanelaUI());
				TableroenPanelaUI.getTableroenPanelaUI().txandaJokatu();
			}
		}
	}
}
