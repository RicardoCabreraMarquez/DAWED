	import java.util.Scanner;
public class OperacionMenu {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);

		
		boolean continuar = true;

		while (continuar) {

			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Division");
			System.out.println("0. Salir");

			int operacion = Integer.parseInt(console.nextLine());

			if (operacion == 0) {
				System.out.println("Encantado, vuelva pronto");
				continuar = false;
			} else {

				System.out.println("Introduzca una opción: ");
				System.out.println("Numero 1: ");

				double numero1 = Double.parseDouble(console.nextLine());

				System.out.println("Numero 2: ");

				double numero2 = Double.parseDouble(console.nextLine());

				switch(operacion) {
					case 1:
					System.out.println("La suma es: " + (numero1+numero2));
					break;
					case 2:
					System.out.println("La resta es: " + (numero1-numero2));
					break;
					case 3:
					System.out.println("La multiplicacion es: " +  (numero1*numero2));
					break;
					case 4:
					System.out.println("La division es: " + (numero1/numero2));
					break;
					case 0:
					continuar=false;
					System.out.println("Encantado, vuelve pronto");
					break;
					default:
					System.out.println("Elija una opcion correcta");
				}
			}
		}
	}
}