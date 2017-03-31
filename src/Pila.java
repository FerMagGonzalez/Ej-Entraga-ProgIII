/**
 * @author FERCHUS
 */
public class Pila {
	private Lista pila;

	/**
	 * Constructor por defecto.
	 */
	public Pila() {
		pila = new Lista();
	}
	
	/**
     * Consulta si la pila esta vacia.
     * @return true si esta vacia.
     */
    public boolean esVaciaPila(){
    	return pila.esVacia();
    }
	
	/**
	 * Agrega el valor a la pila
	 * @param valor a agregar
	 */
	public void apilar(int valor){
		pila.agregarAlInicio(valor);
	}
	
	/**
	 * Devuelve el valor del tope de la pila.
	 */
	public int tope(){
		return pila.at(0);
	}
	
	public void desapilar(){
		if (!this.esVaciaPila()){
			pila.removerPorPosicion(0);
		}
	}
	
}
