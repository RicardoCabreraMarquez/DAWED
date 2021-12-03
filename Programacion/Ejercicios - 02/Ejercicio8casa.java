public class Ejercicio8casa{
	public static void main(String[] args){

		// Programa que le indicamos los índices de una ecuación de 2 grado y lo resuelve.

		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		double raiz = Math.pow(b,2)-4*a*c;

		double positiva = (-b - raiz) / (2*a);

		double negativa = (-b + raiz) / (2*a);

		
		System.out.println("La solucion positiva es: " + positiva);

		System.out.println("La solucion negativa es: " + negativa);
	}
}