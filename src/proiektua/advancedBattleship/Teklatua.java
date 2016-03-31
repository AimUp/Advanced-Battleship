package proiektua.advancedBattleship;

import java.util.Scanner;

public class Teklatua {

	private static Teklatua nTeklatua = null;
	private Scanner sc;
	
	private Teklatua(){
		sc = new Scanner(System.in);
	}
	
	public static Teklatua getTeklatua(){
		if(nTeklatua == null){
			nTeklatua = new Teklatua();
		}
		return nTeklatua;
	}
	
	public void hasierakoMezua(){
		System.out.println("\n\t ADVANCED BATTLESHIP \t");
		System.out.println("\n\n\n");
	}
	
	public String[] jokalariIzenak(int jokKop){
		String[] izenak = new String[jokKop];
		System.out.println("JOKALARIEN IZENAK SARTU:");
		System.out.println();
		for(int x=1; x<=jokKop; x++){
			System.out.println(x + " jokalariaren izena idatzi");
			izenak[x-1] = sc.nextLine();
			System.out.println();
		}
		System.out.println("\n\n\n");
		return izenak;
	}
	
}
