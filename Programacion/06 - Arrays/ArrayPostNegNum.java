	import java.util.Scanner;
public class ArrayPostNegNum {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int[] numeros = new int[5];

		int sumapositivo = 0;
		int contadorpositivo = 0;
		int mediapositivo = 0;

		int sumanegativo = 0;
		int contadornegativo = 0;
		int medianegativo = 0;

		int contadorceros = 0;

		for (int i=0; i<numeros.length; i+=1){
			System.out.print("Introduzca un numero: ");
			numeros[i] = Integer.parseInt(console.nextLine());
		}
		
		for (int i=0; i<numeros.length; i+=1) {
			if (numeros[i]>0) {
				contadorpositivo++;
				sumapositivo += numeros[i];	
			} else if (numeros[i] < 0) {
				contadornegativo++;
				sumanegativo += numeros[i];
			} else {
				contadorceros++;
			}
		}

		
		mediapositivo = sumapositivo / contadorpositivo;
		medianegativo = sumanegativo / contadornegativo;

		if (contadorpositivo > 0) {
			System.out.println("La media de los positivos es: " + mediapositivo);
		} 

		if (contadornegativo > 0) {
			System.out.println("La media de los negativos es: " + medianegativo);
		} 
			
		System.out.println("La cantidad de ceros es: " + contadorceros);
			
	}	
}
