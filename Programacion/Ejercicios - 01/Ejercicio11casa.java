public class Ejercicio11casa{
	public static void main(String[] args){

		// Programa que permita introducir tus datos (Nombre, edad y altura) como argumentos e imprima:
		//[Nombre] tiene [edad] años y mide [altura] metros
		
		if (args.length == 7) {

		String palabra = (args[0]);

		int numero = Integer.parseInt(args[1]);

		String palabra1 = (args[2]);

		String palabra2 = (args[3]);

		int cubo = Integer.parseInt(args[4]);

		String palabra3 = (args[5]);

		String palabra4 = (args[6]);



		System.out.println(palabra + " " + palabra + " " + palabra);
		System.out.println(numero*2);
		System.out.println(palabra1 + "-" + palabra2);
		System.out.println(cubo*cubo*cubo);
		System.out.println(palabra3.charAt(0));
		System.out.println(" " + "\t" + palabra4);

		}

		else {
			System.out.println("Numero de argumento incorrecto, introduzca siete argumentos");
		}
		
	}
}