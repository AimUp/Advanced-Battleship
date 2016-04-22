package proiektua.advancedBattleship;

import java.util.Scanner;

public class Tableroa {
	
	public void getTableroa(){
		
		String matriz[][] = new String[11][11];
		
		for(int x = 0; x < matriz.length; x++){
			for(int y = 0; y < matriz[x].length; y++){
				System.out.print(matriz[x][y]);
			}
			System.out.println();
		}
=======
	private ErasoMota[][] erasoPosizioak;
	
	public Tableroa(){
		erasoPosizioak = new ErasoMota[10][10];
	}
	/*public void ErasoaKokatu(int x, int y,int luzera){
		a[x][y]='X'; //jokalariak aukeratutako posizioan kokatzen du
		System.out.println("Norantza kokatu nahi duzu?");
		System.out.println("(1) Gorantza");
		System.out.println("(2) Beherantza");
		System.out.println("(3) Ezkerrerantza");
		System.out.println("(4) Eskuinerantza");
		Scanner sc=new Scanner(System.in);
		int aukera=sc.nextInt();
		for(int i=1;i>luzera;i++){
			switch (aukera) {
			case 1: y=y+1;
			case 2: y=y-1;
			case 3: x=x-1 ;
			case 4: x=x+1 ;
			break;
			}
			sc.close();
			a[x][y]='X';	//itsasontziko hurrengo puntua kokatu
		}
	}*/
	
	public void erasoaGehitu(ErasoMota e){
		//POSIZIOA AUKERATU
	}
	
	public void tableroaInprimatu(){
		
	}
	
	public void erasoaJaso(int[][] pKoord){
		
>>>>>>> 60e874a2d1c36b1363021badd48e9a84351937d7
	}
}
