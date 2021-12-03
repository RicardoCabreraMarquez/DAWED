public class CondicionalSimple {
	public static void main(String[] args) {
		
		int edad = Integer.parseInt(args[0]);

		if(edad >= 18){
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
		
	}
}