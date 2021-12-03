public class Ejercicio5casa{
	public static void main(String[] args){

		// Expresión que indica si una fecha es válida o no (meses 30 días). Dado 1 mes, Cuando ejecutamos, Entonces nos debería decir si tiene 30 días o no.

		String meses = args[0];

		switch(meses){
			case "abril":
			case "junio":
			case "septiembre":
			case "noviembre":
			System.out.println("Tiene 30 dias");
			break;
			case "enero":
			case "febrero":
			case "marzo":
			case "mayo":
			case "julio":
			case "agosto":
			case "octubre":
			case "diciembre":
			System.out.println("No tiene 30 dias");
			break;
			default:
			System.out.println("No has introducido un mes");
		}
	
	}
}