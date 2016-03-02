package main;

import ag.AGenetico;
import ag.Cromosoma;
import ag.Datos;
import controller.Controller;
import gui.Window;

public class Main {

	public static void main(String[] args) {
		
		Datos datos = new Datos();
		Controller controller = new Controller(datos);
		Window win = new Window(controller);
		
		
		if(controller.hayDatos()) {
			AGenetico AG = new AGenetico(datos);
			AG.inicializa();
			AG.evaluarPoblacion();
			 
			while(!AG.terminado()) {
			 
				AG.incGeneracion();
				AG.seleccion();
				AG.reproduccion();
				AG.mutacion();
				AG.evaluarPoblacion();
			}
			  
			Cromosoma mejor = AG.elMejor();
			System.out.println(mejor.toString());
		} 

	}

}
