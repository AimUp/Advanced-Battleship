package proiektua.advanncedBattleship.baliabideak;

public class Textua {

	public static String jokalariTxanda;
	public static String eraso;
	public static String denda;
	public static String erosi;
	public static String atzera;
	public static String diruKop;
	public static String erasoAuk;
	public static String erasoEgin;
	public static String prezioa;
	public static String erosketaEginDa;
	public static String diruNahikoEz;
	public static String erositakoItsaKokatu;
	public static String horizontal;
	public static String bertikal;
	public static String irabazi;
	
	public static String fragata;
	public static String korazatua;
	public static String HegazkinGarraiolaria;
	public static String mina;
	public static String UAV;
	public static String itsaspekoa;
	public static String bonbarderoa;
	
	public static String aukeratu;
	public static String kokatuZureItsasontziak;
	public static String lehenengoJok;
	public static String bigarrenJok;
	public static String izenakEzberdinak;
	public static String izenaSartuBehar;
	
	public static String jokoa;
	public static String laguntza;
	public static String hizkuntza;
	
	public static String euskera;
	public static String gaztelania;
	public static String ingelesa;
	
	public static void kargatu(){
		if(System.getProperty("user.language").equals("eu")){
			euskeraKargatu();
		}
		else if(System.getProperty("user.language").equals("es")){
			gaztelaniaKargatu();
		}
		else{
			ingelesaKargatu();
		}
	}
	
	public static void euskeraKargatu(){ 
		jokalariTxanda = "JOKALARIAREN TXANDA: ";
		eraso = "ERASO";
		denda = "DENDA";
		atzera = "ATZERA ITZULI";
		diruKop = "ZURE DIRU KOPURUA: ";
		erasoAuk = "ERASOA AUKERATU";
		erasoEgin = "ERASO EGIN";
		prezioa = "PREZIOA: ";
		erosi = "EROSI";
		erosketaEginDa = "Erosketa egin da";
		diruNahikoEz = "Diruri nahikorik ez";
		erositakoItsaKokatu = "EROSITAKO ITSASONTZIA KOKATU: ";
		horizontal = "HORIZONTAL";
		bertikal = "BERTIKAL";
		irabazi = "IRABAZI EGIN DUZU!";
		
		fragata = "FRAGATA";
		korazatua = "KORAZATUA";
		HegazkinGarraiolaria = "HEGAZKIN GARRAIOLARIA";
		mina = "MINA";
		UAV = "UAV";
		itsaspekoa = "ITSASPEKOA";
		bonbarderoa = "BONBARDEROA";
		
		aukeratu = "AUKERATU: ";
		kokatuZureItsasontziak = ", KOKATU ZURE ITSASONTZIAK";
		lehenengoJok = "LEHENENGO JOKALARIA";
		bigarrenJok = "BIGARREN JOKALARIA";
		izenakEzberdinak = "IZENAK EZBERDINAK IZAN BEHAR DIRA";
		izenaSartuBehar = "JOKALARIEN IZENAK SARTU BEHAR DIRA";
		
		jokoa = "Jokoa";
		laguntza = "Laguntza";
		hizkuntza = "Hizkuntza aldatu";
		
		euskera = "Euskera";
		gaztelania = "Gaztelania";
		ingelesa = "Ingelesa";
	}
	
	public static void gaztelaniaKargatu(){ 
		eraso = "ATAQUE";
		denda = "TIENDA";
		atzera = "VOLVER";
		diruKop = "TU DINERO: ";
		erasoAuk = "SELECCIONA UN ATAQUE";
		erasoEgin = "REALIZAR ATAQUE";
		prezioa = "PRECIO: ";
		erosi = "COMPRAR";
		erosketaEginDa = "Se ha completado la compra";
		diruNahikoEz = "Dinero insuficiente";
		erositakoItsaKokatu = "COLOCA EL BARCO COMPRADO: ";
		horizontal = "HORIZONTAL";
		bertikal = "VERTICAL";
		irabazi = "HAS GANDO!";
		
		fragata = "FRAGATA";
		korazatua = "CORAZADO";
		HegazkinGarraiolaria = "PORTAAVIONES";
		mina = "MINA";
		UAV = "UAV";
		itsaspekoa = "SUBMARINO";
		bonbarderoa = "BONBARDERO";
		
		aukeratu = "SELECCIONA: ";
		kokatuZureItsasontziak = ", COLOCA TU BARCO";
		lehenengoJok = "PRIMER JUGADOR";
		bigarrenJok = "SEGUNDO JUGADOR";
		izenakEzberdinak = "LOS NOMBRES DEBEN SER DISTINTOS";
		izenaSartuBehar = "LOS NOMBRES NO PUEDEN ESTAR VACÍOS";	
		
		jokoa = "Juego";
		laguntza = "Ayuda";
		hizkuntza = "Cambiar de idioma";
		
		euskera = "Euskera";
		gaztelania = "Castellano";
		ingelesa = "Ingles";
	}
	
	public static void ingelesaKargatu(){ 
		eraso = "ATACK";
		denda = "SHOP";
		atzera = "RETURN";
		diruKop = "YOUR MONEY: ";
		erasoAuk = "CHOOSE YOUR ATACK";
		erasoEgin = "ENGAGE ATACK";
		prezioa = "PRICE: ";
		erosi = "BUY";
		erosketaEginDa = "Purchase completed";
		diruNahikoEz = "Not enough money";
		erositakoItsaKokatu = "PLACE PURCHASED SHIP: ";
		horizontal = "HORIZONTAL";
		bertikal = "VERTICAL";
		irabazi = "YOU HAVE WON!";
		
		fragata = "FRIGATE";
		korazatua = "WARSHIP";
		HegazkinGarraiolaria = "AIRCRAFT CARRIER";
		mina = "MINE";
		UAV = "UAV";
		itsaspekoa = "SUBMARINE";
		bonbarderoa = "BOMBARDIER";
		
		aukeratu = "SELECT: ";
		kokatuZureItsasontziak = ", PLACE YOUR SHIPS";
		lehenengoJok = "FIRST PLAYER";
		bigarrenJok = "SECOND PLAYER";
		izenakEzberdinak = "THE NAMES MUST BE DIFFERENT";
		izenaSartuBehar = "THE PLAYERS MUST HAVE A NAME";
		
		jokoa = "Game";
		laguntza = "Help";
		hizkuntza = "Swich language";
		
		euskera = "Basque";
		gaztelania = "Spanish";
		ingelesa = "English";
	}
}
