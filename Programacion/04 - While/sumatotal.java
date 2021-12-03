	import java.util.Scanner;
public class sumatotal {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		boolean continuar = true;

		int suma = 0;

		while (continuar) {
			System.out.println("Introduce un numero");

			int numero = Integer.parseInt(console.nextLine());

			suma = numero + suma;

			if (numero == 0){
					System.out.println(suma);
				continuar = false;
			} else {
				continuar = true;
			}
		}
	
	}
}