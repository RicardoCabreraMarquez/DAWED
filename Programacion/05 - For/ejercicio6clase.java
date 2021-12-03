public class ejercicio6clase {
	public static void main(String[] args) {

		int numero = Integer.parseInt(args[0]);
		
		for (int contador = 1; contador <= numero; contador++) {
			for (int repe = numero; repe >= contador; repe--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}	