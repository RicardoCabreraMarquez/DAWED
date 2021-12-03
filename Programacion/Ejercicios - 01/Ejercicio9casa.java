public class Ejercicio9casa{
	public static void main(String[] args){

		// Introducir un número e imprimir los 3 siguientes números consecuencia de multiplicar por 2. Ej. 3 → 6 12 24.

		if (args.length == 1) {
		
		int numero = Integer.parseInt(args[0]);

		int numero1 = numero*2;
		int numero2 = numero1*2;
		int numero3 = numero2*2;

		System.out.print(numero1+" ");
		System.out.print(numero2+" ");
		System.out.print(numero3);

		}

		else {
			System.out.println("Numero de argumento incorrecto, introduzca un argumento");
		}
	}
}