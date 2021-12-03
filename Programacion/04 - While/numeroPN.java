public class numeroPN {
	public static void main(String[] args) {

		int numero = Integer.parseInt(args[0]);

		boolean igual = true;

		while(true) {

			if (numero > 0 ) {
				System.out.println("El numero es positivo");
				break;
			} else if (numero < 0) {
				System.out.println("El numero es negativo");
				break;
			} else {
				igual = false;
			}

		}

	}
}