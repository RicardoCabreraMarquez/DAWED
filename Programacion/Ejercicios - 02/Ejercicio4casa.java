public class Ejercicio4casa{
	public static void main(String[] args){

		// Expresion de la media aritmetica de tres valores.

		double numero1 = Double.parseDouble(args[0]);

		double numero2 = Double.parseDouble(args[1]);

		double numero3 = Double.parseDouble(args[2]);


		double media = (numero1+numero2+numero3)/3;

		System.out.println("La media es: " + media);

	}
}