public class Ejercicio2casa{
	public static void main(String[] args){

		// Introducir un número por argumentos y que imprima true si es si corresponde al caracter '?' o false en caso contrario

		if (args.length == 1) {
		
		int numero = Integer.parseInt(args[0]);

		if(numero == 63){
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		}

		else {
			System.out.println("Numero de argumento incorrecto, introduzca un argumento");
		}

	}
}