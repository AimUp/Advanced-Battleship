package proiektua.advancedBattleship;

import proiektua.salbuespenak.EzinKokatu;

public class Denda {

	private static Denda nDenda = null;
	private ListaErasoMota katalogoa;
	
	private Denda(){
		katalogoa = new ListaErasoMota();
		katalogoa.erasoaGehitu(new Mina());
		katalogoa.erasoaGehitu(new Fragata());
		katalogoa.erasoaGehitu(new Korazatua());
		katalogoa.erasoaGehitu(new Itsaspekoa());
		katalogoa.erasoaGehitu(new HegazkinGarraiolaria());
		katalogoa.erasoaGehitu(new Bonbarderoa());
		katalogoa.erasoaGehitu(new UAV());
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
		ErasoMota erostekoErasoa = katalogoa.posiziokoErasoaLortu(auk-1);
		if(!pEroslea.diruNahikoa(erostekoErasoa.getPrezioa())){//salbuespena
			erositakoErasoa = null;
			System.out.println("Ez duzu eraso hau erosteko diru nahikorik.");
			System.out.println("Bezte eraso bat erosi nahi duzu?");
			if(Teklatua.getTeklatua().baiEdoEz()){
				erositakoErasoa = erosi(pEroslea);
			}
		}
		else if(erostekoErasoa instanceof ItsasoIbilgailua){
			boolean kok = false;
			while(!kok){
				try {
					pEroslea.erasoaGehitu((ItsasoIbilgailua) erostekoErasoa);
					kok = true;
				} catch (EzinKokatu e) {
					e.printStackTrace();
				}
			}
		}
		else{
			pEroslea.zerrendanGehitu(erostekoErasoa);
		}
		return erositakoErasoa;
	}
	
	private void erasoKatalogoaErakutzi(){
		katalogoa.inprimatuErasoInfo();
		System.out.println("\n\n");
	}
}
