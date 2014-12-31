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

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;



public class Pie_Chart_KCSE_Subject_Analysis extends JFrame 
{

    String KCSE_2013_subject_pie_chart_title = null;
    
    public Pie_Chart_KCSE_Subject_Analysis(String title) 
    {
        super(title);
        KCSE_2013_subject_pie_chart_title = title + " - Grades Distribution";
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    private PieDataset create_KCSE_Subjects_Dataset(int[] array_subject_grades_distribution) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        if (((double)array_subject_grades_distribution[0]) != 0)
        {
            dataset.setValue("Grade A", new Double((double)array_subject_grades_distribution[0]));
        }
        if (((double)array_subject_grades_distribution[1]) != 0)
        {
            dataset.setValue("Grade A-", new Double((double)array_subject_grades_distribution[1]));
        }
        if (((double)array_subject_grades_distribution[2]) != 0)
        {
            dataset.setValue("Grade B+", new Double((double)array_subject_grades_distribution[2]));
        }
        if (((double)array_subject_grades_distribution[3]) != 0)
        {
            dataset.setValue("Grade B", new Double((double)array_subject_grades_distribution[3]));
        }
        if (((double)array_subject_grades_distribution[4]) != 0)
        {
            dataset.setValue("Grade B-", new Double((double)array_subject_grades_distribution[4]));
        }
        if (((double)array_subject_grades_distribution[5]) != 0)
        {
            dataset.setValue("Grade C+", new Double((double)array_subject_grades_distribution[5]));
        }
        if (((double)array_subject_grades_distribution[6]) != 0)
        {
            dataset.setValue("Grade C", new Double((double)array_subject_grades_distribution[6]));
        }
        if (((double)array_subject_grades_distribution[7]) != 0)
        {
            dataset.setValue("Grade C-", new Double((double)array_subject_grades_distribution[7]));
        }
        if (((double)array_subject_grades_distribution[8]) != 0)
        {
            dataset.setValue("Grade D+", new Double((double)array_subject_grades_distribution[8]));
        }
        if (((double)array_subject_grades_distribution[9]) != 0)
        {
            dataset.setValue("Grade D", new Double((double)array_subject_grades_distribution[9]));
        }
        if (((double)array_subject_grades_distribution[10]) != 0)
        {
            dataset.setValue("Grade D-", new Double((double)array_subject_grades_distribution[10]));
        }
        if (((double)array_subject_grades_distribution[11]) != 0)
        {
            dataset.setValue("Grade E", new Double((double)array_subject_grades_distribution[11]));
        }
        if (((double)array_subject_grades_distribution[12]) != 0)
        {
            dataset.setValue("Grade P", new Double((double)array_subject_grades_distribution[12]));
        }
        if (((double)array_subject_grades_distribution[13]) != 0)
        {
            dataset.setValue("Grade U", new Double((double)array_subject_grades_distribution[13]));
        }
        if (((double)array_subject_grades_distribution[14]) != 0)
        {
            dataset.setValue("Grade W", new Double((double)array_subject_grades_distribution[14]));
        }
        if (((double)array_subject_grades_distribution[15]) != 0)
        {
            dataset.setValue("Grade X", new Double((double)array_subject_grades_distribution[15]));
        }
        if (((double)array_subject_grades_distribution[16]) != 0)
        {
            dataset.setValue("Grade Y", new Double((double)array_subject_grades_distribution[16]));
        }
        if (((double)array_subject_grades_distribution[17]) != 0)
        {
            dataset.setValue("Grade Z", new Double((double)array_subject_grades_distribution[17]));
        }
        return dataset;        
    }
    
    
    
    
    public JFreeChart create_KCSE_Subjects_Pie_Chart(PieDataset dataset) 
    {
        JFreeChart KCSE_Subjects_Pie_Chart = ChartFactory.createPieChart3D(
            KCSE_2013_subject_pie_chart_title,  // chart title
            dataset,             // data
            true,               // include legend
            true,
            false
        );

        PiePlot3D plot = (PiePlot3D) KCSE_Subjects_Pie_Chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("No data available");
        plot.setForegroundAlpha(0.95f);
        plot.setCircular(true);
        plot.setLabelGap(0.02);
        return KCSE_Subjects_Pie_Chart;
        
    }
    
    public JPanel createDemoPanel(int[] array_subject_grades_distribution) 
    {
        JFreeChart chart_KCSE_Subjects = create_KCSE_Subjects_Pie_Chart(create_KCSE_Subjects_Dataset(array_subject_grades_distribution));
        return new ChartPanel(chart_KCSE_Subjects);
        
        
    }
    
    
    public void Get_Grades_Count_to_be_set_in_dataset(int[] array_subject_grades_distribution)
    {
      
      setContentPane(createDemoPanel(array_subject_grades_distribution));
    }
    
}
