package Tasks;

import java.util.Scanner;

public class LettersChangeNumbers {

	public static void main(String[] args) {
		// TODO

		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		String[] numbers = line.split("\\s+");
		double totalValue = 0;

		for (int i = 0; i < numbers.length; i++) {

			int length = numbers[i].length() - 1;
			double value = Integer.parseInt(numbers[i].substring(1, length));
			double first = numbers[i].charAt(0);
			double last = numbers[i].charAt(length);
			double firstValueUpper = first - 64;
			double firstValueLower = first - 96;
			double lastValueUpper = last - 64;
			double lastValueLower = last - 96;

			if (first >= 65 && first <= 90) {
				value /= (float) firstValueUpper;
			} else if (first >= 97 && first <= 122) {
				value *= (float) firstValueLower;
			}

			if (last >= 65 && last <= 90) {
				value -= (float) lastValueUpper;
			} else if (last >= 97 && last <= 122) {
				value += (float) lastValueLower;
			}

			totalValue += value;

		}
		System.out.printf("%.2f", totalValue);
	}
}