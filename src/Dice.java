import java.util.Random;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		Random random = new Random ();
		int d1 = random.nextInt(6)+1;
		return d1;
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=0; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
