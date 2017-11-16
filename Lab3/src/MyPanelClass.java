    import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;
	 
	public class MyPanelClass extends JPanel {
	            public void paintComponent(Graphics g) {
	                        super.paintComponent(g);
	 
	                        //Compute interior coordinates
	                        Insets myInsets = this.getInsets();
	                        int x1 = myInsets.left;
	                        int y1 = myInsets.top;
	                        int x2 = getWidth() - myInsets.right - 1;
	                        int y2 = getHeight() - myInsets.bottom - 1;
	                        int width = x2 - x1;
	                        int height = y2 - y1;
	 
	                       
	                  
	                        
	                        // Paint the background
	                        g.setColor(Color.RED);
	                        g.fillRect(x1 + 1, y1+ 1, width , height );
	                        
	                        
                    	 
	                        g.setColor(Color.RED);
	                        g.fillRect(x1, y1, width, height);
	                        
	                        // Rectangles
	                        g.setColor(Color.WHITE);
		                    g.fillRect(x1 , y1 + 30  , width  , height - 120 );
		                    g.fillRect(x1, y1 + 100 ,width , height - 120);
		                  
	                        
	                        // Triangle   
	                        
	                        Polygon p = new Polygon();
	                        p.addPoint(x1 , y1 );
	                        p.addPoint(x1 + 140 , y1 + 75 );
	                        p.addPoint(x1 - 90, y1 +  200  );
	         	            g.setColor(Color.BLUE);
	                        g.fillPolygon(p);
	                        
	                   
	                      
	                       
	                    
	                       
	                      
	                        
	                        
	                        
	                        
	                       	 //Star                       
                    Polygon p2 = new Polygon();
	                        p2.addPoint(x1 + 25, y1 + 73);
	                        p2.addPoint(x1 + 41, y1 + 73);
	                        p2.addPoint(x1 + 47, y1 + 58);
	                        p2.addPoint(x1 + 53, y1 + 73);
	                        p2.addPoint(x1 + 69, y1 + 73);
	                        p2.addPoint(x1 + 56, y1 + 83);
	                        p2.addPoint(x1 + 61, y1 + 98);
	                        p2.addPoint(x1 + 47, y1 + 88);
	                        p2.addPoint(x1 + 34, y1 + 98);
	                        p2.addPoint(x1 + 38, y1 + 83);
	                        g.setColor(Color.WHITE);
	                        g.fillPolygon(p2);
	                        
	                        
	                      
	            }
	}	

