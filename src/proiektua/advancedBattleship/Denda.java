package proiektua.advancedBattleship;

public class Denda {

	private static Denda nDenda = null;
	private ListaErasoMota katalogoa;
	
	private Denda(){
		katalogoa = new ListaErasoMota();
		/*katalogoa.erasoaGehitu();//ErasoBakoitza Gehitu
		katalogoa.erasoaGehitu();//ErasoBakoitza Gehitu
		katalogoa.erasoaGehitu();//ErasoBakoitza Gehitu
		katalogoa.erasoaGehitu();//ErasoBakoitza Gehitu
		katalogoa.erasoaGehitu();//ErasoBakoitza Gehitu*/
	}
	
	public static Denda getDenda(){
		if(nDenda==null){
			nDenda = new Denda();
		}
		return nDenda;
	}
	
	public ErasoMota erosi(Jokalaria pEroslea){
		ErasoMota erositakoErasoa = null;
		erasoKatalogoaErakutzi();
		int auk = Teklatua.getTeklatua().zenbakiaEskatu(1, 6); //LEHENENGO AUKERA / AZKEN AUKERA
		ErasoMota erostekoErasoa = katalogoa.posiziokoErasoaLortu(auk);
		if(pEroslea.diruNahikoa(erostekoErasoa.getPrezioa())){
			erositakoErasoa = null;
			System.out.println("Ez duzu eraso hau erosteko diru nahikorik.");
			System.out.println("Bezte eraso bat erosi nahi duzu?");
			if(Teklatua.getTeklatua().baiEdoEz()){
				erositakoErasoa = erosi(pEroslea);
			}
		}
		return erositakoErasoa;
	}
	
	private void erasoKatalogoaErakutzi(){
		for(int x=0; x<katalogoa.tamaina(); x++){
			katalogoa.posiziokoErasoaLortu(x).informazioaInprimatu();
			System.out.println("\n\n");
		}
	}
	
}
