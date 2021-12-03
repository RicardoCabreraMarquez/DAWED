	import java.util.Scanner;
public class sueldo {
	public static void main(String[] args) {

		Scanner console= new Scanner(System.in);

		int contsueld = 0;
		int sueldototal = 0;
		
		for (int a = 1; a <= 5; a++) {

			System.out.print("Introduzca tu sueldo: ");
			int sueldo = Integer.parseInt(console.nextLine());

			sueldototal += sueldo;

				if (sueldo > 1000) {
					contsueld++;
				}
		}

		System.out.println("El sueldo total es: " + sueldototal);
		System.out.println("Hay " + contsueld + " sueldo de mas de 1000");
	}
}