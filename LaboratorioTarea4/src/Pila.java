import java.util.Stack;

public class Pila {
	Stack pila=new Stack();
	
	public void mostrarPush(int a){
		System.out.println("Ingresando valor " + a + " a la plia...");
		pila.push(a);
	}
	public void mostrarPop(){
		System.out.println("Haciendo pop de la pila...");
		pila.pop();
	}
	public void mostrarPila(){
		System.out.println("Contenido de la pila: "+pila);
	}

	public static void main(String[] args) {
		Pila p = new Pila();
		p.mostrarPila();
		p.mostrarPush(90);
		p.mostrarPila();
		p.mostrarPush(100);
		p.mostrarPila();
		p.mostrarPush(150);
		p.mostrarPila();
		p.mostrarPop();
		p.mostrarPila();

	}

}
