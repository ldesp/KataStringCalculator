package com.hb.formation.KataStringCalculator;

public class StringCalculator {

	public int add(String numbers) {
		if (numbers.isEmpty())
			return 0;
	    String numbers1 = numbers.replace('\n', ',');
		String[] numbersInString = numbers1.split(",");
		int sum = 0;
		for (String number : numbersInString) {
			sum += Integer.parseInt(number);
		}

		return sum;
	}
}
