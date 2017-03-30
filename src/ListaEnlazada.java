
import sun.awt.image.ImageWatched.Link;

public class ListaEnlazada {
	
	public Nodo first;
	
	public ListaEnlazada(){
		first = null; // no hay aun items en la lista
	}
	
	public boolean isEmpty (){ // true if list is empty
		return (first==null);
	}
		
	//INSERTAR AL COMIENZO DE LA LISTA
	public void insertFirst (int id, double dd){

		//Crear un nuevo enlace
		Nodo newLink = new Nodo(id,dd);
		newLink.next = first;
		first = newLink;
	}
	
	//ELIMINA EL PRIMER ITEM
	public Nodo deleteFirst (){
		Nodo temp = first;
		first = first.next;
		return temp;
	}
	
	
	public void displayList (){
		
		System.out.println("Lista (primero-->ultimo): ");
		Nodo current = first;
		
		while (current!=null){
			current.displayLink();
			System.out.print("->");
			current = current.next;
		}
		System.out.println("\n");
	}
	
	//BUSCA LINK DADA UNA LLAVE
	public Nodo find (int key){
		
		Nodo current = first;
		while (current.iData != key){
			if (current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;		
	}
	
	//BORRA UN ENLACE DADA UNA LLAVE
	public Nodo delet (int key){
	
		Nodo current = first;
		Nodo previous = first;
		
		while (current.iData != key){
			if (current.next == null)
				return null;
			else{
				previous = current;
				current = current.next;
			}
		}
		
		if (current == first)
			first = first.next;
		else
			previous.next = current.next;
		
		return current;
		
	}

}
