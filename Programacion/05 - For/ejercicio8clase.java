public class ejercicio8clase {
	public static void main(String[] args) {

		int numero= Integer.parseInt(args[0]);

		for (int contador = 1; contador <= numero; contador++) {
			for (int repe = 1; repe <= numero-contador; repe++) {
				System.out.print(" ");
			}
			for (int ars = 1; ars <= (contador*2)-1; ars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}