/**
 * Clase que define las operaciones básicas que debe tener una lista simple.
 * @author FERCHUS
 */
public class Lista {
    // Puntero que indica el inicio de la lista o conocida tambien
    // como cabeza de la lista.
    private Nodo inicio;
    // Variable para registrar el tamaño de la lista.
    private int tamanio;
    
    /**
     * Constructor por defecto.
     */
    public Lista(){
        inicio = null;
        tamanio = 0;
    }
    
    /**
     * Consulta si la lista esta vacia.
     * @return true si el el tamanio de la lista es cero.
     */
    public boolean esVacia(){
        return this.tamanio==0;
    }
    
    /**
     * Consulta cuantos elementos (nodos) tiene la lista.
     * @return el numero de elementosb que contenga la lista.
     */
    public int getTamanio(){
        return tamanio;
    }
    
    /**
     * Buscar un elemento en una posición.
     * @param pos es la posicion de la que quiero saber el elemento
     * @return el elemento en la posicion pasada por parametro.
     */
    public int at(int pos){
    	int i = 0;
    	int elem = -1;
    	Nodo aux = inicio;
    	while ((i < pos) && (aux != null)){
    		aux = aux.getSiguiente();
    		i++;
    	}
    	if (aux != null){
    		elem = aux.getValor();
    	}
		return elem;
    }
    
