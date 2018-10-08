import java.util.Random;

public class Dice {
	// Kast terning og få en værdi (1-6)
	public int roll() {
		Random random = new Random ();
		int d1 = random.nextInt(6)+1;
		return d1;
	}
	
	// Terningen kasten n gange og udskriver værdierne pr. kast
	public void rollMultiple(int n) {
		for (int i=0; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}