package proiektua.advancedBattleship;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import proiektua.advancedBattleship.HegazkinGarraiolaria;

public class HegazkinGarraiolariaTest {

	private HegazkinGarraiolaria hg;
	
	@Before
	public void setUp() throws Exception {
		
		hg = new HegazkinGarraiolaria();
		
	}

	@After
	public void tearDown() throws Exception {
		
		hg = null;
		
	}

	@Test
	public void testHegazkinGarraiolaria() {
		
		assertNotNull(hg);
	}

}
