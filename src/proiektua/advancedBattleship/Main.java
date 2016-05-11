package proiektua.advancedBattleship;

import proiektua.UI.IzenakPanelaUI;
import proiektua.UI.Leihoa;

public abstract class Main {

	public static void main(String[] args) {
		Leihoa.getLeihoa().panelaAldatu(new IzenakPanelaUI());
		AdvancedBattleship.getAdvancedBattleship().jokatu();
		
	}
}