    /**
     * Agrega un nuevo nodo al final de la lista.
     * @param valor a agregar.
     */
    public void agregarAlFinal(int valor){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega el valor al nodo.
        nuevo.setValor(valor);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
        // Caso contrario recorre la lista hasta llegar al ultimo nodo
        //y agrega el nuevo.
        } else{
            // Crea ua copia de la lista.
            Nodo aux = inicio;
            // Recorre la lista hasta llegar al ultimo nodo.
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setSiguiente(nuevo);
        }
        // Incrementa el contador de tamaño de la lista
        tamanio++;
    }
    
    /**
     * Agrega un nuevo nodo al inicio de la lista.
     * @param valor a agregar.
     */   
    public void agregarAlInicio(int valor){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
        // Caso contrario va agregando los nodos al inicio de la lista.
        } else{
            // Une el nuevo nodo con la lista existente.
            nuevo.setSiguiente(inicio);
            // Renombra al nuevo nodo como el inicio de la lista.
            inicio = nuevo;
        }
        // Incrementa el contador de tamaño de la lista.
        tamanio++;
    }
    
    /**
     * Inserta un nuevo nodo despues de otro, ubicado por el valor que contiene.
     * @param referencia valor del nodo anterios al nuevo nodo a insertar.
     * @param valor del nodo a insertar.
     */
    public void insertarPorReferencia(int referencia, int valor){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        // Verifica si la lista contiene elementos
        if (!esVacia()) {
            // Consulta si el valor existe en la lista.
            if (buscar(referencia)) {
                // Crea ua copia de la lista.
                Nodo aux = inicio;
                // Recorre la lista hasta llegar al nodo de referencia.
                while (aux.getValor() != referencia) {
                    aux = aux.getSiguiente();
                }
                // Crea un respaldo de la continuación de la lista.
                Nodo siguiente = aux.getSiguiente();
                // Enlaza el nuevo nodo despues del nodo de referencia.
                aux.setSiguiente(nuevo);
                // Une la continuacion de la lista al nuevo nodo.
                nuevo.setSiguiente(siguiente);
                
                // Incrementa el contador de tamaño de la lista.
                tamanio++;
            }
        }
    }
    
    /**
     * Inserta un nuevo nodo despues en una posición determinada.
     * @param posicion en la cual se va a insertar el nuevo nodo.
     * @param valor valor del nuevo nodo de la lista.
     */
    public void insrtarPorPosicion(int posicion, int valor){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y <= que el numero de elementos del la lista.
        if(posicion>=0 && posicion<=tamanio){
            Nodo nuevo = new Nodo();
            nuevo.setValor(valor);
            // Consulta si el nuevo nodo a ingresar va al inicio de la lista.
            if(posicion == 0){
                // Inserta el nuevo nodo al inicio de la lista.
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            }
            else{
                // Si el nodo a inserta va al final de la lista.
                if(posicion == tamanio){
                    Nodo aux = inicio;
                    // Recorre la lista hasta llegar al ultimo nodo.
                    while(aux.getSiguiente() != null){
                        aux = aux.getSiguiente();
                    }
                    // Inserta el nuevo nodo despues de del ultimo.
                    aux.setSiguiente(nuevo);              
                }
                else{
                    // Si el nodo a insertar va en el medio de la lista.
                    Nodo aux = inicio;
                    // Recorre la lista hasta llegar al nodo anterior
                    // a la posicion en la cual se insertara el nuevo nodo.
                    for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getSiguiente();
                    }
                    // Guarda el nodo siguiente al nodo en la posición
                    // en la cual va a insertar el nevo nodo.
                    Nodo siguiente = aux.getSiguiente();
                    // Inserta el nuevo nodo en la posición indicada.
                    aux.setSiguiente(nuevo);
                    // Une el nuevo nodo con el resto de la lista.
                    nuevo.setSiguiente(siguiente);
                }
            }
            // Incrementa el contador de tamaño de la lista.
            tamanio++;
        }
    }
    
    /**
     * Elimina un nodo que se encuentre en la lista ubicado
     * por su posición.
     * @param posicion en la cual se encuentra el nodo a eliminar.
     */
    public void removerPorPosicion(int posicion){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<tamanio){
            // Consulta si el nodo a eliminar es el primero
            if(posicion == 0){
                // Elimina el primer nodo apuntando al siguinte.
                inicio = inicio.getSiguiente();
            }
            // En caso que el nodo a eliminar este por el medio 
            // o sea el ultimo
            else{
                // Crea una copia de la lista.
                Nodo aux = inicio;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                // Guarda el nodo siguiente al nodo a eliminar.
                Nodo siguiente = aux.getSiguiente();
                // Elimina la referencia del nodo apuntando al nodo siguiente.
                aux.setSiguiente(siguiente.getSiguiente());
            }
            // Disminuye el contador de tamaño de la lista.
            tamanio--;
        }
    }
    
    
    
    /**
     * Elimina un nodo que se encuentre en la lista ubicado
     * por un valor de referencia.
     * @param referencia valor del nodo que se desea eliminar.
     */
    public void removerPorReferencia(int referencia){
        // Consulta si el valor de referencia existe en la lista.
        if (buscar(referencia)) {
            // Consulta si el nodo a eliminar es el pirmero
            if (inicio.getValor() == referencia) {
                // El primer nodo apunta al siguiente.
                inicio = inicio.getSiguiente();
            } else{
                // Crea ua copia de la lista.
                Nodo aux = inicio;
                // Recorre la lista hasta llegar al nodo anterior 
                // al de referencia.
                while(aux.getSiguiente().getValor() != referencia){
                    aux = aux.getSiguiente();
                }
                // Guarda el nodo siguiente del nodo a eliminar.
                Nodo siguiente = aux.getSiguiente().getSiguiente();
                // Enlaza el nodo anterior al de eliminar con el 
                // sguiente despues de el.
                aux.setSiguiente(siguiente);  
            }
            // Disminuye el contador de tamaño de la lista.
            tamanio--;
        }
    }
    
    /**
     * Elimina la lista completa volviendo null el primer elemento.
     */
    public void eliminarLista(){
        // Elimina el valor y la referencia a los demas nodos.
        inicio = null;
        // Reinicia el contador de tamaño de la lista a 0.
        tamanio = 0;
    }
    
    /**
     * Mustra en pantalla los elementos de la lista.
     */
    public void listar(){
        // Verifica si la lista contiene elementos.
        if (!esVacia()) {
            // Crea una copia de la lista.
            Nodo aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while(aux != null){
                // Imprime en pantalla el valor del nodo.
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
    }
    
    /**
     * Busca si existe un valor en la lista.
     * @param referencia valor a buscar.
     * @return true si existe el valor en la lista.
     */
    public boolean buscar(int referencia){
        // Crea una copia de la lista.
        Nodo aux = inicio;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.getValor()){
                // Canbia el valor de la bandera.
                encontrado = true;
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el resultado de la bandera.
        return encontrado;
    }
    
    public int posMax(){
		Nodo aux = inicio;
		int max = aux.getValor();
		int pos = 0;
		int maxPos = 0;
		while (aux.getSiguiente() != null){
			if (aux.getValor() > max){
				max = aux.getValor();
				maxPos = pos;
			}
			aux = aux.getSiguiente();
			pos++;
		}
		return maxPos;
    }
    
}
