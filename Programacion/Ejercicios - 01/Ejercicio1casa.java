public class Ejercicio1casa{
	public static void main(String[] args){

		// Introducir un número por argumentos y que imprima true si es 4, 7 o 13; o false en caso contrario

		if (args.length == 1) {

		int numero = Integer.parseInt(args[0]);

		if(numero == 4){
			System.out.println("true");
		} else if (numero == 7){
			System.out.println("true");
		} else if (numero == 13){
			System.out.println("true");
		} else {
			System.out.println("false");
		};

		}

		else {
			System.out.println("Numero de argumento incorrecto, introduzca un argumento");
		}

	}
}