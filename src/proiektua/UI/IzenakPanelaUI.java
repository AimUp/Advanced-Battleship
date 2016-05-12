package proiektua.UI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import proiektua.advancedBattleship.AdvancedBattleship;

public class IzenakPanelaUI extends JPanel{

	private static final long serialVersionUID = 1L;
	private JTextField izena1;
	private JTextField izena2;
	private JLabel error = new JLabel();

	public IzenakPanelaUI(){
		Leihoa.getLeihoa().setSize(500,300);
		setLayout(new GridLayout(6, 1));
		
		JLabel text1 = new JLabel("LEHENENGO JOKALARIA", SwingConstants.CENTER);
		JLabel text2 = new JLabel("BIGARREN JOKALARIA", SwingConstants.CENTER);
		
		JLabel vs = new JLabel("VS", SwingConstants.CENTER);

		izena1 = new JTextField();
		izena1.setHorizontalAlignment(JTextField.CENTER);
		izena1.addActionListener(new AbstractAction(){
			private static final long serialVersionUID = 1L;
			@Override
		    public void actionPerformed(ActionEvent e){
				enterSakatu();
		    }
		});
		
		izena2 = new JTextField();
		izena2.setHorizontalAlignment(JTextField.CENTER);
		izena2.addActionListener(new AbstractAction(){
			private static final long serialVersionUID = 1L;
			@Override
		    public void actionPerformed(ActionEvent e){
				enterSakatu();
		    }
		});
		
		add(text1);
		add(izena1);
		add(vs);
		add(izena2);
		add(text2);
	}
	
	public void enterSakatu(){
		if((!(izena1.getText().isEmpty() || izena2.getText().isEmpty()))){
			if(!(izena1.getText().equals(izena2.getText()))){
				AdvancedBattleship.getAdvancedBattleship().jokatu(izena1.getText(), izena2.getText());
				//Leihoa.getLeihoa().panelaAldatu(new ItsasontziakKokatuUI());
			}
			else{
				izena1.setText("");
				izena2.setText("");
				remove(error);
				error = new JLabel("IZENAK EZBERDINAK IZAN BEHAR DIRA", SwingConstants.CENTER);
				error.setForeground(new Color(255, 0, 0));
				add(error);
				Leihoa.getLeihoa().setVisible(true);
			}
		}
		else{
			remove(error);
			error = new JLabel("JOKALARIEN IZENAK SARTU BEHAR DIRA", SwingConstants.CENTER);
			error.setForeground(new Color(255, 0, 0));
			add(error);
			Leihoa.getLeihoa().setVisible(true);
		}
	}
}
