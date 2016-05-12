package proiektua.UI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class AukerakPanelaUI extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel izena;
	
	public AukerakPanelaUI(){
		setLayout(new BorderLayout(0,50));
		
		JPanel jokalaria = new JPanel();
		jokalaria.setLayout(new GridLayout(2,1,0,5));
		JLabel txanda = new JLabel("JOKALARIAREN TXANDA:", SwingConstants.CENTER); 
		izena = new JLabel("", SwingConstants.CENTER); 
		jokalaria.add(txanda);
		jokalaria.add(izena);
		
		JPanel aukerak = new JPanel();
		JButton eraso = new JButton("ERASO");
		eraso.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TableroenPanelaUI.getTableroenPanelaUI().aukerakAldatu(new ErasoaAukeratuUI());
			}
		});
		JButton denda = new JButton("DENDA");
		denda.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TableroenPanelaUI.getTableroenPanelaUI().aukerakAldatu(new DendaUI());
			}
		});
		aukerak.add(eraso);
		aukerak.add(denda);
		
		add(jokalaria, BorderLayout.NORTH);
		add(aukerak, BorderLayout.CENTER);
	}
	
	public void txandaJokalariaAldatu(String i){
		izena.setText(i);
	}
}
