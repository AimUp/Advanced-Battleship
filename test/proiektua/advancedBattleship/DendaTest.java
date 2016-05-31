package proiektua.advancedBattleship;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import proiektua.salbuespenak.DirurikEz;

public class DendaTest {
	Denda d1;
	Jokalaria j1;
	@Before
	public void setUp() throws Exception {
		d1=Denda.getDenda();
	}

	@After
	public void tearDown() throws Exception {
		d1=null;
	}

	@Test
	public void testGetDenda() {
		assertNotNull(d1);
	}

	@Test
	public void testErosi() throws DirurikEz {
		j1=new Jokalaria("Mikel");
		assertEquals(j1.getErasoMotak().tamaina(),0);
		d1.erosi(j1, 1);
		assertEquals(j1.getErasoMotak().tamaina(),1);
		
	}

	@Test
	public void testGetKatalogoa() {
		ListaErasoMota katalogoa=d1.getKatalogoa();
		assertNotNull(katalogoa);
	}

}
