    import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Insets;
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
	 
	                        //Paint the background
	                        g.setColor(Color.RED);
	                        g.fillRect(x1, y1, width , height );
//	                        //Draw a border
//	                        g.setColor(Color.YELLOW);
//	                        g.drawRect(x1, y1, width, height);
//	                        
//	                        //Draw Second Inside Border
//	                        g.setColor(Color.BLUE);
//	                        g.drawRect(x1 + 2 , y1 + 2, width - 4, height -  4);
//	                        
	                        //Draw Lines
	                      //  g.setColor(Color.WHITE);
	                      //  g.drawLine(x1, y1, x2, y2);
	                        
	                       // g.setColor(Color.GREEN);
	                       // g.drawLine(x1 + 200 , y1, x2 - 200, y2);
	                        
	                        // Oval
	                        g.setColor(Color.LIGHT_GRAY);
	                        g.fillOval(x1 , y1 , 55, 55);	                        
	                     
	            }
	}	

