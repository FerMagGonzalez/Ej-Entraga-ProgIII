

/**
 * Clase que define las operaciones básicas que debe tener una lista pero hecha con un arreglo.
 * @author FERCHUS
 */
public class ListaConArreglo {

	private int[] lista;
	private int cantElem = 0;
	
	/**
     * Constructor por defecto.
     */
    public ListaConArreglo(){
    	this.lista = new int[10];
    }
    
    /**
     * Constructor con parametro
	 * @param el tamaño del arreglo
	 */
	public ListaConArreglo(int tamanio) {
		this.lista = new int[tamanio];
	}
	
	/**
     * Consulta si el arreglo esta vacio.
     * @return true si el el arreglo es null.
     */
	public boolean esVacio(){
		return this.cantElem == 0;
	}
	
	/**
     * Consulta cuantos elementos tiene el arreglo.
     * @return el numero de elementos que contiene el arreglo.
     */
    public int getCantElem(){
        return this.cantElem;
    }
    
	/**
     * Consulta el tamaño que tiene el arreglo.
     * @return el tamaño que tiene el arreglo.
     */
    public int getTamanio(){
        return lista.length;
    }
    
    /**
     * Agrega un nuevo valor al inicio de la lista.
     * @param valor a agregar.
     */   
    public void agregarAlInicio(int valor){
        // Consulta si la lista no esta vacia.
        if (!esVacio()){
        	//Consulta si el tañano del arreglo es menor o igual a la cantidad de elementos.
            if (getTamanio() == getCantElem()){
            	int[] arregloNuevo = new int[getTamanio() * 2];
            	//Copia la lista existente a la nueva con el doble de capacidad.
            	for(int i=0; i<this.getCantElem(); i++){
            		arregloNuevo[i] = lista[i];
            	}
            	lista = arregloNuevo;
            }
            //Hace el corrimiento para insertar el valor en el principio.
            for(int i=this.getCantElem(); i>0; i--){
        		lista[i] = lista[i-1];
        	}
        }
        // Agrega el valor al linicio de la lista.
        lista[0] = valor;
        // Incrementa el contador de tamaño de la lista.
        cantElem++;
    }
    
    /**
     * Buscar un elemento en una posición.
     * @param pos es la posicion de la que quiero saber el elemento
     * @return el elemento en la posicion pasada por parametro.
     */
    public int at(int pos){
		return lista[pos];
    	
    }

    public void mostrarLista(){
        if (!esVacio()) {
            for (int i=0; i<this.getCantElem();i++){
            	System.out.print(i + ".[ " + lista[i] + " ]" + " ->  ");
            }
        }
    }
    
}
