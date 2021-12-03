public class Ejercicio4casa{
	public static void main(String[] args){

		// Introducir dos números por argumentos y que imprima true si el primero es el mayor o false en caso contrario
		
		if (args.length == 2) {

		int numero1 = Integer.parseInt(args[0]);
		int numero2 = Integer.parseInt(args[1]);

		if(numero1 > numero2){
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		}

		else {
			System.out.println("Numero de argumento incorrecto, introduzca dos argumentos");
		}

	}
}