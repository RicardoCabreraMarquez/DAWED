public class PrintNotaSwitch {
public static void main(String[] args) {
int num = -1;


if (isNumber(args[0])){
num = Integer.parseInt(args[0]);
} else {
System.out.println("ESTO NO ES UN NÚMERO");
}


switch(num){
case 0:
case 1:
case 2:
case 3:
case 4:
System.out.println("INSUFICIENTE");
break;
case 5:
System.out.println("SUFICIENTE");
break;
case 6:
System.out.println("BIEN");
break;
case 7:
case 8:
System.out.println("NOTABLE");
break;
case 9:
case 10:
System.out.println("SOBRESALIENTE");
break;
default:
System.out.println("No ha introducido una nota correcta");
}



}


/**
* 
* Este método es un borrador.
*/
public static void printNotaAnterior(String p){

int num = -1;


if (isNumber(p)){
num = Integer.parseInt(p);
} else {
System.out.println("ESTO NO ES UN NÚMERO");
}


if(num == 0 || num == 1 || num == 2 || num == 3 || num == 4)
System.out.println("INSUFICIENTE");
else if(num == 5)
System.out.println("SUFICIENTE");
else if(num == 6)
System.out.println("BIEN");
else if(num == 7 || num == 8)
System.out.println("NOTABLE");
else if(num == 9 || num == 10)
System.out.println("SOBRESALIENTE");
else
System.out.println("No ha introducido una nota correcta");


}


/**
* 
* Este método sirve para saber si un String es un número o no.
* 
* @param Parámetro a validar.
* 
*/
public static boolean isNumber(String p){
try {
Integer.parseInt(p);
return true;
} catch (NumberFormatException e){
return false;
}
}




}