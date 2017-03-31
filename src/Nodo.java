/**
 * @author FERCHUS
 *
 */
public class Nodo {
    // Variable en la cual se va a guardar el valor.
    private int valor;
    // Variable para enlazar los nodos.
    private Nodo sig;
    
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public Nodo(){
        this.valor = 0;
        this.sig = null;
    }
    
    /**
     * Constructor que inicializamos el valor de las variables pasadas por parametros.
     */
    public Nodo(int n, Nodo sig){
        this.valor = n;
        this.sig = sig;
    }
    
    // Métodos get y set para los atributos.
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return sig;
    }

    public void setSiguiente(Nodo sig) {
        this.sig = sig;
    }   
}
