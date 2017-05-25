package TicTacToeFinal;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


   
// block property of the tictactoe board 
public class Block {

	
	   public Contents EXO; //instance of Contents
	   int row, col; 
	 
	   //Constructor
	   public Block(int row, int col) {
	      this.row = row;
	      this.col = col;
	      erase(); // clear content
	   }
	 
	   /** Clear this cell's content to EMPTY */
	   public void erase() {
	      EXO = Contents.E;
	   }
	      
//GUI
public void drawing(Graphics drawg) {
    // Use Graphics2D which allows us to set the pen's stroke
    Graphics2D draw2g = (Graphics2D)drawg;
    draw2g.setStroke(new BasicStroke(MainClass.textstrokew,
          BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND)); 
    
    int x1 = col * MainClass.blockdimensions + MainClass.blockpadding;
    int y1 = row * MainClass.blockdimensions + MainClass.blockpadding;
    if (EXO == Contents.X) {
       draw2g.setColor(Color.RED);
       int x2 = (col + 1) * MainClass.blockdimensions - MainClass.blockpadding;
       int y2 = (row + 1) * MainClass.blockdimensions - MainClass.blockpadding;
       draw2g.drawLine(x1, y1, x2, y2);
       draw2g.drawLine(x2, y1, x1, y2);
    } else if (EXO == Contents.O) {
       draw2g.setColor(Color.BLUE);
       draw2g.drawOval(x1, y1, MainClass.textdimensions, MainClass.textdimensions);
    }
 }
}
