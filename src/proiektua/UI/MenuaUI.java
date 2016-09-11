package proiektua.UI;

import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuaUI extends JMenuBar{

	private static final long serialVersionUID = 1L;
	private static MenuaUI nMenuaUI = null;
	
	private MenuaUI(){
		this.setBorder(null);
		this.setBackground(new Color(89, 153, 124));
		JMenu m = new JMenu("a");
		m.add(new JMenuItem("a"));
		add(m);
	}
	
	public static MenuaUI getMenuaUI(){
		if(nMenuaUI == null){
			nMenuaUI = new MenuaUI();
		}
		return nMenuaUI;
	}
	
}
