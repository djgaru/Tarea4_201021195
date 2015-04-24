import java.util.LinkedList;

public class Cola {
	LinkedList<Integer> cola = new LinkedList<Integer>();
	
	public void mostrarAdd(int a){
		System.out.println("Ingresando valor "+a+" a la cola...");
		cola.add(a);
	}
	public void mostrarRemover(){
		System.out.println("Removiendo un objeto de la pila...");
		cola.remove();
	}
	public void mostrarCola(){
		System.out.println("Contenido de la pila: "+cola);
	}
	

	public static void main(String[] args) {
		Cola c = new Cola();
		c.mostrarCola();
		c.mostrarAdd(30);
		c.mostrarCola();
		c.mostrarAdd(60);
		c.mostrarCola();
		c.mostrarAdd(25);
		c.mostrarCola();
		c.mostrarRemover();
		c.mostrarCola();
	}

}
