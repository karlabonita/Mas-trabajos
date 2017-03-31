
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
               int valor;
               Random sc = new Random();
        
              ListaEnlazada theList = new ListaEnlazada();
              ArbolBinario binario = new ArbolBinario();
		
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		
		theList.displayList();
		
		Nodo f;
		
		f = theList.find(44);
		
		if (f != null){
			System.out.print("Se encontro enlace con llave "+f.iData+"\n");
                }else
			System.out.print("No se pudo encontrar el enlace \n");
		
		Nodo d = theList.delet(66);
		
		if (d != null){
			System.out.print("Se elimino enlace con llave "+d.iData+"\n");
			//free (d)
		}
		else
			System.out.print("No se pudo eliminar el enlace");
		
		System.out.println();
		theList.displayList();
    
                System.out.println("----------------------------------------");
                
                System.out.println("Inserte ahora los valores de su arbol binario");
                for(int i = 0;i<=10;i++){
                    valor= sc.nextInt(100);
                    System.out.println(valor + "");
                    binario.insertarNodo(valor);
                
                
                }
                System.out.println("\n\n Recorrido preorden");
                binario.recorridoPreorden();
                
                System.out.println("\n\n Recorrido Inorden");
                binario.recorridoInorden();
                
                System.out.println("\n\n Recorrido Postorden");
                binario.recorridoPostOrden();
                
           
    }
                
    }

    

