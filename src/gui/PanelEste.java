package gui;


import java.awt.Color;
import javax.swing.JPanel;
import controller.Controller;

public class PanelEste extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private Controller controller;
	
	
	public PanelEste(Controller cntrl) {
		
		super();
		this.controller = cntrl;
		this.setSize(600, 700);	
		this.setOpaque(true);
		this.setBackground(Color.GREEN);
	}

}
