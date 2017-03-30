
public class Nodo {
    public int iData;		//item (llave)
	public double dData;	//otro dato
	public Nodo next;
	
	public Nodo (int id, double dd){
		iData = id;
		dData = dd;
		next = null;
	}
	
	public void displayLink (){
		System.out.print("{"+iData+","+dData+"}");
	}
}
