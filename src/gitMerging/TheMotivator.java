package gitMerging;

public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
			Sysout.out.println("here is another thing");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		int random = (int )(Math.random() * 100 + 1);
		tm.feedback(random);
	}
}
