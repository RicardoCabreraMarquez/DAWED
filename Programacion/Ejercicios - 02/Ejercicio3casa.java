public class Ejercicio3casa{
	public static void main(String[] args){

		// Introducir un total de horas y te dice los semanas/dias/horas equivalentes.

		
		int totalhora = Integer.parseInt(args[0]);

		int dias, semanas, horas;

		semanas = totalhora / 128;

		dias = (totalhora%128) / 24;

		horas = totalhora%24;

		System.out.println("Son " + semanas + " semanas, " + dias + " dias y " + horas + " horas");


	}
}