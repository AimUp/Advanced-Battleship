package proiektua.advancedBattleship;

import proiektua.UI.IzenakPanelaUI;
import proiektua.UI.Leihoa;
import proiektua.UI.TableroenPanelaUI;

public abstract class Main {

	public static void main(String[] args) {
		Leihoa.getLeihoa().panelaAldatu(new IzenakPanelaUI());
		//Leihoa.getLeihoa().panelaAldatu(new TableroenPanelaUI());
		AdvancedBattleship.getAdvancedBattleship().jokatu();
	}
}
