public class ejercicio4clase {
	public static void main(String[] args) {

		int numero = Integer.parseInt(args[0]);
		
		for (int contador = 1; contador <= numero; contador++) {
			for (int repe = 1; repe <= contador; repe++) {
				System.out.print(contador);
			}
			System.out.println();
		}
	}
}