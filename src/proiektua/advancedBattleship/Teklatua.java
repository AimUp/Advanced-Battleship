package proiektua.advancedBattleship;

import java.util.Scanner;

import proiektua.salbuespenak.ZenbakiOkerra;

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
		System.out.println("\n\t ⒶⒹⓋⒶⓃⒸⒺⒹ ⒷⒶⓉⓉⓁⒺⓈⒽⒾⓅ  \t");
		System.out.println("\n");
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
		return izenak;
	}
	
	public int zenbakiaEskatu(int pLehenengoa, int pAzkena){
		System.out.println("Zartu zure aukera: ");
		String aukera = sc.nextLine();
		int aukeraInt = -1;
		try {
		      aukeraInt = Integer.parseInt(aukera);
		} catch (NumberFormatException e) {
			System.out.println("Zure aukera zenbakien baten bidez egin behar duzu");
		    zenbakiaEskatu(pLehenengoa, pAzkena);
		}
		try{
			if(aukeraInt < pLehenengoa || aukeraInt > pAzkena){
				{throw new ZenbakiOkerra();}
				
			}
		}catch(ZenbakiOkerra e){
			System.out.println("Zure aukera " + pLehenengoa + " eta " + pAzkena + " zenbakien artekoa izan behar da");
		    zenbakiaEskatu(pLehenengoa, pAzkena);
		}
		System.out.println("\n\n");
		return aukeraInt;
	}
	
	public int jokalariakJokatzekoAukerak(){
		System.out.println("HAUKERATU EGIN NAHI DUZUN JOKALDIA: ");
		System.out.println();
		
		System.out.println("1. Eraso egin.");
		System.out.println("2. Dendan erosi.");
		System.out.println("3. ");
		System.out.println("4. ");
		System.out.println("0. Partida bertan behera hutsi.");
		
		return zenbakiaEskatu(0, 4);
	}
	
	public boolean baiEdoEz(){
		System.out.println("Sartu zure aukera-> BAI (B) edo EZ (E): ");
		String aukera = sc.nextLine();
		if(aukera.charAt(0)=='B' || aukera.charAt(0)=='b'){
			return true;
		}
		else if(aukera.charAt(0)=='E' || aukera.charAt(0)=='e'){
			return false;
		}
		else{
			System.out.println("Satutako erantzuna ez da egokia, berriz erantzun");
			System.out.println();
			return baiEdoEz();
		}
	}
	
	public int[] koordenatuakAukeratu(){
		System.out.println("Koordenatuak aukeratu");
		System.out.println("Sartu zutabe zenbakia (1-10)");
		int zut = zenbakiaEskatu(1, 10);
		System.out.println("Sartu errenkada zenbakia (1-10)");
		int err = zenbakiaEskatu(1, 10);
		int[] koor = {zut,err};
		return koor;
	}
}
