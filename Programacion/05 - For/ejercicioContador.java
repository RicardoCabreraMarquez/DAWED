/*
5. Realizar un contador de 5 dígitos (X-X-X-X-X)
 - desde 0-0-0-0-0 hasta 9-9-9-9-9
 * Mod: Sustituir los '3' por 'E'.
*/
public class Ejercicio5 {
	public static void main(String[] args) {

		String aS;
		String bS;
		String cS;
		String dS;
		String eS;

		// Pintar del 0 al 9 una variable
		for (int a=0; a<=9; a++) {
			if(a == 3){
				aS = "E";
			} else {
				aS = String.valueOf(a);
			}
			for (int b=0; b<=9; b++) {
				if(b == 3){
					bS = "E";
				} else {
					bS = String.valueOf(b);
				}
				for (int c=0; c<=9; c++) {
					if(c == 3){
						cS = "E";
					} else {
						cS = String.valueOf(c);
					}
					for (int d=0; d<=9; d++) {
						if(d == 3){
							dS = "E";
						} else {
							dS = String.valueOf(d);
						}
						for (int e=0; e<=9; e++) {
							if(e == 3){
								eS = "E";
							} else {
								eS = String.valueOf(e);
							}
							System.out.println(aS + "-" + bS + "-" + cS + "-" + dS + "-" + eS);
						}
					}
				}
			}
		}
	}
}