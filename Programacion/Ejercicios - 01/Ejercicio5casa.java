public class Ejercicio5casa{
	public static void main(String[] args){

		// Introducir tres números por argumentos y que imprima true si la suma de los dos primeros es mayor que el tercer o false en caso contrario.
		
		if (args.length == 3) {

		int numero1 = Integer.parseInt(args[0]);
		int numero2 = Integer.parseInt(args[1]);
		int numero3 = Integer.parseInt(args[2]);


		if((numero1 + numero2) > numero3){
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		}

		else {
			System.out.println("Numero de argumento incorrecto, introduzca tres argumentos");
		}

	}
}