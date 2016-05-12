package proiektua.UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import proiektua.advancedBattleship.AdvancedBattleship;
import proiektua.advancedBattleship.Denda;
import proiektua.advancedBattleship.ListaErasoMota;
import proiektua.salbuespenak.DirurikEz;
import proiektua.salbuespenak.ErasoaKokatu;

public class ErasoErosketaUI extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel izena;
	private JButton botoia;

	public ErasoErosketaUI(int i){
		ListaErasoMota lem = Denda.getDenda().getKatalogoa();
		
		setLayout(new BorderLayout());
		JPanel motak = new JPanel(new BorderLayout());
		izena = new JLabel((i+1) + "- " + lem.posiziokoErasoaLortu(i).getIzena(), SwingConstants.CENTER);
		JLabel l2 = new JLabel(lem.posiziokoErasoaLortu(i).informazioaInprimatu());
		JLabel l3 = new JLabel("PREZIOA: " + String.valueOf(lem.posiziokoErasoaLortu(i).getPrezioa()), SwingConstants.CENTER);
		motak.add(izena, BorderLayout.NORTH);
		motak.add(l2, BorderLayout.CENTER);
		motak.add(l3, BorderLayout.SOUTH);
		
		add(motak, BorderLayout.NORTH);
		botoia = new JButton("EROSI");
		botoia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				try {
					AdvancedBattleship.getAdvancedBattleship().dendanErosi((Character.getNumericValue(izena.getText().charAt(0)))-1);
				} catch (DirurikEz e1) {
					remove(botoia);
					JLabel er = new JLabel("Diruri nahikorik ez");
					er.setForeground(Color.red);
					add(er, BorderLayout.CENTER);
					Leihoa.getLeihoa().setVisible(true);
				} catch (ErasoaKokatu e1) {
					TableroenPanelaUI.getTableroenPanelaUI().erasoaKokatu(e1.getKokatzekoErasoa());
				}
			}
		});
		add(botoia, BorderLayout.CENTER);
	}
}
