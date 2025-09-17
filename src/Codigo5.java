import java.util.Scanner;

public class Codigo5 {
	
	/*El codigo nos permite saber si un número es afortunado o no afortunado en base a cuantos números o digitos afortunados
	 * coincidan con el 3, 7, 8, 9*/

	public static void main(String[] args) { //Se agrega la clase main
		Scanner s = new Scanner(System.in); // Se importa Scanner
	    System.out.print("Introduzca un número: "); // Se cambia la comilla simple ' que se tenia al final por una doble "
	    int  ni = s.nextInt(); // Se cambia el tipo de dato de la solicitud de String a un int
	    int c = ni;
	    
	    int afo = 0; //Afortunado
	    int noAfo = 0; //No afortunado
	    
	    while (ni> 0) {
		  int digito = (ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	      } // Faltaba esta llave de cierre 
		ni /= 10;
	    } //cierre while
	    
	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado."); //Se agrega la t en la palabra print
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }

	}
}


