package proiektua.advancedBattleship;

import proiektua.salbuespenak.DirurikEz;
import proiektua.salbuespenak.ErasoaKokatu;

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
	
	public void erosi(Jokalaria pEroslea, int ePos) throws DirurikEz, ErasoaKokatu{
		ErasoMota em = katalogoa.posiziokoErasoaLortu(ePos);
		if(!pEroslea.diruNahikoa(em.getPrezioa())){
			{throw new DirurikEz();}
		}
		pEroslea.erosketaGorde(em);
		if(em instanceof ItsasoIbilgailua){
			{throw new ErasoaKokatu(em);}
		}
	}
	
	public ListaErasoMota getKatalogoa(){
		return katalogoa;
	}
}
