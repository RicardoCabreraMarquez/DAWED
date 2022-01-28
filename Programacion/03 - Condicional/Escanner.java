import java.util.Scanner;

public class Escanner {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.println("Introduce un texto");
		String texto = console.nextLine();
		System.out.println(texto);

		console.close();
	}
}