public class Operadores {
	public static void main(String[] args){
		// Operadores aritméticos
		// +: Adición, suma
		// -: Resta
		// *: Multiplicación
		// /: Division
		// %: Módulo
		// ++: Incremento
		// --: Decremento

		int a  = 20, b = 10, c = 80;

		String x = "Thank", y = "You!";

		// + Adición, suma

		System.out.println("a + b: " + (a+b));
		System.out.println("x + y: " + x + y);

		// - Resta

		System.out.println("a - b: " + (a-b));

		// * Multiplicacion

		System.out.println("a * b: " + (a*b));

		// / Division

		System.out.println("a / b: " + (a/b));

		// % Modulo

		System.out.println("a % b: " + (a%b));

		// ++ Incremento

		System.out.println("El valor de a previo al incremento es " + a++);
		System.out.println("El valor de a tras el incremento es " + ++a);

		a--;
		a--;
		
		// -- Decremento

		System.out.println("El valor de a previo al decremento es " + b--);
		System.out.println("El valor de a tras el decremento es " + --b);

		b++;
		b++;

		// Operador de asignación
		// =: Asignacion

		int suma = a + b;

		System.out.println("a + b = " + suma);

		// Operadores compuestos

		// +=: Suma # a = a + b # a += b
		// -=: Resta
		// *=: Multiplicacion
		// /=: Division
		// ^=: Potencia
		// %=: Módulo

		System.out.println("a -> " + a);
		System.out.println("b -> " + b);
		a += b;

		System.out.println("a += b  -> " + a);

		// Operadores relacionales (Devuelve booleano)

		// == ¿Un valor es igual a otro?
		// != ¿Un valor es diferente a otro?
		// <  ¿Un valor menor que otro?
		// >  ¿Un valor mayor que otro?
		// <= ¿Un valor menor o igual que otro?
		// >= ¿Un valor mayor o igual que otro?

		//false
		System.out.prinln("¿Es 'a' igual a 'b'? " + (a==b));
		//true
		System.out.prinln("¿Es 'a' diferente a 'b'? " + (a!=b));
		//false
		System.out.prinln("¿Es 'a' menor que 'b'? " + (a<b));
		//true
		System.out.prinln("¿Es 'a' mayor que 'b'? " + (a>b));
		//false
		System.out.prinln("¿Es 'a' menor o igual a 'b'? " + (a<=b));
		//true
		System.out.prinln("¿Es 'a' mayor o igual a 'b'? " + (a>=b));


		// Operador de concatenación

		// + Adición
		System.out.println("x + y: " + x + y);


		// Operadores de bits (No se suele usar)

		// ~ Complemento binario
		// | Suma lógica binaria
		// ^ Suma lógica exclusiva
		// & Producto lógico binario
		// << Desplazamiento de bits a la izquierda. (Multiplicamos por 2)
		// >> Desplazamiento de bits a la derecha. (Dividimos entre 2)


		// Operadores especiales

		// ? Operador condiciones que indica que es un tipo boolean 
		// new Operador para instaciar una clase
		// [] 
		// ()
		// {}
		// ;
		// "
		// '
		// ,
		// .

	}
}