package TicTacToeFinal;




	import TicTacToeFinal.GameBoard;
	import TicTacToeFinal.Block;
	import TicTacToeFinal.MainClass;
	import TicTacToeFinal.Contents;


	public abstract class Computerr {
		   protected int ROWS = MainClass.ROWS;  
		   protected int COLS = MainClass.COLS;  
		 
		   protected Block[][] blocks; // the game board's array of blocks (row-col)
		   protected Contents X;    // computer's chosen marking
		   protected Contents O;   // opponent's chosen marking
		   
		   public int countchild;
		 
		   //Constructor
		   public Computerr(GameBoard board) {

		   	blocks = board.blocks;
		   }
		 
		   //Allocating X to computer and O to human
		   public void setXO(Contents XO) {
		      this.X = XO;
		      O = (X == Contents.X) ? Contents.O : Contents.X;
		   }
		 
		   //defined in Alphabeta
		   public abstract int[] move();  
	}


