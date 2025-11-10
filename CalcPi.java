// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    
		int numTerm = Integer.parseInt(args[0]);
		
		double pi = Math.PI;

		double finalAprox = 0;

		for (int a = 0; a < numTerm; a++) {
			
			double terms = 4*(Math.pow(-1,a))/(2*a +1); //the general form times 4
			
			finalAprox = finalAprox + terms;

		}

		System.out.println("pi according to Java: " + pi);
		System.out.println("pi, approximated: " + finalAprox);

	}
}
