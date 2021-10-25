/**
 *Clase que modela a un Usuario. Cada usuario se convierte en un observador al
 *formarse en una fila y cambia su estado correspondientemente.
 */
public class Usuario implements Observador {

    private Sujeto fila; 
    private int turno;
    private int tiempo;
    
    //guardamos referencia a todos los posibles estados del Usuario.
    private EstadoUsuario formado; 
    private EstadoUsuario desformado;
    private EstadoUsuario enTurno;
    private EstadoUsuario estadoActual;
    
    /**
     *Constructor que recibe la referencia a la fila y crea las instancias
     *de los diferentes estados del usuario y sitúa al objeto tipo usuario
     *en el estado "Desformado".
     *@param fila El sujeto(fila) que será observado por cada usuario.
     */
    public Usuario(Sujeto fila){

	this.fila = fila;
	formado = new Formado(this); 
    	desformado = new Desformado(this);
	enTurno = new EnTurno(this);
	estadoActual = desformado;
    }
    
    @Override
    public void actualiza(int tamañoFila){ //Este parámetro proviene de la clase Fila.
	tiempo = tamañoFila * 3;
	turno = tamañoFila;
	if(tiempo <= 0){
	    setEstado(enTurno);
	    formarse();
	    desformarse();
	    checarTiempo();
	    
	} else {
	    System.out.println("Eres el " + turno + "º en la fila");
	    System.out.println("Tu tiempo de espera: "+ tiempo + " minutos.\n");

	}
    }
    
    /**
     *Método getter para obtener el tiempo de espera restante del usuario.
     *@return int El tiempo de espera restante para el usuario.
     */
    public int getTiempo(){
	return tiempo;
    }

    /**
     *Método getter para obtener el turno asignado al usuario.
     *@return int El turno asignado al usuario.
     */
    public int getTurno(){
	return turno;
    }

    /**
     *Método para situar al objeto tipo usuario en el estado correspondiente.
     *@param estado El estado del usuario que se quiere asignar.
     */
    public void setEstado(EstadoUsuario estado){

        estadoActual = estado;
    }
    
    /**
     *Método para obtener el objeto del tipo EstadoUsuario "Formado".
     *que necesitamos para cambiar el estado.
     *@return EstadoUsuario El objeto en estado "Formado".
     */
    public EstadoUsuario getEstadoFormado(){
	
	return formado;
    }

     /**
     *Método para obtener el objeto del tipo EstadoUsuario "Desformado"
     *que necesitamos para cambiar el estado.
     *@return EstadoUsuario El objeto en estado "Desformado".
     */
    public EstadoUsuario getEstadoDesformado(){
	
	return desformado;
    }

    /**
     *Método para obtener el objeto del tipo EstadoUsuario "EnTurno"
     *que necesitamos para cambiar el estado.
     *@return EstadoUsuario El objeto en estado "EnTurno".
     */
    public EstadoUsuario getEstadoEnTurno(){
	
	return enTurno;
    }

    /**
     Método para obtener el estado actual del usuario.
     *@return EstadoUsuario El estado actual del usuario.
     */
    public EstadoUsuario getEstadoActual(){

	return estadoActual;
    }

    /**
     *Método para ejecutar la acción "formarse" de acuerdo al estado en 
     *el que se encuentra el usuario.
     */

    public void formarse(){

        estadoActual.formarse();
    }

    /**
     *Método para ejecutar la acción "desformarse" de acuerdo al estado en
     *el que se encuentra el usuario.
     */

    public void desformarse(){

        estadoActual.desformarse();
    }

    /**
     *Método para ejecutar la acción "checarTiempo" de acuerdo al estado en
     * el que se encuentra el usuario.
     */

    public void checarTiempo(){

        estadoActual.checarTiempo();
    }

    /**
     *Método para atender al usuario en turno. Al finalizar, sitúa
     *al objeto tipo EstadoUsuario en el estado "Desformado".
     */
    public void atender(){
	try {
	    Thread.sleep(2000);
	} catch (InterruptedException e){
	    System.exit(0);
	}
	System.out.println("\nUsted ha sido atendido. Gracias por su visita :)");
	setEstado(desformado);
    }
}
