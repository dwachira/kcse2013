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
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Watermark_an_Image 
{
  
    
    
    
public Watermark_an_Image ()
{
    
}

public void addTextWatermark(String text, File sourceImageFile, File destImageFile) 
{ 

	try 
	{ 
	  BufferedImage sourceImage = ImageIO.read(sourceImageFile); 
	  Graphics2D g2d = (Graphics2D) sourceImage.getGraphics(); 
	  // initializes necessary graphic properties 
	  AlphaComposite alphaChannel = AlphaComposite.getInstance( AlphaComposite.SRC_OVER, 0.3f); 
	  g2d.setComposite(alphaChannel); 
	  g2d.setColor(Color.DARK_GRAY); 
	  g2d.setFont(new Font("Arial", Font.BOLD, 64)); 
	  FontMetrics fontMetrics = g2d.getFontMetrics(); 
	  Rectangle2D rect = fontMetrics.getStringBounds(text, g2d); 
	  // calculates the coordinate where the String is painted 
	  int centerX = (sourceImage.getWidth() - (int) rect.getWidth()) / 2; 
	  int centerY = sourceImage.getHeight() / 2; 
	  // paints the textual watermark 
	  g2d.drawString(text, centerX, centerY); 
	  ImageIO.write(sourceImage, "png", destImageFile); 
	  g2d.dispose(); 
	  //System.out.println("The text watermark is added to the image."); 
          
          Delete_File file_deletion = new Delete_File ();
          file_deletion.Delete_File(sourceImageFile);
	  } 
	  
	  catch (IOException ex) 
	  { 
	     System.err.println(ex); 
	  }
	  
}
}
