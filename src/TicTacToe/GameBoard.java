package TicTacToeFinal;

import java.awt.Color;
import java.awt.Graphics;

// the game board class for making the tictactoe board 
public class GameBoard {

	
	public Block[][] blocks; 
	
	   //constructor
	   public GameBoard() {
	      blocks = new Block[MainClass.ROWS][MainClass.COLS]; 
	      for (int row = 0; row < MainClass.ROWS; ++row) {
	         for (int col = 0; col < MainClass.COLS; ++col) {
	            blocks[row][col] = new Block(row, col); 
	         }
	      }
	   }

	 
 // Refreshes/re-set the game board 
public void refresh() {
    for (int row = 0; row < MainClass.ROWS; ++row) {
       for (int col = 0; col < MainClass.COLS; ++col) {
          blocks[row][col].erase(); 
       }
    }
 }

public boolean isadraw() {
    for (int row = 0; row < MainClass.ROWS; ++row) {
       for (int col = 0; col < MainClass.COLS; ++col) {
          if (blocks[row][col].EXO == Contents.E) {
             return false; 
          }
       }
    }
    return true; 
 }


public boolean hasWon(Contents XO, int XORow, int XOCol) {
    return (blocks[XORow][0].EXO == XO   
               && blocks[XORow][1].EXO == XO
               && blocks[XORow][2].EXO == XO
           || blocks[0][XOCol].EXO == XO 
               && blocks[1][XOCol].EXO == XO
               && blocks[2][XOCol].EXO == XO
           || XORow == XOCol              
               && blocks[0][0].EXO == XO
               && blocks[1][1].EXO == XO
               && blocks[2][2].EXO == XO
           || XORow + XOCol == 2          
               && blocks[0][2].EXO == XO
               && blocks[1][1].EXO == XO
               && blocks[2][0].EXO == XO);
 }


public void draw(Graphics drawg) {
    // Draw lines (tictactoe block dividers)
    drawg.setColor(Color.RED);
    for (int row = 1; row < MainClass.ROWS; ++row) {
       drawg.fillRoundRect(0, MainClass.blockdimensions * row - MainClass.halfgrid,
             MainClass.totalCwidth - 1, MainClass.gridw,
             MainClass.gridw, MainClass.gridw);
    }
    for (int col = 1; col < MainClass.COLS; ++col) {
       drawg.fillRoundRect(MainClass.blockdimensions * col - MainClass.halfgrid, 0,
    		   MainClass.gridw, MainClass.totalCheight - 1,
    		   MainClass.gridw, MainClass.gridw);
    }

    //Drawing each block
    for (int row = 0; row < MainClass.ROWS; ++row) {
       for (int col = 0; col < MainClass.COLS; ++col) {
          blocks[row][col].drawing(drawg);  
       }
    }
 }
}