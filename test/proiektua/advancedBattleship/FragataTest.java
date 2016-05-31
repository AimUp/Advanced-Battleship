package proiektua.advancedBattleship;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import proiektua.advancedBattleship.Fragata;

public class FragataTest {

	private Fragata f;
	
	@Before
	public void setUp() throws Exception {
		
		f = new Fragata();
	}

	@After
	public void tearDown() throws Exception {
		
		f = null;
	}

	@Test
	public void testFragata() {
		assertNotNull(f);
	}

}
