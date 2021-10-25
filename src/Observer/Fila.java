import java.util.ArrayList;

/**
 *Clase que define a una Fila impplementada como un ArrayList.
 */
public class Fila implements Sujeto{

    private ArrayList<Observador> fila;
    private int tamañoFila;

    //Para esta implementación, tamañoFila será inicializado con un valor semialeatorio, para representar el número de gente que ya está formada en la fila cuando el usuario intenta formarse.
    /**
     *Constructor para el ArrayList de observadores(usuarios).
     */
    public Fila() {
	fila = new ArrayList<>();
    }
    
    @Override
    public void agregaObservador(Observador observador){
	fila.add(observador);
	tamañoFila++ ;
	System.out.println("Se te notificará cada que avance la fila.\n");
	notificaObservador();
    }

    @Override
    public void quitaObservador(Observador observador){
        fila.remove(observador);
	tamañoFila-- ;
    }

    @Override
    public void notificaObservador(){
	for(int i = 0; i< fila.size(); i++){
	    Observador observador = (Observador)fila.get(i);
	    observador.actualiza(tamañoFila);
	}
    }

    /**
     *Método getter para el tamaño de la fila.
     *@return int El tamaño de la fila.
     */
    public int getTamañoFila(){
	return tamañoFila;
    }

    /**
     *Método setter para el tamaño de la fila. Asigna un número
     *semialeatorio al tamaño de la fila.
     */
    public void setTamañoFila(){
	 tamañoFila = (int)(Math.random()*9)+1;	
    }
    
    /**
     *Método para simular que la fila avanza.
     */
    public void avanzaFila(int tamaño){
	for(int i = tamaño; i > 0; i--) {
	    tamañoFila = tamañoFila - 1;
	    System.out.println("Se ha movido la fila!");
	    notificaObservador();
	    try {
		Thread.sleep(2000);
	    } catch (InterruptedException e){
		System.exit(0);
	    }
	}
    }
}
