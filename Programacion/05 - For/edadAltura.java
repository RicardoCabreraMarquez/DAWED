	import java.util.Scanner;
public class edadAltura {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int edad;
		double numeroEdad = 0;
		int contadorEdad = 0;
		double mediaEdad;

		double altura;
		double numeroAltura = 0;
		int contadorAltura = 0;
		double mediaAltura;

		int a = 5;

		for (int b = 1; a >= b; b++) {
			System.out.print("Introduce tu edad: ");
			edad = Integer.parseInt(console.nextLine());

			System.out.print("Introduce tu altura: ");
			altura = Double.parseDouble(console.nextLine());

			numeroEdad = edad + numeroEdad;
			numeroAltura = altura + numeroAltura;

				if (edad > 18) {
					contadorEdad++;
				} else if (altura > 1.75) {
					contadorAltura++;
				}
		}

		mediaEdad = numeroEdad/5;
		mediaAltura = numeroAltura/5;

		System.out.println("La edad media es: " + mediaEdad);
		System.out.println("La altura media es: " + mediaAltura);
		System.out.println("Hay " + contadorEdad + " mayores de edad");
		System.out.println("Hay " + contadorAltura + " personas que mide mas de 1.75");
	}
}