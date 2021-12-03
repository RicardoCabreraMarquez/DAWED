	import java.util.Scanner;
public class tablamult {
	public static void main(String[] args) {

		Scanner console= new Scanner(System.in);
		
		int a = 10;

		System.out.print("Introduce el numero que quieras la tabla: ");
		int numero = Integer.parseInt(console.nextLine());

		for (int b = 1;b <= a ;b++) {
			System.out.println(numero + " x " + b + " = " + numero*b);
		}
	}
}