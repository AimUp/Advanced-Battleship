package proiektua.advanncedBattleship.baliabideak;

import javax.swing.ImageIcon;

public class Irudiak {
	
	public static ImageIcon ura;
	public static ImageIcon itsaspekoa;
	public static ImageIcon radarBarkuak;
	public static ImageIcon bonbarderoErasoa;
	public static ImageIcon[] itsasontziak = new ImageIcon[10];
	public static ImageIcon[] tiroak = new ImageIcon[2];
	public static ImageIcon[] target = new ImageIcon[10];
	public static ImageIcon[] korazatuaTarget = new ImageIcon[25];
	public static ImageIcon[] radar = new ImageIcon[25];
	

	public static void kargatu(){
		itsasontziakKargatu();
		uraKargatu();
		tiroakKargatu();
		targetaKargatu();
		korazatuaTargetKargatu();
		kargatuRadarra();
	}
	
	private static void itsasontziakKargatu(){
		itsasontziak[0] = new ImageIcon(Irudiak.class.getResource("batt1.gif"));
		itsasontziak[1] = new ImageIcon(Irudiak.class.getResource("batt2.gif"));
		itsasontziak[2] = new ImageIcon(Irudiak.class.getResource("batt3.gif"));
		itsasontziak[3] = new ImageIcon(Irudiak.class.getResource("batt4.gif"));
		itsasontziak[4] = new ImageIcon(Irudiak.class.getResource("batt5.gif"));
		itsasontziak[5] = new ImageIcon(Irudiak.class.getResource("batt6.gif"));
		itsasontziak[6] = new ImageIcon(Irudiak.class.getResource("batt7.gif"));
		itsasontziak[7] = new ImageIcon(Irudiak.class.getResource("batt8.gif"));
		itsasontziak[8] = new ImageIcon(Irudiak.class.getResource("batt9.gif"));
		itsasontziak[9] = new ImageIcon(Irudiak.class.getResource("batt10.gif"));
		
		itsaspekoa = new ImageIcon(Irudiak.class.getResource("itsaspeko.gif"));
	}
	
	private static void uraKargatu(){
		ura = new ImageIcon(Irudiak.class.getResource("batt100.gif"));
	}
	
	private static void tiroakKargatu(){
		tiroak[0] = new ImageIcon(Irudiak.class.getResource("jo.gif")); 
		tiroak[1] = new ImageIcon(Irudiak.class.getResource("ura.gif")); 
	}
	
	private static void targetaKargatu(){
		target[0] = new ImageIcon(Irudiak.class.getResource("target.png")); 
		target[1] = new ImageIcon(Irudiak.class.getResource("target1.png")); 
		target[2] = new ImageIcon(Irudiak.class.getResource("target2.png")); 
		target[3] = new ImageIcon(Irudiak.class.getResource("target3.png")); 
		target[4] = new ImageIcon(Irudiak.class.getResource("target4.png")); 
		target[5] = new ImageIcon(Irudiak.class.getResource("target5.png")); 
		target[6] = new ImageIcon(Irudiak.class.getResource("target6.png")); 
		target[7] = new ImageIcon(Irudiak.class.getResource("target7.png")); 
		target[8] = new ImageIcon(Irudiak.class.getResource("target8.png")); 
		target[9] = new ImageIcon(Irudiak.class.getResource("target9.png")); 
		
		bonbarderoErasoa = new ImageIcon(Irudiak.class.getResource("bonbardero.png")); 
	}
	
