package gui;

import javax.swing.JFrame;
import javax.swing.border.TitledBorder;
import controller.Controller;


public class Window extends JFrame {
	
	private Controller controller;
	private PanelEste panelEste;
	private PanelOeste panelOeste;
	
	
	public Window(Controller cntrl) {
		
		this.controller = cntrl;
		this.setSize(900, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		/* Configuramos paneles */
		this.panelEste = new PanelEste(this.controller);
		this.panelEste.setBounds(250, 0, 630, 650);
		this.panelEste.setBorder(new TitledBorder("PLOT"));
		this.panelOeste = new PanelOeste(this.controller);
		
		this.add(this.panelOeste);
		this.add(this.panelEste);		
		/*######################*/
		
		this.setResizable(false);
		this.setVisible(true);	
	}

}
