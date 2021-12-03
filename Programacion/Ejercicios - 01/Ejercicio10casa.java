public class Ejercicio10casa{
	public static void main(String[] args){

		// Programa que permita introducir tus datos (Nombre, edad y altura) como argumentos e imprima:
		//[Nombre] tiene [edad] años y mide [altura] metros
		
		String nombre = (args[0]);

		int edad = Integer.parseInt(args[1]);

		double altura = Double.parseDouble(args[2]);


		System.out.println(nombre + " tiene " + edad + " años y mide " + altura);
		
	}
}    