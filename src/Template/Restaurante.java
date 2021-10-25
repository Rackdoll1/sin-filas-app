import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *Clase que define la implementación concreta del método Template
 *de la clase Establecimiento en un Restaurante.
 */
public class Restaurante extends Establecimiento{

    @Override
    public void elegirOperacion(Scanner sc){
	boolean confirmado = false;
	
	System.out.println("¿Para cuánta gente es la reservación?");
	System.out.println("Por favor ingrese el número de personas con números.");
	
	do{
	    try{
		int respuesta = sc.nextInt();
	
		if(respuesta > 0 && respuesta < 5){
		    System.out.println("Se te ha ubicado en una fila.\n");
		    confirmado = true;
		    sc.nextLine();
		} else if (respuesta > 4 && respuesta < 8 ){
		    System.out.println("Tu tiempo de espera puede ser un poco más largo...");
		    try {
			Thread.sleep(2000);
		    } catch (InterruptedException e){
			System.exit(0);
		    }
		    System.out.println("Se te ha ubicado en una fila.\n");
		    confirmado = true;
		    sc.nextLine();
		} else {
		    System.out.println("No manejamos mesas con ese número de personas, por favor ingrese otro número.");
		    sc.nextLine();
		}
		
	    } catch (InputMismatchException ex) {
		System.out.println("Sólo se aceptan números. Por favor intente de nuevo.");
		sc.nextLine();
	    }
	    
	} while (!confirmado);
	
    } 

}
