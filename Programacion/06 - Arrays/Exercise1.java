	import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int[] numeros = new int[10];

		int contador = 0;
		int contadorDe = 0;

		System.out.println("Introduzca 10 numeros: ");
		for (int i=0; i<numeros.length; i++){
			numeros[i] = Integer.parseInt(console.nextLine());
		}

		for (int i=0; i < numeros.length - 1; i++){
			if (numeros[i] < numeros[i+1]) {
				contador++;
			}else if (numeros[i] > numeros[i+1]) {
				contadorDe++;
			} 
		}

		if (contador == 9) {
			System.out.println("Esta ordenado de forma Creciente");
		} else if (contadorDe == 9) {
			System.out.println("Esta ordenado de forma Decreciente");
		} else {
			System.out.println("Los numeros estan desordenado");
		}

	}
}