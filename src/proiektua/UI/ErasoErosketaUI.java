package proiektua.UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import proiektua.advancedBattleship.AdvancedBattleship;
import proiektua.advancedBattleship.Denda;
import proiektua.advancedBattleship.JokalariZerrenda;
import proiektua.advancedBattleship.ListaErasoMota;
import proiektua.advanncedBattleship.baliabideak.Textua;
import proiektua.salbuespenak.DirurikEz;

public class ErasoErosketaUI extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel izena;
	private JButton botoia;
	private Timer t;

	public ErasoErosketaUI(int i){
		ListaErasoMota lem = Denda.getDenda().getKatalogoa();
		setOpaque(true);
		setBackground(new Color(245, 245, 245));
		
		setLayout(new BorderLayout());
		JPanel motak = new JPanel(new BorderLayout());
		motak.setOpaque(true);
		motak.setBackground(new Color(245, 245, 245));
		izena = new JLabel((i+1) + "- " + lem.posiziokoErasoaLortu(i).getIzena(), SwingConstants.CENTER);
		JLabel l2 = new JLabel(lem.posiziokoErasoaLortu(i).informazioaInprimatu());
		JLabel l3 = new JLabel(Textua.prezioa + String.valueOf(lem.posiziokoErasoaLortu(i).getPrezioa()), SwingConstants.CENTER);
		motak.add(izena, BorderLayout.NORTH);
		motak.add(l2, BorderLayout.CENTER);
		motak.add(l3, BorderLayout.SOUTH);
		
		add(motak, BorderLayout.NORTH);
		botoia = new JButton(Textua.erosi);
		botoia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				try {
					AdvancedBattleship.getAdvancedBattleship().dendanErosi((Character.getNumericValue(izena.getText().charAt(0)))-1);
					remove(botoia);
					JLabel er = new JLabel(Textua.erosketaEginDa);
					er.setForeground(Color.green);
					add(er, BorderLayout.CENTER);
					Leihoa.getLeihoa().setVisible(true);
					t = new Timer(500, new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e){
							String i = JokalariZerrenda.getJokalariZerrenda().getJokalariarenIzena(AdvancedBattleship.getAdvancedBattleship().unekoTxanda());
							TableroenPanelaUI.getTableroenPanelaUI().aukerakAldatu(new AukerakPanelaUI(i));
							t.stop();
						}
					});
					t.start();
				} catch (DirurikEz e1) {
					remove(botoia);
					JLabel er = new JLabel(Textua.diruNahikoEz);
					er.setForeground(Color.red);
					add(er, BorderLayout.CENTER);
					Leihoa.getLeihoa().setVisible(true);
				}
			}
		});
		add(botoia, BorderLayout.CENTER);
	}
}
