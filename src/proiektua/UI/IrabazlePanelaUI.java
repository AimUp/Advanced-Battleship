package proiektua.UI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import proiektua.advancedBattleship.Jokalaria;

public class IrabazlePanelaUI extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public IrabazlePanelaUI(Jokalaria j){
		Leihoa.getLeihoa().setSize(500,300);
		setLayout(new BorderLayout());
		JLabel text = new JLabel("IRABAZI EGIN DUZU", SwingConstants.CENTER);
		add(text, BorderLayout.NORTH);
		
		JLabel izena = new JLabel(j.getIzena(), SwingConstants.CENTER);
		izena.setForeground(Color.GREEN);
		add(izena, BorderLayout.CENTER);
	}
}
