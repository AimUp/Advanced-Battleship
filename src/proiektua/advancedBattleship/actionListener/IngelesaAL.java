package proiektua.advancedBattleship.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proiektua.UI.Leihoa;
import proiektua.advanncedBattleship.baliabideak.Textua;

public class IngelesaAL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Textua.ingelesaKargatu();
		Leihoa.getLeihoa().menuaHasieratu();
	}

}
