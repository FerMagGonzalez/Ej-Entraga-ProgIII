
public class main2 {

	public static void main(final String[] args) {
		
		Lista lista = new Lista();
        
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
        
        System.out.println("\n\n<<-- función que dada una lista de números enteros "
        		+ "determine el máximo y su posición. -->");
        int pos = lista.posMax();
        System.out.println("\nEl maximo valor de la lista es " + lista.at(pos) + 
        		" y esta en la posicion " + pos + ".");
		
	}
}
