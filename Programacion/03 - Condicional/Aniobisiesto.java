public class Aniobisiesto {
	public static void main(String[] args) {
		
		int anio = Integer.parseInt(args[0]);

		if ((anio%4) == 0 && !((anio%100) == 0) || (anio%400) == 0) {
			System.out.println("Es un Ano bisiesto");
		} else {
			System.out.println("No es un Ano bisiesto");
		}
	}
}