// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    
		int N = Integer.parseInt(args[0]);
		String mode = args[1];
		

		if (mode.equals("v")) {
			for (int start = 1; start <= N; start++) {
				int count = 1;
				int a = start;

				System.out.print(a + " ");

					do {
						if (a % 2 == 0) {
						a = a / 2;
						} else {
						a = (a * 3) + 1;
						}

						System.out.print(a + " ");
						++count;
					} while (a != 1);
			
						System.out.print("(" + count + ")");
						System.out.println();
				}

				System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");

	 		} else if (mode.equals("c")) {
				System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");;
			}
		
		
		
		}
	}

