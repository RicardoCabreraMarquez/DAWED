public class fibonacci{
	public static void main(String[] args) {

		boolean continuar = true;

		int numero1 = 0;
		int numero2 = 1;

		do {

			System.out.println(numero1);

		}
		
		while(continuar); {
			int numero3 = numero1+numero2;

			System.out.println(numero2+numero3);
		}
	}
}