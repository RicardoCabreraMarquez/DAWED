public class ejercicio3clase {
	public static void main(String[] args) {

		int contador = 1;
		
		for (int numero = Integer.parseInt(args[0]); numero >= contador; contador++) {
			for (int repe = 1; repe <= numero; repe++) {
				System.out.print(contador);
			}
			System.out.println(repe);
		}
	}
}