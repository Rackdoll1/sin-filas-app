import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *Clase que define la implementación concreta del método Template
 *de la clase Establecimiento en un Banco.
 */
public class Banco extends Establecimiento{

    @Override
    public void elegirOperacion(Scanner sc){
	boolean confirmado = false;
	
	System.out.println("¿Cuántas operaciones va a realizar?");
	System.out.println("Por favor ingrese el número de operaciones con números.");
	System.out.println("(Se le recuerda que si no es veraz con el número de operaciones, será penalizado en futuros usos de la aplicación.)");
	
	do{
	    try{
		int respuesta = sc.nextInt();

		if(respuesta > 0 && respuesta < 4) {
		    System.out.println("Se te ha ubicado en una fila.\n");
		    confirmado = true;
		    sc.nextLine();
		} else if (respuesta > 3 && respuesta < 6) {
		    System.out.println("Se te ha ubicado en una fila especial.\n");
		    confirmado = true;
		    sc.nextLine();
		} else {
		    System.out.println("No se puede realizar ese número de operaciones en este banco. Por favor intente con otro número.");
		    sc.nextLine();
		}
		
	    } catch (InputMismatchException ex) {
		System.out.println("Sólo se aceptan números. Por favor intente de nuevo.");
		sc.nextLine();
	    }
	} while (!confirmado);
	
    }
    
}
