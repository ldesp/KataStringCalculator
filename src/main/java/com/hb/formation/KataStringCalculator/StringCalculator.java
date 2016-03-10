package com.hb.formation.KataStringCalculator;

public class StringCalculator {

	public int add(String numbers) {
		if (numbers.isEmpty())
			return 0;
		String[] arNumbers = numbers.split(",");
		int sum = 0;
		for (String number : arNumbers) {
			sum += Integer.parseInt(number);
		}

		return sum;
	}
}
