package gitMerging;

import java.util.ArrayList;

public class TheMotivator {
	ArrayList<String> hello = new ArrayList<String>();
	
	public void randomprinting() {
		hello.add("hello");
		hello.add("probably not above 60");
		hello.add("below 60 still");
		hello.add("hi");
		hello.add("how are you");
		
	}
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
			randomprinting();
			for (String hi : hello) {
				System.out.println(hi);
			}

	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		int random = (int )(Math.random() * 100 + 1);
		tm.feedback(random);
	}
}
