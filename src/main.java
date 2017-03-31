
public class main {

	public static void main(final String[] args) {
		Lista lista = new Lista();
		//ListaConArreglo listaArray = new ListaConArreglo();
		//ListaConArreglo listaArray2 = new ListaConArreglo(5);
        
        System.out.println("<<-- Ejemplo de lista simple -->>\n");
        
        // Agregar al final de la lista
        lista.agregarAlFinal(12);
        lista.agregarAlFinal(15);
        lista.agregarAlFinal(9);
        // Agregar in inicio de la lista
        lista.agregarAlInicio(41);
        lista.agregarAlInicio(6);
        
        System.out.println("<<-- Lista -->>");
        lista.listar();
        
        System.out.println("\n\n<<-- Tamaño -->");
        System.out.println(lista.getTamanio());
        
        System.out.println("\nInsrta un nodo con valor 16 despues del 15");
        lista.insertarPorReferencia(15, 16);
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\n\nInsrta un nodo con valor 44 en la posición 3");
        lista.insrtarPorPosicion(3, 44);
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\nElimina el nodo con el valor 41");
        lista.removerPorReferencia(41);        
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\nElimina el nodo en la posición 4");
        lista.removerPorPosicion(4);        
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\nConsulta si existe el valor 30");
        System.out.println(lista.buscar(30));
        
        System.out.println("\nConsulta el valor en la posicion dada");
        System.out.println(lista.at(5));
        
        System.out.println("\nElimina la lista");
        lista.eliminarLista();
        
        System.out.println("\nConsulta si la lista está vacia");
        System.out.println(lista.esVacia());
        
        System.out.println("\n\n<<-- Fin de ejemplo lista simple -->>");
        
        /**System.out.println("\n\n<<-- Ejemplo de lista simple con ARREGLO-->>\n");
        
        System.out.println("<<-- Tamaños -->");
        System.out.print(" | Tamaño arreglo 1: ");
        System.out.println(listaArray.getTamanio());
        System.out.print(" | Tamaño arreglo 2: ");
        System.out.println(listaArray2.getTamanio());
        
        System.out.println("\n\n<<-- Agregar elementos -->");
        //en el arreglo 1
        listaArray.agregarAlInicio(45);
        listaArray.agregarAlInicio(1);
        listaArray.agregarAlInicio(25);
        listaArray.agregarAlInicio(100);
        //en el arreglo 2
        listaArray2.agregarAlInicio(1);
        listaArray2.agregarAlInicio(2);
        listaArray2.agregarAlInicio(3);
        
        System.out.println("<<-- Listas -->>");
        System.out.println("<<-- Lista1 -->>");
        listaArray.mostrarLista();
        System.out.println("\n<<-- Lista2 -->>");
        listaArray2.mostrarLista();
        
        System.out.println("\nInserta varios valores");
        listaArray.agregarAlInicio(659);
        listaArray.agregarAlInicio(9);
        listaArray.mostrarLista();
        System.out.print(" | Tamaño: ");
        System.out.println(listaArray.getTamanio());
        System.out.println("\nInserta varios valores");
        listaArray2.agregarAlInicio(659);
        listaArray2.agregarAlInicio(9);
        listaArray2.agregarAlInicio(61);
        listaArray2.agregarAlInicio(3);
        listaArray2.mostrarLista();
        System.out.print(" | Tamaño: ");
        System.out.println(listaArray2.getTamanio());
        
        System.out.println("\n\n<<-- Tamaños -->");
        System.out.print(" | Tamaño arreglo 1: ");
        System.out.println(listaArray.getTamanio());
        System.out.print(" | Tamaño arreglo 2: ");
        System.out.println(listaArray2.getTamanio());
        
        System.out.println("\n\n<<-- buscar por posicion -->");
        System.out.println(listaArray.at(2));
        System.out.println(listaArray2.at(2));**/
        
    }   
}
