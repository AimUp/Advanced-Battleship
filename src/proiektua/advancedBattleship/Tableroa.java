package proiektua.advancedBattleship;

public class Tableroa {
	
	private ErasoMota[][] ibilgailuMatrizea;
	private ErasoMota[][] erasoPosizioak;
	
	public Tableroa(){
		ibilgailuMatrizea = new ErasoMota[10][10];
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
	
	
	
	public void erasoaGehitu(ErasoMota ontzia, int x, int y, int l, char a){
		ibilgailuMatrizea[x][y] = ontzia;
		l--;
		switch(a){
			case'i':
				int q = l;
				while(q > 0){
					y++;
					ibilgailuMatrizea[x][y] = ontzia;
					q--;
				}
				break;
			case'h':
				int w = l;
				while(w > 0){
					x--;
					ibilgailuMatrizea[x][y] = ontzia;
					w--;
				}
				break;
			case'm':
				int r = l;
				while(r > 0){
					y--;
					ibilgailuMatrizea[x][y] = ontzia;
					r--;
				}
				break;
			case'e':
				int t = l;
				while(t > 0){
					x++;
					ibilgailuMatrizea[x][y] = ontzia;
					t--;
				}
				break;
		}
	}
	
	public void erasoaGehitu(ErasoMota e){
		//POSIZIOA AUKERATU
	}
	
	public void tableroaInprimatu(){
		for(int x = 0; x < ibilgailuMatrizea.length; x++){
			for(int y = 0; y < ibilgailuMatrizea[x].length; y++){
				if(ibilgailuMatrizea[x][y] != null){
				System.out.print(ibilgailuMatrizea[x][y]);
				}
				//else{
					
				//}
			}
			System.out.println();
		}
	}
	
	public void erasoaJaso(int[][] pKoord){
		
	}
}
