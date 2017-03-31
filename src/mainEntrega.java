
/**
 * @author FERCHUS
 *
 */
public class mainEntrega {

	public static void main(final String[] args) {
		
		Pila pila = new Pila();
		
		System.out.println("\nConsulta si la pila está vacia");
        System.out.println(pila.esVaciaPila());
        
        // Agregar valores a la pila
        pila.apilar(56);
        System.out.println("\nConsulta el tope de la pila");
        System.out.println(pila.tope());
        pila.apilar(7);
        System.out.println("\nConsulta el tope de la pila");
        System.out.println(pila.tope());
        pila.apilar(13);
        System.out.println("\nConsulta el tope de la pila");
        System.out.println(pila.tope());
        
        System.out.println("\nConsulta si la pila está vacia");
        System.out.println(pila.esVaciaPila());
        
        while (!pila.esVaciaPila()){
        	System.out.println("\nConsulta el tope de la pila");
            System.out.println(pila.tope());
        	System.out.println("\nEliminar el tope de la pila");
            pila.desapilar();
            System.out.println("\nDESAPILÓ");
            System.out.println("\nConsulta si la pila está vacia");
            System.out.println(pila.esVaciaPila());
        }
		
	}

}
