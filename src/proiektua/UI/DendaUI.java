package proiektua.UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import proiektua.advancedBattleship.AdvancedBattleship;
import proiektua.advancedBattleship.Denda;
import proiektua.advancedBattleship.JokalariZerrenda;
import proiektua.advancedBattleship.ListaErasoMota;
import proiektua.advanncedBattleship.baliabideak.Textua;

public class DendaUI extends JPanel{

	private static final long serialVersionUID = 1L;

	public DendaUI(){
		setLayout(new BorderLayout());
		

		int dirua = AdvancedBattleship.getAdvancedBattleship().unekoDirua();
		JLabel diruKop = new JLabel(Textua.diruKop + dirua, SwingConstants.CENTER);
		add(diruKop, BorderLayout.NORTH);
		
		JPanel erasoak = new JPanel(new GridLayout(7, 1,0,10));
		erasoak.setOpaque(true);
		erasoak.setBackground(new Color(245, 245, 245));
		
		JScrollPane scrollPane = new JScrollPane(erasoak, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBorder(null);
		ListaErasoMota lem = Denda.getDenda().getKatalogoa();
		
		for(int i=0; i<lem.tamaina();i++){
			ErasoErosketaUI erasoa = new ErasoErosketaUI(i);
			erasoak.add(erasoa);
		}
	
		add(scrollPane, BorderLayout.CENTER);
		
		JButton itzuli = new JButton(Textua.atzera);
		itzuli.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String i = JokalariZerrenda.getJokalariZerrenda().getJokalariarenIzena(AdvancedBattleship.getAdvancedBattleship().unekoTxanda());
				TableroenPanelaUI.getTableroenPanelaUI().aukerakAldatu(new AukerakPanelaUI(i));
			}
		});
		add(itzuli, BorderLayout.SOUTH);
	}
}
