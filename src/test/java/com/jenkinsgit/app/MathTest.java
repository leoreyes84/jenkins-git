package com.jenkinsgit.app;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Unit test for simple App.
 */
@RunWith(Parameterized.class)
public class MathTest {
	
	private final Integer number1;
	private final Integer number2;
	private final Integer result;
	
	
	public MathTest(Integer number1, Integer number2, Integer result) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.result = result;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> sumNumbers() {
		return Arrays.asList(new Object[][] {{5,13,18},{73,24,97}});
	}
	
	@Test
	public void sumParamsTest() {
		System.out.println("sumParamsTest");
		assertEquals(result.intValue(), Math.addExact(number1, number2));
	}
	
	@Test
	public void substractTest() {
		System.out.println("substractTest");
		assertEquals(50, Math.subtractExact(70, 20));
	}
	
	@Test
	public void multiplyTest() {
		System.out.println("multiplyTest");
		assertEquals(28, Math.multiplyExact(4, 7));
	}
	
	@Test
	public void floorDivTest() {
		System.out.println("floorDivTest");
		assertEquals(4, Math.floorDiv(28, 7));
	}
	
	@Test
	public void maxTest() {
		System.out.println("maxTest");
		assertEquals(5000, Math.max(5000, 4999));
	}
	
	@Test
	public void minTest() {
		System.out.println("minTest");
		assertEquals(4999, Math.min(5000, 4999));
	}
	
	@Test
	public void powTest() {
		System.out.println("powTest");
		assertEquals(16, Math.pow(2, 4), 0);
	}
	
}
