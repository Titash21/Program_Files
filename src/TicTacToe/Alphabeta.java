package TicTacToeFinal;

import java.util.Timer;
import java.util.ArrayList;


import java.util.List;




//Alphabeta logic class
public class Alphabeta extends Computerr {
 
//constructor
   public Alphabeta(GameBoard board) {
      super(board);
   }
 
   
   @Override
   public int[] move() {
      int alpha = - 1000;
	int beta = + 1000 ;
	int[] result = minimax(2, X, alpha, beta);
         // depth, max/computer's marking/turn, alpha, beta
      return new int[] {result[1], result[2]};   // row, col
   }
 
  //recursive minimax function to compute max and to select the row and col
   private int[] minimax(int depth, Contents player, int alpha, int beta) {
      
	   //List of Possible moves for next move
      List<int[]> nextMoves = generateMoves();
 
     
     
      int currentScore;
      int bestRow = -1;
      int bestCol = -1;
 
      if (nextMoves.isEmpty() || depth == 0) { // reached root
          countchild++;
        
          currentScore = evaluate();
          return new int[] {currentScore, bestRow, bestCol};
      } else {
         for (int[] move : nextMoves) {
             countchild++;
       
            blocks[move[0]][move[1]].EXO = player;
            if (player == X) {  
               currentScore = minimax(depth - 1, O, alpha, beta)[0];
               if (currentScore > alpha) {
                  alpha = currentScore;
                  bestRow = move[0];
                  bestCol = move[1];
               }
            } else {  
               currentScore = minimax(depth - 1, X, alpha, beta)[0];
               if (currentScore < beta) {
                  beta = currentScore;
                  bestRow = move[0];
                  bestCol = move[1];
               }
            }
            // Undo move
            blocks[move[0]][move[1]].EXO = Contents.E;
            
            // alpha beta condition for pruning
            if (alpha >= beta) {
                System.out.println("alpha>=beta");
                break;
            }
         }
      }
  
      return new int[] {(player == X) ? alpha : beta, bestRow, bestCol};
   }
 
