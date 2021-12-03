public class Ejercicio2casa{
	public static void main(String[] args){

		// Cálculo del IMC (Indice de Masa Corporal).
		double imc;
		double peso = Double.parseDouble(args[0]);
		double altura = Double.parseDouble(args[1]);

		imc = peso / Math.pow(altura,2);

		System.out.println("Su imc es: " + imc);

	}
}