/**
 *Interfaz para definir las operaciones que un usuario puede
 *realizar según el estado en el que se encuentre.
 */
public interface EstadoUsuario{

    /**
     *Método que permite al usuario formarseen una fila.
     */
    public void formarse();

    /**
     *Método que permite al usuario desformarse de una fila.
     */
    public void desformarse();

    /**
     *Método para checar el tiempo restante
     *para que sea el turno del usuario.
     */
    public void checarTiempo();

}
