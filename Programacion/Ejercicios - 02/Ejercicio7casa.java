public class Ejercicio7casa{
	public static void main(String[] args){

		// Expresión que indica si una hora es válida o no. Dada una hora, Cuando ejecutamos, Entonces nos dice si cumple con el formato estándar de horas hh:mm.

		int horas = Integer.parseInt(args[0]);
		int minutos = Integer.parseInt(args[1]);
		int segundos = Integer.parseInt(args[2]);

		if (horas <= 23 && horas >= 0 && minutos <= 59 && minutos >= 0 &&  segundos <= 59 && segundos >= 0) {
			System.out.println("La fecha es valida");
		} else {
			System.out.println("La fecha no es valida");
		}
		
	
	}
}