public class EjerciciosEjemplos {
	public static void main(String[] args) {

		//Dar dos numero y decir cual es mayor
		
		/*
		int numero1 = Integer.parseInt(args[0]);
		int numero2 = Integer.parseInt(args[1]);

		if(numero1 > numero2){
			System.out.println("El numero mayor es: "+ numero1);
		} else if (numero1 == numero2) {
			System.out.println("Los numeros son iguales");
		} else {
			System.out.println("El numero mayor es: "+ numero2);
		}
		*/
		

		//Dar tres numero y decir cual es mayor

		
		int numero1 = Integer.parseInt(args[0]);
		int numero2 = Integer.parseInt(args[1]);
		int numero3 = Integer.parseInt(args[2]);

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("El numero mayor es: "+ numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("El numero mayor es: "+ numero2);
		} else if (numero1 == numero2 && numero1 == numero3) {
			System.out.println("Los numeros son iguales");
		} else {
			System.out.println("El numero mayor es: "+ numero3);
		}
		

	}
}