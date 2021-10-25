import java.util.Scanner;
/**
 *Clase que implementa el patrón fachada para el manejo de
 *los usuarios, filas y establecimientos.
 */
public class ControlApp {

    public static Scanner sc = new Scanner(System.in);
    Fila nuevaFila = new Fila();
    Usuario usuario = new Usuario(nuevaFila);

    /**
     *Método que permite al usuario usar la aplicación.
     */
    public void usarApp() {
	boolean confirmar = false;
	System.out.println("Hola usuario, bienvenido a la aplicación. Estas son las acciones disponibles.\n(Por favor elija una acción presionando el número correspondiente).");
	do{
	    System.out.println("\n¿Qué desea hacer?");
	    System.out.println("1) Formarse.");
	    System.out.println("2) Desformarse.");
	    System.out.println("3) Ver tiempo.");
	    System.out.println("4) Continuar fila.");
	    System.out.println("5) Salir de la aplicación.");

	    switch (sc.next().charAt(0)){

	    case '1':
		if (usuario.getEstadoActual() == usuario.getEstadoDesformado()) { //el usuario sólo puede proceder a formarse si está en el estado Desformado.
		    nuevaFila.setTamañoFila();
		    elegirEstablecimiento();
		    nuevaFila.agregaObservador(usuario);
		}
		usuario.formarse();
		break;

	    case '2':
		if(usuario.getEstadoActual() == usuario.getEstadoFormado()) {
		   nuevaFila.quitaObservador(usuario);
		}
		usuario.desformarse();
		break;

	    case '3':
		usuario.checarTiempo();
		break;

	     case '4':
		 if(usuario.getEstadoActual() == usuario.getEstadoFormado()){
		     nuevaFila.avanzaFila(nuevaFila.getTamañoFila());
		     usuario.atender();
		 } else {
		     System.out.println("Primero debes formarte");
		 }
		break;

	    case '5':

		System.out.println("Gracias por haber usado esta aplicación. Que tenga buen día.");
		confirmar = true;
		break;

	    default:
		System.out.println("Por favor elija una de las 4 opciones presionando un número.");
	    }
	    
	} while(!confirmar);
    }


    /**
     *Método auxiliar para que el proceso de elección de un establecimiento.
     */
    public void elegirEstablecimiento() {
	boolean confirmar = false;

	System.out.println("Por favor elija una categoría presionando el número correspondiente:");

	do{
	    System.out.println("1) Restaurante.");
	    System.out.println("2) Banco.");
	    System.out.println("3) Supermercado.");

	    switch (sc.next().charAt(0)){
		
	    case '1':
		Establecimiento restaurante = new Restaurante();
		restaurante.elegirLugar();
		confirmar = true;
		break;

	    case '2':
		Establecimiento banco = new Banco();
		banco.elegirLugar();
		confirmar = true;
		break;

	    case '3':
		Establecimiento supermercado = new Supermercado();
		supermercado.elegirLugar();
		confirmar = true;
		break;

	    default:
		System.out.println("Por favor elija una de las 3 opciones presionando un número.");		
	    }

	} while(!confirmar);	
    }

}
