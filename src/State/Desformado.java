/**
 *Clase que define la operaciones que puede llevar a cabo
 *un usuario que se encuentre Desformado.
 */
public class Desformado implements EstadoUsuario{

    private Usuario usuario;
    /**
     *Método constructor que recibe una referencia al objeto tipo Usuario.
     *@param usuario El objeto tipo Usuario al que vamos a referenciar.
     */
    public Desformado(Usuario usuario){
	this.usuario = usuario; 
    }

    @Override
    public void formarse(){
	System.out.println("Te has formado exitosamente.");
	usuario.setEstado(usuario.getEstadoFormado());
    }

    @Override
    public void desformarse(){
	System.out.println("Primero debes formarte.");
    }

    @Override
    public void checarTiempo(){
	System.out.println("Primero debes formarte.");
    }
}

