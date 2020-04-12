package com.jenkinsgit.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
		App tester = new App();
		tester.multiply(1000, 5);
	}

	@Test
	public void testMultiply() {
		App tester = new App();
		assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
	}
}
