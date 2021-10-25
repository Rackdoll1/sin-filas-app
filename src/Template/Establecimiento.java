import java.util.Scanner;
/**
 *Clase abstracta que contiene el método Template para elegir el
 *establecimiento requerido por el usuario.
 */
public abstract class Establecimiento{

    private String nombre;

    /**
     *Método template para que el usuario seleccione un establecimiento.
     */

    public final void elegirLugar(){

	ingresarLugar(ControlApp.sc);
	buscarLugar();
	elegirOperacion(ControlApp.sc);
    }

    /**
     *Método para que el usuario pueda ingresar el nombre
     *del establecimiento buscado. 
     *@param sc El objeto scanner que tomará el input del usuario.
     */
    public void ingresarLugar(Scanner sc){
	sc.nextLine();
	System.out.println("Por favor ingrese el nombre del lugar que busca:");
	String nombre = sc.nextLine();
	this.nombre = nombre;	
    }

    /**
     *Método para buscar el establecimiento ingresado por el usuario.
     */
    public void buscarLugar(){
	System.out.println("Buscando lugar, espere un momento.");
	System.out.println("...");
	try {
	    Thread.sleep(1500);
	} catch (InterruptedException e){
	    System.exit(0);
	}
	System.out.println("¡Se encontró \"" + nombre +"\" cerca de ti!");
    }
    
    /**
     *Método para que el usuario elija una operación según el lugar
     *donde se va a formar.
     *@param sc El objeto scanner que tomará el input del usuario.
     */
    public abstract void elegirOperacion(Scanner sc);

    /**
     *Método para obtener el nombre del establecimiento buscado.
     */
    public String getNombre(){
	return nombre;
    }

	
}
