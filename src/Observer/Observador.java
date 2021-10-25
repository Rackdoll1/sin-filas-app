/**
 *Interfaz para definir las operaciones que un observador(usuario)
 *debe realizar.
 */
public interface Observador{
    /**
     *Método que actualiza el turno y tiempo de espera
     *de cada usuario formado. Cada que se mueva la fila,
     *se actualizará al observador con el nuevo tamaño de la fila.
     *@param tamañoFila El tamaño actual de la fila.
     */
    public void actualiza(int tamañoFila);

}