     private List<int[]> generateMoves() {
      List<int[]> nextMoves = new ArrayList<int[]>(); // allocate List
 
      
      if (hasWon(X) || hasWon(O)) {
         return nextMoves;   
      }
 
      // updating nextMoves with all the available empty blocks
      for (int row = 0; row < ROWS; ++row) {
         for (int col = 0; col < COLS; ++col) {
            if (blocks[row][col].EXO == Contents.E) {
               nextMoves.add(new int[] {row, col});
            }
         }
      }
      return nextMoves;
   }
 
   
   
   
	   private int evaluate(){
    	int score = 0;
   
      /**adds the individual 10 "value" to give "score" . i.e.
      * score = 6*(cthree - hthree) + 3*(ctwo - htwo) + 1*(cone - hone)
      * value = +1000 for 4 X in a row/col/diag
      * value = -1000 for 0 X in a row/col/diag
      * 
      * NOTE : score is the computer's score/evaluation function value
      * 
      */
      score += evalinstance(0, 0, 0, 1, 0, 2, 0, 3);  // row 0 / horizontals
      score += evalinstance(1, 0, 1, 1, 1, 2, 1, 3);  // row 1
      score += evalinstance(2, 0, 2, 1, 2, 2, 2, 3);  // row 2
      score += evalinstance(3, 0, 3, 1, 3, 2, 3, 3);  // row 3
      score += evalinstance(0, 0, 1, 0, 2, 0, 3, 0);  // column 0 / verticals
      score += evalinstance(0, 1, 1, 1, 2, 1, 3, 1);  // column 1
      score += evalinstance(0, 2, 1, 2, 2, 2, 3, 2);  // column 2
      score += evalinstance(0, 3, 1, 3, 2, 3, 3, 3);  // column 3
      score += evalinstance(0, 0, 1, 1, 2, 2, 3, 3);  // diagonal
      score += evalinstance(0, 3, 1, 2, 2, 1, 3, 0 );  // opposite diagonal
      return score;
   }
   
 
  /** evaluates the "value" i.e. 
   * value = 3*(ctwo - htwo) for 2 X in a row/col/diag 
   * value = (cone - hone) for 1 X in a row/col/diag
   * value = 6*(cthree-hthree) for 3 X in a row/col/diag
   */
   private int evalinstance(int row1, int col1, int row2, int col2, int row3, int col3, int row4, int col4) {
      int value = 0;
      int cone = 0;
      int hone = 0;
      int ctwo = 0;
      int htwo = 0;
      int cthree = 0;
      int hthree = 0;
      int cfour = 0;
      int hfour = 0;
      
      //checking one block
   if (blocks[row1][col1].EXO == X) {
         cone = cone + 1;
      } else if (blocks[row1][col1].EXO == O) {
           hone = hone + 1;
      }
 
      //checking upto two blocks
     if (blocks[row2][col2].EXO == X) {
         if (blocks[row1][col1].EXO == X) {   
            ctwo += 1;
            cone -= 1;
         } else if (blocks[row1][col1].EXO == O) {  
             ctwo = ctwo;
         } }
      
         
      	else if (blocks[row2][col2].EXO == O) {
         if (blocks[row1][col1].EXO == O) { 
            htwo += 1;
            hone -= 1;
           
         } else if (blocks[row1][col1].EXO == X) { 
            htwo = htwo;
         } 
      }
 
      //checking upto 3 blocks
       if (blocks[row3][col3].EXO == X) {
         if (blocks[row2][col2].EXO == X) {
        	 if (blocks[row1][col1].EXO == X){
        		 cthree += 1;
        		 ctwo -= 1;
         } else if (blocks[row1][col1].EXO == O) {  
            
            ctwo += 1;
            cone -= 1;
           
         } }
         else if (blocks[row2][col2].EXO == O){
        	 if(blocks[row1][col1].EXO == X){
        		 ctwo += 1;
        		 cone -= 1;
        	 }
        	 else if(blocks[row1][col1].EXO == O){
        		 cone += 1;
        		
        		 
        	 }
        	 
         }
         else if(blocks[row3][col3].EXO == O) {
             if (blocks[row2][col2].EXO == X) {
            	 if (blocks[row1][col1].EXO == X){
            		 hone += 1;
            		 
             } else if (blocks[row1][col1].EXO == O) {  
                htwo += 1;
                hone -= 1;
               
               
             } }
             else if (blocks[row2][col2].EXO == O){
            	 if(blocks[row1][col1].EXO == X){
            		 
            	
            		 htwo += 1;
            		 hone -= 1;
            	 }
            	 else if(blocks[row1][col1].EXO == O){
            		 hthree += 1;
            		 htwo -= 1;
            		 
            	 }
            	 
             }
        
     
   //checking upto 4 block
         if(blocks[row4][col4].EXO == X){
             if (blocks[row3][col3].EXO == X) {
                 if (blocks[row2][col2].EXO == X) {
                	 if (blocks[row1][col1].EXO == X){
                		 
                		 cfour += 1;
                		 cthree -= 1;
                 } else if (blocks[row1][col1].EXO == O) {  
                    
                    cthree += 1;
                    ctwo -= 1;
                   
                 } }
                 else if (blocks[row2][col2].EXO == O){
                	 if(blocks[row1][col1].EXO == X){
                		 cthree += 1;
                		 ctwo -= 1;
                	 }
                	 else if(blocks[row1][col1].EXO == O){
                		 ctwo += 1;
                		 cone -= 1;
                		
                		 
                	 }
                	 
                 }
                 else if(blocks[row3][col3].EXO == O) {
                     if (blocks[row2][col2].EXO == X) {
                    	 if (blocks[row1][col1].EXO == X){
                    		 cthree += 1;
                    		 ctwo -= 1;
                    		 
                     } else if (blocks[row1][col1].EXO == O) {  
                        ctwo += 1;
                        cone -= 1;
                       
                       
                     } }
                     else if (blocks[row2][col2].EXO == O){
                    	 if(blocks[row1][col1].EXO == X){
                    		 
                    	
                    		 ctwo += 1;
                    		 cone -= 1;
                    	 }
                    	 else if(blocks[row1][col1].EXO == O){
                    		 cone += 1;
                    		 
                    	 }
                    	 
                     }
                 }
                 else if(blocks[row4][col4].EXO == O){
                     if (blocks[row3][col3].EXO == X) {
                         if (blocks[row2][col2].EXO == X) {
                        	 if (blocks[row1][col1].EXO == X){
                        		 hone += 1;
                         } else if (blocks[row1][col1].EXO == O) {  
                            
                            htwo += 1;
                            hone -= 1;
                           
                         } }
                         else if (blocks[row2][col2].EXO == O){
                        	 if(blocks[row1][col1].EXO == X){
                        		 htwo += 1;
                        		 hone -= 1;
                        	 }
                        	 else if(blocks[row1][col1].EXO == O){
                        		 hthree += 1;
                        		 htwo -= 1;
                        		
                        		 
                        	 }
                        	 
                         }
                         else if(blocks[row3][col3].EXO == O) {
                             if (blocks[row2][col2].EXO == X) {
                            	 if (blocks[row1][col1].EXO == X){
                            		 htwo += 1;
                            		 hone -= 1;
                            		 
                             } else if (blocks[row1][col1].EXO == O) {  
                                hthree += 1;
                            	 htwo -= 1;
                               
                               
                               
                             } }
                             else if (blocks[row2][col2].EXO == O){
                            	 if(blocks[row1][col1].EXO == X){
                            		 
                            	
                            		 hthree += 1;
                            		 htwo -= 1;
                            	 }
                            	 else if(blocks[row1][col1].EXO == O){
                            		 hfour += 1; 
                            		 hthree -= 1;
                            		 
                            		 
                            	 }
                            	 
                             }
              
                     
                         }
                     }
                 }
             }
        }
       
        if(cfour == 1){
        	value = +1000;
        }
        if(hfour == 1){
        	value = -1000;
        }
        else{
        	if(cthree == 1 && hone == 1){
        		value = 6*(cthree - hthree);
        	}
        	if(ctwo==1 && htwo==1){
        		value = 3*(ctwo - htwo);
        	}
        	if(cone == 1 && hthree == 1){
        		value = cone - hone;
        	}
        	else{
        		break;
        	}
        
        }
        
        
        
        return value;      
               
}
    
   // Matches the output pattern with these patterns to detect win     
   private int[] winningPatterns = {
         0b1111000000000000, 0b0000111100000000, 0b0000000011110000, 0b0000000000001111, 
         0b1000100010001000, 0b0100010001000100, 0b0010001000100010, 0b0001000100010001, 
         0b1000010000100001, 0b0001001001001000               
   };
 
   // Returns boolean value 'true' for computer win
   private boolean hasWon(Contents thePlayer) {
      int pattern = 0b0000000000000000;  // 16-bit pattern for the 16 blocks
      for (int row = 0; row < ROWS; ++row) {
         for (int col = 0; col < COLS; ++col) {
            if (blocks[row][col].EXO == thePlayer) {
               pattern |= (1 << (row * COLS + col));
            }
         }
      }
      for (int winningPattern : winningPatterns) {
         if ((pattern & winningPattern) == winningPattern) 
        	 return true;
        
        	 
      }
      return false;
   }
}



