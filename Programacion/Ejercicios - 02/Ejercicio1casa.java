public class Ejercicio1casa{
	public static void main(String[] args){

		// Calcular Radio, area y Volumen de la esfera.

		double radio = Double.parseDouble(args[0]);
		double area;
		double volumen;

		area = 4*Math.PI*Math.pow(radio,2);

		System.out.println("El area de la esfera es: " + area);

		volumen = (4*Math.PI*Math.pow(radio,3))/3;

		System.out.println("El volumen de la esfera es: " + volumen);

	

	}
}