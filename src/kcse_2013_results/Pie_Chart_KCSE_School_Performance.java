 /*************************************************************************
 *                                                                        *
 *                   Mureithi David Wachira	                          *
 *                                                                        *
 *                   Mobile: +254 (0) 722 413 699                         *
 *                   Email:  davidwachira90@students.uonbi.ac.ke          *
 *                   Website: davidwachira.com                            *
 *                                                                        *
 *                   Date:   Wednesday 30th April 2014                    *
 *                                                                        *
 *                   KCSE 2013 Results Application                        *
 *                                                                        *
 *************************************************************************/
package kcse_2013_results;

/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2005, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU Lesser General Public License as published by 
 * the Free Software Foundation; either version 2.1 of the License, or 
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public 
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License 
 * along with this library; if not, write to the Free Software Foundation, 
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc. 
 * in the United States and other countries.]
 *
 * ------------------
 * PieChartDemo1.java
 * ------------------
 * (C) Copyright 2003-2005, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   ;
 *
 * $Id: PieChartDemo1.java,v 1.2 2005/03/28 19:38:45 mungady Exp $
 *
 * Changes
 * -------
 * 09-Mar-2005 : Version 1, copied from the demo collection that ships with
 *               the JFreeChart Developer Guide (DG);
 *
 */


import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.Timer;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 * A simple demonstration application showing how to create a pie chart using 
 * data from a {@link DefaultPieDataset}.
 */
public class Pie_Chart_KCSE_School_Performance extends JFrame {
    
    /**
     * Default constructor.
     *
     * @param title  the frame title.
     */
    public Pie_Chart_KCSE_School_Performance(String title) {
        super(title);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    /**
     * Creates a sample dataset.
     * 
     * @return A sample dataset.
     */
    private PieDataset createDataset(int[] array_school_grades_count) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        if (((double)array_school_grades_count[0]) != 0)
        {
            dataset.setValue("Grade A", new Double((double)array_school_grades_count[0]));
        }
        if (((double)array_school_grades_count[1]) != 0)
        {
            dataset.setValue("Grade A-", new Double((double)array_school_grades_count[1]));
        }
        if (((double)array_school_grades_count[2]) != 0)
        {
            dataset.setValue("Grade B+", new Double((double)array_school_grades_count[2]));
        }
        if (((double)array_school_grades_count[3]) != 0)
        {
            dataset.setValue("Grade B", new Double((double)array_school_grades_count[3]));
        }
        if (((double)array_school_grades_count[4]) != 0)
        {
            dataset.setValue("Grade B-", new Double((double)array_school_grades_count[4]));
        }
        if (((double)array_school_grades_count[5]) != 0)
        {
            dataset.setValue("Grade C+", new Double((double)array_school_grades_count[5]));
        }
        if (((double)array_school_grades_count[6]) != 0)
        {
            dataset.setValue("Grade C", new Double((double)array_school_grades_count[6]));
        }
        if (((double)array_school_grades_count[7]) != 0)
        {
            dataset.setValue("Grade C-", new Double((double)array_school_grades_count[7]));
        }
        if (((double)array_school_grades_count[8]) != 0)
        {
            dataset.setValue("Grade D+", new Double((double)array_school_grades_count[8]));
        }
        if (((double)array_school_grades_count[9]) != 0)
        {
            dataset.setValue("Grade D", new Double((double)array_school_grades_count[9]));
        }
        if (((double)array_school_grades_count[10]) != 0)
        {
            dataset.setValue("Grade D-", new Double((double)array_school_grades_count[10]));
        }
        if (((double)array_school_grades_count[11]) != 0)
        {
            dataset.setValue("Grade E", new Double((double)array_school_grades_count[11]));
        }
        if (((double)array_school_grades_count[12]) != 0)
        {
            dataset.setValue(" *** ", new Double((double)array_school_grades_count[12]));
        }
        
        return dataset;        
    }
    
    /**
     * Creates a chart.
     * 
     * @param dataset  the dataset.
     * 
     * @return A chart.
     */
    public JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart3D(
            "KCSE 2013 Results Summary ",  // chart title
            dataset,             // data
            true,               // include legend
            true,
            false
        );

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("No data available");
        plot.setForegroundAlpha(0.95f);
        plot.setCircular(true);
        plot.setLabelGap(0.02);
        return chart;
        
    }
    
    /**
     * Creates a panel for the demo (used by SuperDemo.java).
     * 
     * @return A panel.
     */
    public JPanel createDemoPanel(int[] array_school_grades_count) {
        JFreeChart chart = createChart(createDataset(array_school_grades_count));
        return new ChartPanel(chart);
        
        
    }
    
    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
/*    public static void main(String[] args) {

        Pie_Chart_KCSE_School_Performance demo = new Pie_Chart_KCSE_School_Performance("Pie Chart Demo 1");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }
*/
    public void Get_Grades_Count_to_be_set_in_dataset(int[] array_school_grades_count)
    {
      
      setContentPane(createDemoPanel(array_school_grades_count));
    }
}