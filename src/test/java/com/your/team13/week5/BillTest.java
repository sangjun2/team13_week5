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
		// Gold Plan, Not Excess Minute, Not Additional Line
		
		input("Gold", 800, 1);
		assertEquals(49.95, app.calculate.totalRate(), 0);
	}
	
	@Test
	public void testGoldTwo() {
		// Gold Plan, Not Excess Minute, Additional Line
		
		input("Gold", 800, 3);
		assertEquals(78.95, app.calculate.totalRate(), 0);
	}
	
	@Test
	public void testGoldThree() {
		// Gold Plan, Not Excess Minute, Additional Line, Family Discount
		
		input("Gold", 800, 4);
		assertEquals(83.95, app.calculate.totalRate(), 0);
	}
	
	@Test
	public void testGoldFour() {
		// Gold Plan, Excess Minute, Not Additional Line
		
		input("Gold", 1200, 1);
		assertEquals(139.95, app.calculate.totalRate(), 0);
	}
	
	@Test
	public void testGoldFive() {
		// Gold Plan, Excess Minute, Additional Line
		
		input("Gold", 1200, 3);
		assertEquals(168.95, app.calculate.totalRate(), 0);
	}
	
	@Test
	public void testGoldSix() {
		// Gold Plan, Excess Minute, Additional Line, Family Discount
		
		input("Gold", 1200, 4);
		assertEquals(173.95, app.calculate.totalRate(), 0);
	}
	
	@Test
	public void testSilverOne() {
		// Silver Plan, Not Excess Minute, Not Additional Line
		
		input("Silver", 300, 1);
		assertEquals(29.95, app.calculate.totalRate(), 0);
	}
	
	@Test
	public void testSilverTwo() {
		// Silver Plan, Not Excess Minute, Additional Line
		
		input("Silver", 300, 3);
		assertEquals(72.95, app.calculate.totalRate(), 0);
	}
	
    @Test
    public void testSilverThree() {
		// Silver Plan, Not Excess Minute, Additional Line, Family Discount
    	
    	input("Silver", 300, 4);
    	assertEquals(77.95, app.calculate.totalRate(), 0);
    }
    
    @Test
    public void testSilverFour() {
	   // Silver Plan, Excess Minute, Not Additional Line
  
       input("Silver", 600, 1);
       assertEquals(83.95, app.calculate.totalRate(), 0);
    }
    
    @Test
    public void testSilverFive() {
	   // Silver Plan, Excess Minute, Additional Line
       
       input("Silver", 600, 3);
       assertEquals(126.95, app.calculate.totalRate(), 0);
    }
    
    @Test
    public void testSilverSix() {
	   // Silver Plan, Excess Minute, Additional Line, Family Discount
       
       input("Silver", 600, 4);
       assertEquals(131.95, app.calculate.totalRate(), 0);
    }
	
	public void input(String inputPlan, int callTime, int lineNumber) {
		app.run(inputPlan, callTime, lineNumber);
	}
}
