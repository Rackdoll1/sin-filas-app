/**
 *Clase que define las operaciones que puede llevar a cabo
 *un usuario que se encuentre Formado.
 */

public class Formado implements EstadoUsuario{

    private Usuario usuario;

    /**
     *Método constructor que recibe una referencia al objeto tipo Usuario.
     *@param usuario El objeto tipo Usuario al que vamos a referenciar.
     */
    public Formado(Usuario usuario){
	this.usuario = usuario; 
    }

    @Override
    public void formarse(){
	System.out.println("Ya estás formado en otra fila. Primero debes desformarte.");
    }

    @Override
    public void desformarse(){
	System.out.println("Te has desformado.");
	usuario.setEstado(usuario.getEstadoDesformado());
    }

    @Override
    public void checarTiempo(){
	System.out.println("Tu tiempo de espera: "+usuario.getTiempo()+" minutos.");
    }
}

