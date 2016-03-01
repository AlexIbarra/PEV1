package gui;


import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.math.plot.Plot2DPanel;
import controller.Controller;

public class PanelEste extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private Controller controller;
	
	
	public PanelEste(Controller cntrl) {
		
		this.controller = cntrl;
		this.setLayout(new BorderLayout());
		
		double[] x = {0,0,0,0};// = { 1, 2, 3, 4, 5, 6 ,7,8,9,10 };
		double[] y = {0,0,0,0};//= { 45, 89, 6, 32, 63, 12, 15,23,12,34 };
		// create your PlotPanel (you can use it as a JPanel)
		Plot2DPanel plot = new Plot2DPanel();
		
		plot.setPreferredSize(new Dimension(400, 400));
		// define the legend position
		plot.addLegend("SOUTH");
		// add a line plot to the PlotPanel
		plot.addLinePlot("my plot", x, y);
		// put the PlotPanel in a JFrame like a JPanel		
		this.add(plot, BorderLayout.CENTER);
	}

}
