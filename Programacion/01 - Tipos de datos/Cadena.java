public class Cadena {
	public static void main(String[] args){
	String primeraParte = "Este texto contiene ";
	int x;
	String segundaParte = " caracteres y ";
	int y;
	String terceraParte = " números.";

	x = primeraParte.length() + segundaParte.length() + terceraParte.length();

	y=2;

	String fraseCompleta = primeraParte + x + segundaParte + y + terceraParte;

	System.out.println(fraseCompleta);
	}
}