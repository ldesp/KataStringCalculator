package com.hb.formation.KataStringCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodAddTest {

	@Test
	public void addShouldReturnZeroWithEmptyString() {
		StringCalculator calculator = new StringCalculator();
		assertEquals( 0, calculator.add(""));
	}

	@Test
	public void addShouldReturnOneWithValueOne() {
		StringCalculator calculator = new StringCalculator();
		assertEquals( 1, calculator.add("1"));
	}
	
	@Test
	public void addShouldReturnTwoWithValueTwo() {
		StringCalculator calculator = new StringCalculator();
		assertEquals( 2, calculator.add("2"));
	}
	
	@Test
	public void addShouldReturnThreeWithTwoNumbers() {
		StringCalculator calculator = new StringCalculator();
		assertEquals( 3, calculator.add("1,2"));
	}
}
