import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *Clase que define la implementación concreta del método Template
 *de la clase Establecimiento en un Supermercado.
 */
public class Supermercado extends Establecimiento{

    @Override
    public void elegirOperacion(Scanner sc){
	boolean confirmado = false;
	
	System.out.println("¿Cuántos artículos va a comprar?");
	System.out.println("Por favor ingrese el número de artículos con números.");
	System.out.println("(Se le recuerda que si no es veraz con el número de artículos, no será atendido.)");
	
	do{
	    try{
		int respuesta = sc.nextInt();

		if(respuesta > 0 && respuesta < 11) {
		    System.out.println("Se te ha ubicado en la fila express de 10 artículos o menos.\n");
		    confirmado = true;
		    sc.nextLine();
		} else if (respuesta > 10) {
		    System.out.println("Se te ha ubicado en una fila.\n");
		    confirmado = true;
		    sc.nextLine();
		} else {
		    System.out.println("Debe de comprar al menos un artículo para poder ser atendido.");
		    sc.nextLine();
		}
		
	    } catch (InputMismatchException ex) {
		System.out.println("Sólo se aceptan números. Por favor intente de nuevo.");
		sc.nextLine();
	    }
	} while (!confirmado);
	
    }
    
}
