/**
 *Interfaz para definir las operaciones que un Sujeto debe
 *realizar para manejar a sus observadores.
 */
public interface Sujeto {
    
    /**
     *Agrega a un nuevo observador.
     *@param observador El observador que se desea agregar.
     */
    public void agregaObservador(Observador observador);
    
    /**
     *Elimina al observador seleccionado.
     *@param observador El observador que se desea eliminar.
     */
    public void quitaObservador(Observador observador);

    /**
     *Da aviso a los observadores del cambio de estado del sujeto,
     *esto es, cada que avanza la fila.
     */
    public void notificaObservador();    

}
