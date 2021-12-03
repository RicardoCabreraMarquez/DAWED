	import java.util.Scanner;
public class Exercise3 {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int[] numeros = new int [10];

		System.out.println("Introduzca 10 numeros: ");
		for (int i=0; i<numeros.length; i++){
			numeros[i] = Integer.parseInt(console.nextLine());
		}

		
	}
}