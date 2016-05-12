package proiektua.UI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import proiektua.advancedBattleship.Denda;
import proiektua.advancedBattleship.ListaErasoMota;

public class DendaUI extends JPanel{

	private static final long serialVersionUID = 1L;

	public DendaUI(){
		setLayout(new BorderLayout());
		
		JButton itzuli = new JButton("ATZERA ITZULI");
		itzuli.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TableroenPanelaUI.getTableroenPanelaUI().aukerakAldatu(new AukerakPanelaUI());
			}
		});
		add(itzuli, BorderLayout.NORTH);
		
		JPanel erasoak = new JPanel(new GridLayout(7, 1,0,10));
		
		JScrollPane scrollPane = new JScrollPane(erasoak, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBorder(null);
		ListaErasoMota lem = Denda.getDenda().getKatalogoa();
		
		for(int i=0; i<lem.tamaina();i++){
			ErasoErosketaUI erasoa = new ErasoErosketaUI(i);
			erasoak.add(erasoa);
		}
	
		add(scrollPane, BorderLayout.CENTER);
	}
}
