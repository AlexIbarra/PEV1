package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import controller.Controller;


public class PanelOeste extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private Controller controller;
	private String[] func = {"Funcion 1", "Funcion 2", "Funcion 3", "Funcion 4", "Funcion 5"};
	private JComboBox<String> comboBoxFuncion;
	private JComboBox<String> comboBoxCruce;
	private JComboBox<String> comboBoxSeleccion;
	private JTextField precision;
	private JTextField poblacion;
	private JTextField iteraciones;
	private JTextField porcCruces;
	private JTextField porcMutacion;
	private JTextField semilla;
	
	
	public PanelOeste(Controller cntrl) {
		
		super();
		this.setLayout(null);
		this.controller = cntrl;
		this.setSize(300, 700);	
		this.setOpaque(true);
//		this.setBackground(Color.RED);
		
		/*######## Componentes ########*/
				
		
		/* -- Combo Box para las funciones -- */
		JLabel jlFuncion = new JLabel("Funcion");
		this.comboBoxFuncion = new JComboBox<String>(func);
		this.comboBoxFuncion.setSelectedIndex(0);
		jlFuncion.setHorizontalTextPosition(SwingConstants.LEFT);
		jlFuncion.setBounds(5, 3, 70, 25); // x, y, width, height
		this.comboBoxFuncion.setBounds(88, 3, 140, 25);		
		this.add(jlFuncion);
		this.add(this.comboBoxFuncion);
		
		/* -- Text Field para la precision  -- */
		JPanel jpCromosomas = new JPanel();
		jpCromosomas.setBorder(new TitledBorder("Cromosomas"));
		JLabel jlPrecision = new JLabel("Precision");
		this.precision = new JTextField();
		jlPrecision.setBounds(5, 50, 70, 25); // x, y, width, height
		this.precision.setBounds(90, 50, 140, 25); // x, y, width, height
//		jpCromosomas.add(jlPrecision);
//		jpCromosomas.add(this.precision);
		this.add(jlPrecision);
		this.add(this.precision);
		
		/* -- Text Field para la poblacion  -- */
		JLabel jlPoblacion = new JLabel("Poblacion");
		this.poblacion = new JTextField();
		jlPoblacion.setBounds(5, 80, 70, 25); // x, y, width, height
		this.poblacion.setBounds(90, 80, 140, 25); // x, y, width, height
		this.add(jlPoblacion);
		this.add(this.poblacion);
		
		/* -- Text Field para la iteraciones  -- */
		JLabel jlIteraciones = new JLabel("Iteraciones");
		this.iteraciones = new JTextField();
		jlIteraciones.setBounds(5, 110, 80, 25); // x, y, width, height
		this.iteraciones.setBounds(90, 110, 140, 25); // x, y, width, height
		this.add(jlIteraciones);
		this.add(this.iteraciones);
		
		/* -- Text Field para la porcentaje de cruces  -- */
		JLabel jlCruces = new JLabel("% Cruces");
		this.porcCruces = new JTextField();
		jlCruces.setBounds(5, 140, 80, 25); // x, y, width, height
		this.porcCruces.setBounds(90, 140, 140, 25); // x, y, width, height
		this.add(jlCruces);
		this.add(this.porcCruces);
		
		/* -- Text Field para la porcentaje de mutaciones  -- */
		JLabel jlMutacion = new JLabel("% Mutacion");
		this.porcMutacion = new JTextField();
		jlMutacion.setBounds(5, 170, 90, 25); // x, y, width, height
		this.porcMutacion.setBounds(90, 170, 140, 25); // x, y, width, height
		this.add(jlMutacion);
		this.add(this.porcMutacion);
		
		/* ########################### */
		

	}
	
	
}
