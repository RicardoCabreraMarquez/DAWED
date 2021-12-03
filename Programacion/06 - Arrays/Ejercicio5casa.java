	import java.util.Scanner;
public class Ejercicio5casa {
	public static void main(String[] args) {
		
		int[] tabla1 = new int[5];
		int[] tabla2 = new int[5];

		System.out.println("Introduce 5 numero: ");
		for (int a = 0; a < tabla1.length; a++){
			tabla1[a] = Integer.parseInt(new Scanner(System.in).nextLine());
		}

		System.out.println("Introduce 5 numero: ");
		for (int b = 0; b < tabla2.length; b++){
			tabla2[b] = Integer.parseInt(new Scanner(System.in).nextLine());
		}

		System.out.println("Tabla total: ");
		for (int c = 0; c < 5; c++){
			System.out.print(tabla1[c]+" ");	
		}

		System.out.println("");

		for (int d = 0; d < 5; d++){
			System.out.print(tabla2[d]+" ");
		}
	}	
}