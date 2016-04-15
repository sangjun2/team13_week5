package com.your.team13.week5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BillTest {
	private AppController app;
	
	@Before
	public void setUp() {
		app = new AppController();
	}
	
	@Test
	public void testApp() {
		Main.main(null);
		assertTrue(true);
	}
	
	@Test
	public void testGoldOne() {
		input("Gold", 800, 1);
		assertEquals(49.95, app.calculate.totalRate(), 0);
	}
	
	@Test
	public void testGoldTwo() {
		input("Gold", 800, 3);
		assertEquals(78.95, app.calculate.totalRate(), 0);
	}
	
	@Test
	public void testGoldThree() {
		input("Gold", 800, 4);
		assertEquals(83.95, app.calculate.totalRate(), 0);
	}
	
	@Test
	public void testGoldFour() {
		input("Gold", 1200, 1);
		assertEquals(139.95, app.calculate.totalRate(), 0);
	}
	
	@Test
	public void testGoldFive() {
		input("Gold", 1200, 3);
		assertEquals(168.95, app.calculate.totalRate(), 0);
	}
	
	@Test
	public void testGoldSix() {
		input("Gold", 1200, 4);
		assertEquals(173.95, app.calculate.totalRate(), 0);
	}
	
	@Test
	public void testSilverOne() {
		input("Silver", 300, 1);
		assertEquals(29.95, app.calculate.totalRate(), 0);
	}
	
	@Test
	public void testSilverTwo() {
		input("Silver", 300, 3);
		assertEquals(72.95, app.calculate.totalRate(), 0);
	}
	
	public void input(String inputPlan, int callTime, int lineNumber) {
		app.run(inputPlan, callTime, lineNumber);
	}
}
