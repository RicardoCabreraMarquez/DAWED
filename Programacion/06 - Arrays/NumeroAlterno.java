	import java.util.Scanner;
	import java.util.Arrays;
public class NumeroAlterno {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int[] numeros = new int[10];

		for (int i=0; i<numeros.length; i+=1){
			System.out.print("Introduzca un numero: ");
			numeros[i] = Integer.parseInt(console.nextLine());
		}

		System.out.println("Array numero -> "Arrays.toString(numeros));

		int[] alternos = new int[10];

		for (int i=0; i<5; i++){
			System.out.println(numeros)	
		}
		
}