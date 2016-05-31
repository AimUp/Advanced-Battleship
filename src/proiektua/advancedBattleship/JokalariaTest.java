package proiektua.advancedBattleship;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import proiektua.salbuespenak.EzinKokatu;
import proiektua.salbuespenak.Hondoratua;

public class JokalariaTest {
	private Jokalaria j1;
	private Korazatua e;
	private Fragata d;
	private HegazkinGarraiolaria s;
	private Itsaspekoa i;
	private Jokalaria j2;
	@Before
	public void setUp() throws Exception {
		j1=new Jokalaria("Mikel");
		j2=new Jokalaria("Jon");
		e=new Korazatua();
		d=new Fragata();
		s=new HegazkinGarraiolaria();
		j1.erasoBerriaKokatu(e, 'h', 1, 1);
		j1.erasoBerriaKokatu(d, 'h', 2, 2);
		j1.erasoBerriaKokatu(s, 'h', 3, 3);
		j2.getErasoMotak().erasoaGehitu(e);
		j2.getErasoMotak().erasoaGehitu(d);
		j2.getErasoMotak().erasoaGehitu(s);
		j2.erasoBerriaKokatu(e, 'h', 1, 1);
		j2.erasoBerriaKokatu(d, 'h', 2, 2);
		j2.erasoBerriaKokatu(s, 'h', 3, 3);
		j2.getErasoMotak().erasoaGehitu(e);
		j2.getErasoMotak().erasoaGehitu(d);
		j2.getErasoMotak().erasoaGehitu(s);
	}

	@After
	public void tearDown() throws Exception {
		j1=null;
		j2=null;
	}

	@Test
	public void testJokalaria() {
		assertNotNull(j1);
	}

	@Test
	public void testErosketaGorde() {
		Korazatua e1=new Korazatua();
		assertEquals(j1.getErasoMotak().tamaina(),0);
		j1.erosketaGorde(e1);
		assertEquals(j1.getErasoMotak().tamaina(),1);
	}

	@Test
	public void testDiruNahikoa() {
		assertTrue(j1.diruNahikoa(4));
		assertFalse(j1.diruNahikoa(800));
	}

	@Test
	public void testErasoEgin() throws EzinKokatu {
	}

	@Test
	public void testErasoaJaso()throws Hondoratua, EzinKokatu {
		assertTrue(j1.erasoaJaso(1,2));
		assertFalse(j1.erasoaJaso(5,5));
		assertTrue(j1.erasoaJaso(3,3));
		assertTrue(j1.erasoaJaso(3,4));
		assertTrue(j1.erasoaJaso(3,5));
		//hondoratzean salbuespena
		}

	@Test
	public void testGetIzena() {
		assertEquals(j1.getIzena(),"Mikel");
	}

	@Test
	public void testGetErasoMotak() {
		assertNotNull(j1.getErasoMotak());
	}

	@Test
	public void testItsaspekoErasoaJaso() throws Hondoratua, EzinKokatu {
		assertTrue(j1.itsaspekoErasoaJaso(1, 1));
		assertTrue(j1.itsaspekoErasoaJaso(2, 3));
	}

	@Test
	public void testUavErasoa() {
	}

	@Test
	public void testHasierakoErasoakKokatu() {
	}

	@Test
	public void testErasoBerriaKokatu() throws EzinKokatu {
		
	}

	@Test
	public void testTablerokoObserverra() {
	}

}
