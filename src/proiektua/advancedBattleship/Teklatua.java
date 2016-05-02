package proiektua.advancedBattleship;

import java.util.Scanner;

import proiektua.salbuespenak.HizkiOkerra;
import proiektua.salbuespenak.IzenBerdinak;
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
		try{
			if(izenak[0].equals(izenak[1])){
				{throw new IzenBerdinak();}
			}
			System.out.println("Partida hasiko da: \n\t\t"+izenak[0]+" VS "+izenak[1]+"!!!");
		}catch (IzenBerdinak e) {
				System.out.println("Bi jokalarien izenak berdinak dira. Sartu jokalarien izen ezberdinak");
				izenak = jokalariIzenak(jokKop);
		}
		return izenak;
	}
	
	public int zenbakiaEskatu(int pLehenengoa, int pAzkena){
		System.out.println("Sartu zure aukera: ");
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
			System.out.println("Zure aukera " + pLehenengoa + " eta " + pAzkena + " zenbakien artekoa izan behar da \n\n");
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
		System.out.println("3. Diru kopurua.");
		System.out.println("0. Partida bertan behera hutsi.");
		
		return zenbakiaEskatu(0, 2);
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
		System.out.println("Sartu ZUTABE (X) zenbakia (0-14)");
		int zut = zenbakiaEskatu(0, 14);
		System.out.println("Sartu ERRENKADA (Y) zenbakia (0-14)");
		int err = zenbakiaEskatu(0, 14);
		int[] koor = {zut,err};
		return koor;
		
	}
	
	public char brujula() {
		char nora;
		System.out.println("Ontziaren burua (x,y) koordenatuan egonda, gorputza ze noranzkoan sartu nahi duzun adierazi. I(iparraldea), H(hegoaldea), E(ekialdea), M(mendebaldea):");
		String s = sc.nextLine();
		if(!s.isEmpty()){
			nora = s.charAt(0);
		}
		else{
			nora='Ñ';
		}
		try{
			if(nora!='i' && nora!='h' && nora!='e' && nora!='m' && nora!='I' && nora!='H' && nora!='E' && nora!='M'){
				{throw new HizkiOkerra();}
			}
		} catch(HizkiOkerra e){
			System.out.println("Sartu nahi duzun noranzkoa espezifikatu bezala izan behar da!");
			System.out.println("Noranzkoa berriz sartu \n\n");
			brujula();
		}
		return nora;
	}
}
