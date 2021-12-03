public class Ejercicio7casa{
	public static void main(String[] args){

		// Introducir un número e imprimir los 3 siguientes. Ej. 3 → 4 5 6.

		if (args.length == 1) {
		
		int numero = Integer.parseInt(args[0]);
		
		System.out.print(numero+1+" ");
		System.out.print(numero+2+" ");
		System.out.print(numero+3);

		}

		else {
			System.out.println("Numero de argumento incorrecto, introduzca un argumento");
		}
	}
}