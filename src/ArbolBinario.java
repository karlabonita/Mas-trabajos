
public class ArbolBinario {
    public NodoBinario raiz;
    
    
    public ArbolBinario(){
    
        raiz = null;
        
    }
    
    public void insertarNodo(int valorInsertar){
    
        if(raiz == null)
            raiz = new NodoBinario(valorInsertar);
        else
            raiz.insertar(valorInsertar);
    }
    
    //comienzo de los recorridos
    public void recorridoPreorden(){
    
        ayudaPreorden(raiz);
    }
    
    private void ayudaPreorden(NodoBinario nodo){
    
        if(nodo==null)
            return;
        System.out.printf(" %d ", nodo.valor);
        ayudaPreorden(nodo.nIzquierdo);
        ayudaPreorden(nodo.nDerecho);
    }
    
    public void recorridoInorden(){
    
        ayudaInorden(raiz);
    }
    
    private void ayudaInorden(NodoBinario nodo){
         if(nodo==null)
            return;
         ayudaInorden(nodo.nIzquierdo);
         System.out.printf("%d" , nodo.valor);
         ayudaInorden(nodo.nDerecho);
            
    }
    
     public void recorridoPostOrden(){
     
         ayudaPostOrden(raiz);
     }
    
    private void ayudaPostOrden(NodoBinario nodo){
    
        if(nodo==null)
            return;
        
        ayudaPostOrden(nodo.nIzquierdo);
        ayudaPostOrden(nodo.nDerecho);
        System.out.printf("%d", nodo.valor);
    
    }
  }
