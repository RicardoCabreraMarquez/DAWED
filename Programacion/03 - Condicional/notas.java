public class notas {
	public static void main(String[] args) {

		if(args.length != 1) {
			System.out.println("Introduce 1 parametro");
			return;
		}
		
		double nota = Double.parseDouble(args[0]);

		if (nota >= 0 && nota < 5) {
			System.out.println("Insuficiente");
		} else if (nota >= 5 && nota < 6) {
			System.out.println("Suficiente");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("Bien");
		} else if (nota >= 7 && nota < 9){
			System.out.println("Notable");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("No has introducido una nota correcta");
		}

	}
}