import java.util.Scanner;

public class Scanner {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.println("Introduce un texto");
		String texto = console.nextline();
		System.out.println(texto)
	}
}