	import java.util.Scanner;
	import java.util.Arrays;
public class AlternoArray {
	public static void main(String[] args) {
		int[] numeros = new int[10];
		System.out.println("Introduce 10 numeros:");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(new Scanner(System.in).nextLine());
		}
		// Ejecutamos la mitad de veces porque 
		// pintamos dos valores por cada iteración
		for (int i = 0; i < 5; i++) {
			System.out.print(numeros[i] + "-");
			System.out.print(numeros[9-i] + "-");
		}
	}
}