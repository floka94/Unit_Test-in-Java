package vektoren;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestVektor {
	Vektor spaltenvektorTest;

	@Before
	public void setUp() throws Exception {
		spaltenvektorTest = new Vektor(true, 5, 5);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		Vektor addergebnis = new Vektor(true, 10, 10);
		Vektor spaltenvektor = new Vektor(true, 5, 5);
		Vektor zeilenvektor = new Vektor(false, 5, 5);
		
		try {
			assertTrue(spaltenvektorTest.add(spaltenvektor).equals(addergebnis));			
		} catch (VektorException e) {
			fail();						
		}
		try {
			spaltenvektorTest.add(zeilenvektor);
			fail("Hat nicht abgebrochen!");
		} catch (VektorException e) {
			//alles ok		
		}
		
	}

}
