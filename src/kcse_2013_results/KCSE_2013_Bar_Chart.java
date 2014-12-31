 /*************************************************************************
 *                                                                        *
 *                   Mureithi David Wachira	                          *
 *                                                                        *
 *                   Mobile: +254 (0) 722 413 699                         *
 *                   Email:  davidwachira90@gmail.com                     *
 *                   Website: davidwachira.com                            *
 *                                                                        *
 *                   Date:   Wednesday 30th April 2014                    *
 *                                                                        *
 *                   KCSE 2013 Results Application                        *
 *                                                                        *
 *************************************************************************/

package kcse_2013_results;
 /*************************************************************************
 *                                                                        *
 *                   The various imports: Libraries used in this file     *
 *                                                                        *
 *************************************************************************/

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class KCSE_2013_Bar_Chart extends JFrame {

   private static final long serialVersionUID = 1L;
   
   public KCSE_2013_Bar_Chart(String applicationTitle, String chartTitle, String array_dataset[][]) {
        super(applicationTitle);
        String [][]Array_for_dataset_createDataset = array_dataset;
        // based on the dataset we create the chart
        // ChartFactory.setChartTheme(StandardChartTheme.createDarknessTheme());
        //ChartFactory.setChartTheme(StandardChartTheme.createLegacyTheme());

        ChartFactory.setChartTheme(StandardChartTheme.createJFreeTheme());
        JFreeChart pieChart = ChartFactory.createBarChart3D(chartTitle, "Candidate", "Points", createDataset(Array_for_dataset_createDataset, chartTitle),PlotOrientation.VERTICAL, true, true, false);
        
        // get a reference to the plot for further customisation...
        final CategoryPlot plot = (CategoryPlot) pieChart.getCategoryPlot(); 
        
        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
                               renderer.setSeriesPaint   (0, Color.ORANGE);
                               renderer.setSeriesPaint   (1, Color.GRAY);
                               renderer.setDrawBarOutline(false); 

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
        
        // Adding chart into a chart panel
        ChartPanel chartPanel = new ChartPanel(pieChart);
      
        // setting default size
        // chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
      
        // add to contentPane
        setContentPane(chartPanel);

        final Dimension screenSize_Bar_chart = Toolkit.getDefaultToolkit().getScreenSize();
        final int width_Bar_chart = screenSize_Bar_chart.width;
        final int height_Bar_chart = screenSize_Bar_chart.height;

        try {
             ChartUtilities.saveChartAsPNG(new File("C:\\Users\\Wachira\\Desktop\\KCSE 2013 Bar Charts\\"+chartTitle+".png"), pieChart, width_Bar_chart,height_Bar_chart);
        } catch (IOException e) {
             System.err.println("Problem occurred creating chart.");
        }
    }
  
   private CategoryDataset createDataset(String Array_for_dataset_createDataset[][], String chartTitle) {
     
      // row keys...
      final String kcse_2013_candidate = chartTitle.substring(chartTitle.indexOf(" - "));
      // column keys...
      final String subject_1 = Array_for_dataset_createDataset[0][0];
      final String subject_2 = Array_for_dataset_createDataset[1][0];
      final String subject_3 = Array_for_dataset_createDataset[2][0];
      final String subject_4 = Array_for_dataset_createDataset[3][0];
      final String subject_5 = Array_for_dataset_createDataset[4][0];
      final String subject_6 = Array_for_dataset_createDataset[5][0];
      final String subject_7 = Array_for_dataset_createDataset[6][0];
      final String subject_8 = Array_for_dataset_createDataset[7][0];
      
      

      // create the dataset...
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        

        
      dataset.addValue(Find_Out_Points_From_Grade(Array_for_dataset_createDataset[0][1]), kcse_2013_candidate, subject_1);
      dataset.addValue(Find_Out_Points_From_Grade(Array_for_dataset_createDataset[1][1]), kcse_2013_candidate, subject_2);
      dataset.addValue(Find_Out_Points_From_Grade(Array_for_dataset_createDataset[2][1]), kcse_2013_candidate, subject_3);
      dataset.addValue(Find_Out_Points_From_Grade(Array_for_dataset_createDataset[3][1]), kcse_2013_candidate, subject_4);
      dataset.addValue(Find_Out_Points_From_Grade(Array_for_dataset_createDataset[4][1]), kcse_2013_candidate, subject_5);
      dataset.addValue(Find_Out_Points_From_Grade(Array_for_dataset_createDataset[5][1]), kcse_2013_candidate, subject_6);
      dataset.addValue(Find_Out_Points_From_Grade(Array_for_dataset_createDataset[6][1]), kcse_2013_candidate, subject_7);
      dataset.addValue(Find_Out_Points_From_Grade(Array_for_dataset_createDataset[7][1]), kcse_2013_candidate, subject_8);
      
      return dataset;
     
  }

   
   
   
   
    private int Find_Out_Points_From_Grade(String KNEC_grade_obtained) 
    { int KNEC_subject_points = 0;
      String subject_grade_obtained = KNEC_grade_obtained.replaceAll("\\s","");
      try 
      {
        switch (subject_grade_obtained) 
        {
            case "A":
                KNEC_subject_points = 12;
                break;
            case "A-":
                KNEC_subject_points = 11;
                break;
            case "B+":
                KNEC_subject_points = 10;
                break;
            case "B":
                KNEC_subject_points = 9;
                break;
            case "B-":
                KNEC_subject_points = 8;
                break;
            case "C+":
                KNEC_subject_points = 7;
                break;
            case "C":
                KNEC_subject_points = 6;
                break;
            case "C-":
                KNEC_subject_points = 5;
                break;
            case "D+":
                KNEC_subject_points = 4;
                break;
            case "D":
                KNEC_subject_points = 3;
                break;
            case "D-":
                KNEC_subject_points = 2;
                break;
            case "E":
                KNEC_subject_points = 1;
                break;
            default:
                KNEC_subject_points = 0;
                                
               
        }
      }  
      catch (Exception ex_Subject_Titles_From_Codes) 
       {  
           System.out.println("Error on finding subject name from code ---> " + ex_Subject_Titles_From_Codes); 
       }
      return KNEC_subject_points;
    }
}
