/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kcse_2013_results;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChartExample {
 public static void main(String[] args) {
 // Create a simple Bar chart
 DefaultCategoryDataset dataset = new DefaultCategoryDataset();
  dataset.setValue(6, "Profit", "Jane");
  dataset.setValue(7, "Profit", "Tom");
  dataset.setValue(8, "Profit", "Jill");
  dataset.setValue(5, "Profit", "John");
  dataset.setValue(12, "Profit", "Fred");
JFreeChart chart = ChartFactory.createBarChart("Comparison between Salesman",
  "Salesman", "Profit", dataset, PlotOrientation.VERTICAL,
   false, true, false);

        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        final int width = screenSize.width;
        final int height = screenSize.height;
try {
     ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\Wachira\\Desktop\\chart.jpg"), chart, width,height);
} catch (IOException e) {
     System.err.println("Problem occurred creating chart.");
}}}