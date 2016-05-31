package proiektua.advancedBattleship;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import proiektua.advancedBattleship.Itsaspekoa;

public class ItsaspekoaTest {

	private Itsaspekoa i;
	
	@Before
	public void setUp() throws Exception {
	
		i = new Itsaspekoa();
	}

	@After
	public void tearDown() throws Exception {
		
		i = null;
	}

	@Test
	public void testItsaspekoa() {
		assertNotNull(i);
	}

}
