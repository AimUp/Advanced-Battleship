package proiektua.advancedBattleship;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import proiektua.advancedBattleship.Bonbarderoa;

public class BonbarderoaTest {
	
	private Bonbarderoa b;

	@Before
	public void setUp() throws Exception {
		
		b = new Bonbarderoa();
	}

	@After
	public void tearDown() throws Exception {
		
		b = null;
	}


	@Test
	public void testBonbarderoa() {
		
		assertNotNull(b);
	}

}
