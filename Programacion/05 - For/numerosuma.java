	import java.util.Scanner;
public class numerosuma{
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int numero = 0;
		int sumaNumero = 0;
		
		for (int a = 1; a <= 5; a++){

			System.out.print("Introduzca un numero: ");
			numero = Integer.parseInt(console.nextLine());

			sumaNumero+=numero;

			if (numero < 0) {
				System.out.println("Introduzca un numero positivo brr");
			}
		} 

		System.out.println("La suma de los numero es: " + sumaNumero);
	}
}