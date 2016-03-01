package gui;

import javax.swing.JButton;
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
	private String[] cruces = {"Monopunto", "Multipunto"};
	private String[] selecciones = {"Ruleta", "Estocastico"};
	private JComboBox<String> cbFuncion;
	private JComboBox<String> cbCruce;
	private JComboBox<String> cbSeleccion;
	private JTextField precision;
	private JTextField poblacion;
	private JTextField iteraciones;
	private JTextField porcCruces;
	private JTextField porcMutacion;
	private JTextField semilla;
	private JButton lanzarCopia;
	private JButton relanzarAG;
	private JButton eliminarAG;
	
	
	public PanelOeste(Controller cntrl) {
		
		super();
		this.setLayout(null);
		this.controller = cntrl;
		this.setSize(250, 700);	
		
		/*######## Componentes ########*/
				
		
		/* -- Combo Box para las funciones -- */
		JLabel jlFuncion = new JLabel("Funcion");
		this.cbFuncion = new JComboBox<String>(func);
		this.cbFuncion.setSelectedIndex(0);
		jlFuncion.setHorizontalTextPosition(SwingConstants.LEFT);
		jlFuncion.setBounds(5, 3, 70, 25); // x, y, width, height
		this.cbFuncion.setBounds(88, 3, 140, 25);		
		this.add(jlFuncion);
		this.add(this.cbFuncion);
		
		/* -- Text Field para la precision  -- */
		JPanel jpCromosomas = new JPanel();
		jpCromosomas.setBorder(new TitledBorder("Cromosomas"));
		JLabel jlPrecision = new JLabel("Precision");
		this.precision = new JTextField();
		jlPrecision.setBounds(5, 50, 70, 25); // x, y, width, height
		this.precision.setBounds(90, 50, 140, 25); // x, y, width, height
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
		JLabel jlpocCruces = new JLabel("% Cruces");
		this.porcCruces = new JTextField();
		jlpocCruces.setBounds(5, 140, 80, 25); // x, y, width, height
		this.porcCruces.setBounds(90, 140, 140, 25); // x, y, width, height
		this.add(jlpocCruces);
		this.add(this.porcCruces);
		
		/* -- Text Field para la porcentaje de mutaciones  -- */
		JLabel jlMutacion = new JLabel("% Mutacion");
		this.porcMutacion = new JTextField();
		jlMutacion.setBounds(5, 170, 90, 25); // x, y, width, height
		this.porcMutacion.setBounds(90, 170, 140, 25); // x, y, width, height
		this.add(jlMutacion);
		this.add(this.porcMutacion);
		
		/* -- Text Field para la semilla  -- */
		JLabel jlSemilla = new JLabel("Semilla");
		this.semilla = new JTextField();
		jlSemilla.setBounds(5, 200, 90, 25); // x, y, width, height
		this.semilla.setBounds(90, 200, 140, 25); // x, y, width, height
		this.add(jlSemilla);
		this.add(this.semilla);
		
		/* -- Combo Box para los cruces -- */
		JLabel jlCruce = new JLabel("Cruce");
		this.cbCruce = new JComboBox<String>(cruces);
		this.cbCruce.setSelectedIndex(0);
		jlCruce.setHorizontalTextPosition(SwingConstants.LEFT);
		jlCruce.setBounds(5, 250, 70, 25); // x, y, width, height
		this.cbCruce.setBounds(90, 250, 140, 25);		
		this.add(jlCruce);
		this.add(this.cbCruce);
		
		/* -- Combo Box para las selecciones -- */
		JLabel jlSeleccion = new JLabel("Funcion");
		this.cbSeleccion = new JComboBox<String>(selecciones);
		this.cbSeleccion.setSelectedIndex(0);
		jlSeleccion.setHorizontalTextPosition(SwingConstants.LEFT);
		jlSeleccion.setBounds(5, 290, 70, 25); // x, y, width, height
		this.cbSeleccion.setBounds(90, 290, 140, 25);		
		this.add(jlSeleccion);
		this.add(this.cbSeleccion);
		
		/* -- Boton para lanzar una nueva copia -- */
		this.lanzarCopia = new JButton("Lanzar una copia");
		this.lanzarCopia.setBounds(18, 556, 210, 27); // x, y, width, height
		this.add(this.lanzarCopia);
		
		/* -- Boton para relanzar este AG (algoritmo genetico) -- */
		this.relanzarAG = new JButton("Relanzar este AG");
		this.relanzarAG.setBounds(18, 588, 210, 27); // x, y, width, height
		this.add(this.relanzarAG);
		
		/* -- Boton para eliminar este AG (algoritmo genetico) -- */
		this.eliminarAG = new JButton("Eliminar este AG");
		this.eliminarAG.setBounds(18, 620, 210, 27); // x, y, width, height
		this.add(this.eliminarAG);
		
		/* ########################### */
		

	}
	
	
}
