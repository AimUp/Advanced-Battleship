package proiektua.UI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import proiektua.advancedBattleship.JokalariZerrenda;
import proiektua.advanncedBattleship.baliabideak.Irudiak;
import proiektua.salbuespenak.HasierakoakJarrita;

public class KasilaUI extends JButton implements MouseListener{

	private static final long serialVersionUID = 1L;
	private ImageIcon kasilaIrudia;
	private int zut;
	private int err;
	
	public KasilaUI(int x, int y){
		kasilaIrudia = Irudiak.ura;
		zut = x;
		err = y;
		ImageIcon i = Irudiak.ura;
		setIcon(i);
		addMouseListener(this);
	}
	
	public void aldatu(ImageIcon ima){
		kasilaIrudia = ima;
		irudiaBerrezarri();
	}
	
	public void irudiaBerrezarri(){
		setIcon(kasilaIrudia);
	}
	
	public void kasilaDesgatu(boolean b){
		irudiaBerrezarri();
		setEnabled(!b);
		if(b) removeMouseListener(this);
		else if(getMouseListeners().length<=1){
			addMouseListener(this);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(Leihoa.getLeihoa().getUnekoPanela() instanceof ItsasontziakKokatuUI){
			ItsasontziakKokatuUI i = (ItsasontziakKokatuUI) Leihoa.getLeihoa().getUnekoPanela();
			try {
				i.klikEginDa(zut, err);
			} catch (HasierakoakJarrita e1) {
				JokalariZerrenda.getJokalariZerrenda().hasierakoa();
			}
		}
		else if(Leihoa.getLeihoa().getUnekoPanela() instanceof TableroenPanelaUI){
			TableroenPanelaUI.getTableroenPanelaUI().tableroanKlik(zut, err);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(Leihoa.getLeihoa().getUnekoPanela() instanceof ItsasontziakKokatuUI){
			ItsasontziakKokatuUI i = (ItsasontziakKokatuUI) Leihoa.getLeihoa().getUnekoPanela();
			i.arratoiaGainean(zut, err);
		}
		else if(Leihoa.getLeihoa().getUnekoPanela() instanceof TableroenPanelaUI){
			TableroenPanelaUI.getTableroenPanelaUI().kasilaGainean(true, zut, err);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(Leihoa.getLeihoa().getUnekoPanela() instanceof ItsasontziakKokatuUI){
			ItsasontziakKokatuUI i = (ItsasontziakKokatuUI) Leihoa.getLeihoa().getUnekoPanela();
			i.arratoiaIrten(zut, err);
		}
		else if(Leihoa.getLeihoa().getUnekoPanela() instanceof TableroenPanelaUI){
			TableroenPanelaUI.getTableroenPanelaUI().kasilaGainean(false, zut, err);
		}
	}
	
	@Override
	public void mouseReleased(MouseEvent e){}
	@Override
	public void mouseClicked(MouseEvent e){}
	
}
