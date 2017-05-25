package TicTacToeFinal;






import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import TicTacToeFinal.Alphabeta;
import TicTacToeFinal.Computerr;
/*** ignores serialVersionUID problem*/
@SuppressWarnings("serial")
public class MainClass extends JPanel {


		   
		   public static final int ROWS = 4;  
		   public static final int COLS = 4;
		   public static final String NAME = "TicTacToe";
		 
		   // Name-constants for the various dimensions used for graphics drawing
		   public static final int blockdimensions = 80; // block's dimensions
		   public static final int totalCwidth = blockdimensions * COLS;  // canvas dimensions
		   public static final int totalCheight = blockdimensions * ROWS;
		   public static final int gridw = 6;  // Grid-line's width
		   public static final int halfgrid = gridw/ 2; // Grid-line's half-width
		   
		   public static final int blockpadding = blockdimensions / 3;
		   public static final int textdimensions = blockdimensions - blockpadding * 2;
		   public static final int textstrokew = 6; 
		 
		   private GameBoard board = new GameBoard();  // the game board
		   private State cur_state; //  current state of the game
		   private Contents cur_player;     //  current player
		   private JLabel statusBar; 
		   //private JLabel Textbox;// for displaying status message
		 
		   private Computerr compplayer = new Alphabeta(board);
		   
		   /** Constructor to setup the UI and game components */
		   public MainClass() {
		
		      this.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseClicked(MouseEvent ev) {  // mouseclick event handler
		            int X = ev.getX();
		            int Y = ev.getY();
		            int rowSelected = Y / blockdimensions;
		            int colSelected = X / blockdimensions;
		 
		            if (cur_state == State.ON) {
		               if (rowSelected >= 0 && rowSelected < ROWS
		                     && colSelected >= 0 && colSelected < COLS
		                     && board.blocks[rowSelected][colSelected].EXO == Contents.E) {
		                  board.blocks[rowSelected][colSelected].EXO = cur_player; // move
		                  updateGame(cur_player, rowSelected, colSelected); // update currentState
		                  // Switch player
		                  cur_player = (cur_player == Contents.X) ? Contents.O : Contents.X;
		               }
		            }
		               	if (cur_state == State.ON) {
		               		int[] computerMove = compplayer.move();
		               		System.out.println("nodes generated=" + compplayer.countchild);
		               		rowSelected = computerMove[0];
		               		colSelected = computerMove[1];
		               		board.blocks[rowSelected][colSelected].EXO = cur_player;
		               		updateGame(cur_player, rowSelected, colSelected);
		               		
		               		cur_player = (cur_player == Contents.X) ? Contents.O : Contents.X;
		               	}
	               
		            
		            else {        
		               initialize();  // restart the game
		            }
		            // Refresh the drawing canvas
		            repaint();  
		         }
		      });
		 
		     
		      statusBar = new JLabel("         ");
		      statusBar.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 12));
		      statusBar.setBorder(BorderFactory.createEmptyBorder(2, 5, 4, 5));
		      statusBar.setOpaque(true);
		      statusBar.setBackground(Color.PINK);
		 
		      setLayout(new BorderLayout());
		      add(statusBar, BorderLayout.SOUTH); // same as SOUTH
		      setPreferredSize(new Dimension(totalCwidth, totalCheight + 20));
		          
		 
		         
		      initialize();  // Initialize the game variables
		   }
		 
		   /** Initialize the game-board contents and the current-state */
		   public void initialize() {
		      for (int row = 0; row < ROWS; ++row) {
		         for (int col = 0; col < COLS; ++col) {
		            board.blocks[row][col].EXO = Contents.E; // all cells empty
		         }
		      }
		      cur_state = State.ON;  // initializing game state at start
		      cur_player = Contents.O; // human plays first
		      compplayer.setXO(Contents.X);        
		   }
		 
		   //block update - game board updating
		   public void updateGame(Contents XO, int row, int col) {
		      if (board.hasWon(XO, row, col)) {  // checking if win
		         cur_state = (XO == Contents.X) ? State.COMPWON : State.HUMANWON;
		      } else if (board.isadraw()) {  //chechking draw
		         cur_state = State.DRAW;
		      }
		     
		   }
		 
		   
		   @Override
		   public void paintComponent(Graphics drawg) {  
		      super.paintComponent(drawg);    // fill background
		      setBackground(Color.YELLOW); // set its background color
		 
		      board.draw(drawg);  // calling draw function to paint the board
		 
		      // Printing the status-bar 
		      if (cur_state == State.ON) {
		         statusBar.setForeground(Color.BLACK);
		         if (cur_player == Contents.X) {
		            statusBar.setText("X's Turn - computer");
		         } else {
		            statusBar.setText("O's Turn - human");
		         }
		      } else if (cur_state == State.DRAW) {
		         statusBar.setForeground(Color.RED);
		         statusBar.setText("DRAW. Click to play");
		      } else if (cur_state == State.COMPWON) {
		         statusBar.setForeground(Color.RED);
		         statusBar.setText("X wins. Click to play");
		      } else if (cur_state == State.HUMANWON) {
		         statusBar.setForeground(Color.RED);
		         statusBar.setText("O Wins. Click to play");
		      }
		   }
		 
		   public void computerthink(){
			   
		   }
		   
		   //main 
		   public static void main(String[] args) {
		      
		      javax.swing.SwingUtilities.invokeLater(new Runnable() {
		     // new java.util.Timer.schedule(new TimerTask(){
		    		   @Override
		         public void run() {
		            JFrame frame = new JFrame(NAME);
		            
		            frame.setContentPane(new MainClass());
		            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		            frame.pack();
		            frame.setLocationRelativeTo(null); 
		            frame.setVisible(true);            
		         }
		    	  }); 
		    	 
		   }
		}		   
		   
