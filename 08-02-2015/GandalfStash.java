package Tasks;

import java.util.Scanner;

public class GandalfStash {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int firstMood = Integer.parseInt(input.nextLine());
		String line = input.nextLine().toLowerCase();

		String[] food = line.split("[^a-zA-Z]+");
		String cram = "cram";
		String lembas = "lembas";
		String apple = "apple";
		String melon = "melon";
		String honeyCake = "honeycake";
		String mushrooms = "mushrooms";

		for (int i = 0; i < food.length; i++) {
			if (food[i].equals(cram)) {
				firstMood += 2;
			} else if (food[i].equals(lembas)) {
				firstMood += 3;
			} else if (food[i].equals(apple)) {
				firstMood += 1;
			} else if (food[i].equals(melon)) {
				firstMood += 1;
			} else if (food[i].equals(honeyCake)) {
				firstMood += 5;
			} else if (food[i].equals(mushrooms)) {
				firstMood += -10;
			} else {
				firstMood -= 1;
			}

		}
		if (firstMood < (-5)) {
			System.out.println(firstMood);
			System.out.println("Angry");
		} else if (firstMood >= (-5) && firstMood <= 0) {
			System.out.println(firstMood);
			System.out.println("Sad");
		} else if (firstMood >= 0 && firstMood <= 15) {
			System.out.println(firstMood);
			System.out.println("Happy");
		} else if (firstMood > 15) {
			System.out.println(firstMood);
			System.out.println("Special JavaScript mood");
		}
	}

}
