public class Factorial{
	public static void main(String[] args) {

		int factorial = 1;
		
		for (int numero = Integer.parseInt(args[0]); numero > 1; numero--) {
			
			factorial = factorial * numero;
		}

		System.out.println("El numero Factorial es: " + factorial);
	}
}	