package proiektua.UI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import proiektua.advancedBattleship.AdvancedBattleship;
import proiektua.advancedBattleship.ErasoMota;
import proiektua.advancedBattleship.JokalariZerrenda;
import proiektua.advancedBattleship.ListaErasoMota;
import proiektua.advanncedBattleship.baliabideak.Textua;

public class ErasoaAukeratuUI extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private ListaErasoMota lem;
	private ButtonGroup botoiTaldea;

	public ErasoaAukeratuUI(){
		lem = JokalariZerrenda.getJokalariZerrenda().jokalariarenErasoMotak(AdvancedBattleship.getAdvancedBattleship().unekoTxanda());
		
		setLayout(new BorderLayout(0,10));
		
		JButton itzuli = new JButton(Textua.atzera);
		itzuli.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String i = JokalariZerrenda.getJokalariZerrenda().getJokalariarenIzena(AdvancedBattleship.getAdvancedBattleship().unekoTxanda());
				TableroenPanelaUI.getTableroenPanelaUI().aukerakAldatu(new AukerakPanelaUI(i));
			}
		});
		
		JLabel erasoa = new JLabel(Textua.erasoAuk, SwingConstants.CENTER);
		
		JPanel aukerak = new JPanel(new GridLayout(lem.tamaina(),1,0,5));
		botoiTaldea = new ButtonGroup();
		for(int i=0; i<lem.tamaina();i++){
			ErasoMota em = lem.posiziokoErasoaLortu(i);
			JRadioButton bot = new JRadioButton((i+1)+"- "+em.getIzena());
			bot.addActionListener(this);
			botoiTaldea.add(bot);
			aukerak.add(bot);
		}
		
		add(erasoa, BorderLayout.NORTH);
		add(aukerak, BorderLayout.CENTER);
		add(itzuli, BorderLayout.SOUTH);
	}
	
	public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
	
	private ErasoMota biltauErasoMota(String b){
		int pos = Integer.parseInt(b.split("-")[0])-1;
		return lem.posiziokoErasoaLortu(pos);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String izena = getSelectedButtonText(botoiTaldea);
		if(izena!=null){
			TableroenPanelaUI.getTableroenPanelaUI().erasoEgitekoPrest(biltauErasoMota(izena));
		}
	}
}
