package proiektua.UI;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import proiektua.advancedBattleship.actionListener.EuskeraAL;
import proiektua.advancedBattleship.actionListener.GaztelaniaAL;
import proiektua.advancedBattleship.actionListener.IngelesaAL;
import proiektua.advanncedBattleship.baliabideak.Textua;

public class MenuaUI extends JMenuBar{

	private static final long serialVersionUID = 1L;
	
	public MenuaUI(){
		this.setBorder(null);
		this.setBackground(new Color(89, 153, 124));
		
		JMenu jokoMenu = new JMenu(Textua.jokoa);
		jokoMenu.add(new JMenuItem());
		
		JMenu laguntzaMenu = new JMenu(Textua.laguntza);
		JMenu hizkuntzaMenu = new JMenu(Textua.hizkuntza);
		
		JMenuItem eusMI = new JMenuItem(Textua.euskera);
		eusMI.addActionListener(new EuskeraAL());
		hizkuntzaMenu.add(eusMI);
		
		JMenuItem inMI = new JMenuItem(Textua.ingelesa);
		inMI.addActionListener(new IngelesaAL());
		hizkuntzaMenu.add(inMI);
		
		JMenuItem gazMInew = new JMenuItem(Textua.gaztelania);
		gazMInew.addActionListener(new GaztelaniaAL());
		hizkuntzaMenu.add(gazMInew);
		
		laguntzaMenu.add(hizkuntzaMenu);
		
		add(jokoMenu);
		add(Box.createHorizontalGlue());
		add(laguntzaMenu);
	}
}
