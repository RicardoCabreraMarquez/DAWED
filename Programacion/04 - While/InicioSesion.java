import java.util.Scanner;

public class InicioSesion {
	public static void main(String[] args) {
		String CONTRA = "carlitos95";

		Scanner console = new Scanner(System.in);

		System.out.println("Introduce un usuario: ");
		String usuario = console.nextLine();

		int cont = 0;


		while (cont < 3) {

		cont += 1;

		System.out.println("Introduce una contraseña: ");
		String contrasena = console.nextLine();

		if (contrasena.equals(CONTRA)) {
			System.out.println("¡Bienvenido " + usuario +"!");
			return;
		} 
			
		}

		System.out.print("Acceso Denegado");

	}
}