package tetris;

/**
 * @author Jeffrey
 *
 */
public class TetrisBoard {
	

	/**
		 * @author Jeffrey
		 *
		 */
	public class Node {

		/**
		 * 
		 */
		public Node() {
			// TODO Auto-generated constructor stub
		}

	}


	// VARIABLES
	private int width, height;
	private Node[][] grid;
	
	
	/**
	 * 
	 */
	public TetrisBoard() {
		// TODO Auto-generated constructor stub
		width = 10;
		height = 20;
		grid = new Node[height][width];
		
	}

}
