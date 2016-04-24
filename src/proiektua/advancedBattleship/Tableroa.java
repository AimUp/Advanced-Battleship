package proiektua.advancedBattleship;

public class Tableroa {
	
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
		
	}
}