	private static void korazatuaTargetKargatu(){
		korazatuaTarget[0] = new ImageIcon(Irudiak.class.getResource("korazatua1.png"));
		korazatuaTarget[1] = new ImageIcon(Irudiak.class.getResource("korazatua2.png")); 
		korazatuaTarget[2] = new ImageIcon(Irudiak.class.getResource("korazatua3.png")); 
		korazatuaTarget[3] = new ImageIcon(Irudiak.class.getResource("korazatua4.png")); 
		korazatuaTarget[4] = new ImageIcon(Irudiak.class.getResource("korazatua5.png")); 
		korazatuaTarget[5] = new ImageIcon(Irudiak.class.getResource("korazatua6.png")); 
		korazatuaTarget[6] = new ImageIcon(Irudiak.class.getResource("korazatua7.png")); 
		korazatuaTarget[7] = new ImageIcon(Irudiak.class.getResource("korazatua8.png")); 
		korazatuaTarget[8] = new ImageIcon(Irudiak.class.getResource("korazatua9.png")); 
		korazatuaTarget[9] = new ImageIcon(Irudiak.class.getResource("korazatua10.png")); 
		korazatuaTarget[10] = new ImageIcon(Irudiak.class.getResource("korazatua11.png")); 
		korazatuaTarget[11] = new ImageIcon(Irudiak.class.getResource("korazatua12.png")); 
		korazatuaTarget[12] = new ImageIcon(Irudiak.class.getResource("korazatua13.png")); 
		korazatuaTarget[13] = new ImageIcon(Irudiak.class.getResource("korazatua14.png")); 
		korazatuaTarget[14] = new ImageIcon(Irudiak.class.getResource("korazatua15.png")); 
		korazatuaTarget[15] = new ImageIcon(Irudiak.class.getResource("korazatua16.png")); 
		korazatuaTarget[16] = new ImageIcon(Irudiak.class.getResource("korazatua17.png")); 
		korazatuaTarget[17] = new ImageIcon(Irudiak.class.getResource("korazatua18.png"));
		korazatuaTarget[18] = new ImageIcon(Irudiak.class.getResource("korazatua19.png")); 
		korazatuaTarget[19] = new ImageIcon(Irudiak.class.getResource("korazatua20.png")); 
		korazatuaTarget[20] = new ImageIcon(Irudiak.class.getResource("korazatua21.png")); 
		korazatuaTarget[21] = new ImageIcon(Irudiak.class.getResource("korazatua22.png")); 
		korazatuaTarget[22] = new ImageIcon(Irudiak.class.getResource("korazatua23.png")); 
		korazatuaTarget[23] = new ImageIcon(Irudiak.class.getResource("korazatua24.png")); 
		korazatuaTarget[24] = new ImageIcon(Irudiak.class.getResource("korazatua25.png")); 
	}
	
	private static void kargatuRadarra(){
		radar[0] = new ImageIcon(Irudiak.class.getResource("radar1.png"));
		radar[1] = new ImageIcon(Irudiak.class.getResource("radar2.png")); 
		radar[2] = new ImageIcon(Irudiak.class.getResource("radar3.png")); 
		radar[3] = new ImageIcon(Irudiak.class.getResource("radar4.png")); 
		radar[4] = new ImageIcon(Irudiak.class.getResource("radar5.png")); 
		radar[5] = new ImageIcon(Irudiak.class.getResource("radar6.png")); 
		radar[6] = new ImageIcon(Irudiak.class.getResource("radar7.png")); 
		radar[7] = new ImageIcon(Irudiak.class.getResource("radar8.png")); 
		radar[8] = new ImageIcon(Irudiak.class.getResource("radar9.png")); 
		radar[9] = new ImageIcon(Irudiak.class.getResource("radar10.png")); 
		radar[10] = new ImageIcon(Irudiak.class.getResource("radar11.png")); 
		radar[11] = new ImageIcon(Irudiak.class.getResource("radar12.png")); 
		radar[12] = new ImageIcon(Irudiak.class.getResource("radar13.png")); 
		radar[13] = new ImageIcon(Irudiak.class.getResource("radar14.png")); 
		radar[14] = new ImageIcon(Irudiak.class.getResource("radar15.png")); 
		radar[15] = new ImageIcon(Irudiak.class.getResource("radar16.png")); 
		radar[16] = new ImageIcon(Irudiak.class.getResource("radar17.png")); 
		radar[17] = new ImageIcon(Irudiak.class.getResource("radar18.png"));
		radar[18] = new ImageIcon(Irudiak.class.getResource("radar19.png")); 
		radar[19] = new ImageIcon(Irudiak.class.getResource("radar20.png")); 
		radar[20] = new ImageIcon(Irudiak.class.getResource("radar21.png")); 
		radar[21] = new ImageIcon(Irudiak.class.getResource("radar22.png")); 
		radar[22] = new ImageIcon(Irudiak.class.getResource("radar23.png")); 
		radar[23] = new ImageIcon(Irudiak.class.getResource("radar24.png")); 
		radar[24] = new ImageIcon(Irudiak.class.getResource("radar25.png")); 
		
		radarBarkuak = new ImageIcon(Irudiak.class.getResource("radarBarkua.png")); 
	}
	
}
