public class operaciones{
	public static void main(String[] args) {
		
		int operacion = Integer.parseInt(args[0]);
		int numero1 = Integer.parseInt(args[1]);
		int numero2 = Integer.parseInt(args[2]);


		//si pongo operacion.equals("texto"), estaria comparando con un string

		switch(operacion) {
			case 1:
			System.out.println("La suma es: " + (numero1+numero2));
			break;
			case 2:
			System.out.println("La resta es: " + (numero1-numero2));
			break;
			case 3:
			System.out.println("La multiplicacion es: " +  (numero1*numero2));
			break;
			case 4:
			System.out.println("La division es: " + (numero1/numero2));
			break;
			default:
			System.out.println("Elija una opcion correcta");
		}
	}
}