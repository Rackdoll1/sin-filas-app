/**
 *Clase que define las operaciones que puede llevar a cabo
 *un usuario que se encuentre EnTurno.
 */
public class EnTurno implements EstadoUsuario{

    private Usuario usuario;
    
    /**
     *Método constructor que recibe una referencia al objeto tipo Usuario.
     *@param usuario El objeto tipo Usuario al que vamos a referenciar.
     */
    public EnTurno(Usuario usuario){
	this.usuario = usuario; 
    }

    @Override
    public void formarse(){
	System.out.println("Ya es tu turno de pasar!");
    }

    @Override
    public void desformarse(){
	System.out.println("Ya es tu turno de pasar!!");
    }

    @Override
    public void checarTiempo(){
	System.out.println("Ya es tu turno de pasar!!!");
    }
}
