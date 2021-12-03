public class ejercicio1clase {
	public static void main(String[] args) {
		int contador = 1;

		for (int numero=Integer.parseInt(args[0]); numero >= contador; contador++) {
			System.out.println(contador);
		}
	}
}