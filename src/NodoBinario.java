
public class NodoBinario {
    
    public int valor;
    public NodoBinario nDerecho;
    public NodoBinario nIzquierdo;

    
    // constructor de la clase
    public NodoBinario(int valorN ){
    
        valor = valorN;
        nDerecho = null; 
        nIzquierdo = null;
    
    
    }
    
    public void insertar(int valorInsertar){
        
        if(valorInsertar < valor){
            //insertar un nodo en el arbol
            if(nIzquierdo==null)
                nIzquierdo = new NodoBinario(valorInsertar);
            else 
                nIzquierdo.insertar(valorInsertar);
        }else if (valorInsertar > valor ){
        
            if(nDerecho == null)
                nDerecho = new NodoBinario(valorInsertar);
            else
                nDerecho.insertar(valorInsertar);
        }
    
    
    }

    
    
    
}
