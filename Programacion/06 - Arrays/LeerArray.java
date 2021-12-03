	import java.util.Scanner;
	import java.util.Arrays;
public class LeerArray {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int[] numeros = new int[5];

		for (int i=0; i<numeros.length; i+=1){
			System.out.print("Introduzca un numero: ");
			numeros[i] = Integer.parseInt(console.nextLine());
		}
		System.out.print("[");
		for (int i=0; i<numeros.length; i+=1) {
			System.out.print(numeros[i]+",");
		}
		System.out.print("]")

		System.out.println(Arrays.toString(numeros))
	}
}