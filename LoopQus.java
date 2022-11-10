package loops;

public class LoopQus {

	public static void main(String[] args) {
		/*
		 * 54321 4321 321 21 1
		 */
		for (int i = 5; i >= 1; i--) // Exampe 1

		{
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		/*
		 **
		 ***
		 ****  
		 ***
		 **
		 */
		for (int i = 1; i <= 3; i++) { // example 2
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = 2; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
