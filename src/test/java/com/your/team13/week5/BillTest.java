package com.your.team13.week5;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class BillTest extends TestCase{
	private Bill b;
	
	@Before
	public void setUp() {
		b = new Bill();
	}
	
	@Test
	public void testApp() {
		App.main(null);
		assertTrue(true);
	}
	
	@Test
	public void testGoldOne() {
		input("Gold", 800, 1);
		assertEquals(49.95, b.calculate.totalRate());
	}
	
	@Test
	public void testGoldTwo() {
		input("Gold", 800, 3);
		assertEquals(78.95, b.calculate.totalRate());
	}
	
	@Test
	public void testGoldThree() {
		input("Gold", 800, 4);
		assertEquals(83,95, b.calculate.totalRate());
	}
	
	@Test
	public void testGoldFour() {
		input("Gold", 1200, 1);
		assertEquals(139.95, b.calculate.totalRate());
	}
	
	@Test
	public void testGoldFive() {
		input("Gold", 1200, 3);
		assertEquals(168.95, b.calculate.totalRate());
	}
	
	@Test
	public void testGoldSix() {
		input("Gold", 1200, 4);
		assertEquals(173.95, b.calculate.totalRate());
	}
	
	@Test
	public void testSilverOne() {
		input("Silver", 300, 1);
		assertEquals(29.95, b.calculate.totalRate());
	}
	
	@Test
	public void testSilverTwo() {
		input("Silver", 300, 3);
		assertEquals(72.95, b.calculate.totalRate());
	}
	
	
	
	public void input(String inputPlan, int callTime, int lineNumber) {
		b.run(inputPlan, callTime, lineNumber);
	}
}
