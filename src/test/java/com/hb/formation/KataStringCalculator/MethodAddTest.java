package com.hb.formation.KataStringCalculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class MethodAddTest {

	@Test
	public void AddShouldReturnZeroWithEmptyString() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(0, calculator.add(""));
	}

	@Test
	public void AddShouldReturnOneWithValueOne() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(1, calculator.add("1"));
	}

	@Test
	public void AddShouldReturnTwoWithValueTwo() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(2, calculator.add("2"));
	}

	@Test
	public void AddShouldReturnThreeWithTwoNumbers() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(3, calculator.add("1,2"));
	}

	@Test
	public void givenUnknownNumbers_whenAddNumbers_thenSum() {
		// Given
		StringCalculator sc = new StringCalculator();
		String numbers = "1,2,3,4";

		// When
		int result = sc.add(numbers);

		// Then
		Assert.assertEquals(result, 10);
	}
}
