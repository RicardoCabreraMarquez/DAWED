	import java.util.Scanner;
public class numeroNegativo {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int n = 10;
		int numero;
		int contador = 0;

		for (int a = 1; n >= a; a++){
			System.out.print("Introduzca un numero: ");
			numero = Integer.parseInt(console.nextLine());

				if(numero < 0){
					contador++;
				}
		}

		if (contador > 0) {
			System.out.println("Has introducido " + contador + " números negativos");
		} else {
			System.out.println("No has introducido ningun numero negativo");
		}
	}
}