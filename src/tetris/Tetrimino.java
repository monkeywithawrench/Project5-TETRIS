package tetris;
import javafx.scene.paint.Color;

/**
 * @author Jeffrey
 *
 */
public abstract class Tetrimino {

	

	Color color;
	//int centerX, centerY;
	int Orientation;
	Node[] nodes;
	int size; // This is the edge size of the bounding square for the tetrimino. Options are 2, 3, and 4 ONLY.
	
	
	/**
	 * 
	 */
	public Tetrimino() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @author Jeffrey
	 *
	 */
	public class IBlock extends Tetrimino {

		/**
		 * 
		 */
		public IBlock() {
			// TODO Auto-generated constructor stub
			this.color = Color.CYAN;
			
		}

	}

	
	/**
	 * @author Jeffrey
	 *
	 */
	public class OBlock extends Tetrimino {

		/**
		 * 
		 */
		public OBlock() {
			// TODO Auto-generated constructor stub
			this.color = Color.YELLOW;
		}

	}

	
	/**
	 * @author Jeffrey
	 *
	 */
	public class TBlock extends Tetrimino {

		/**
		 * 
		 */
		public TBlock() {
			// TODO Auto-generated constructor stub
			this.color = Color.PURPLE;
		}

	}
	
	
	/**
	 * @author Jeffrey
	 *
	 */
	public class JBlock extends Tetrimino {

		/**
		 * 
		 */
		public JBlock() {
			// TODO Auto-generated constructor stub
			this.color = Color.BLUE;
		}

	}
	
	
	/**
	 * @author Jeffrey
	 *
	 */
	public class LBlock extends Tetrimino {

		/**
		 * 
		 */
		public LBlock() {
			// TODO Auto-generated constructor stub
			this.color = Color.ORANGE;
		}

	}

	
	/**
	 * @author Jeffrey
	 *
	 */
	public class SBlock extends Tetrimino {

		/**
		 * 
		 */
		public SBlock() {
			// TODO Auto-generated constructor stub
			this.color = Color.LIME;
		}

	}


	/**
	 * @author Jeffrey
	 *
	 */
	public class ZBlock extends Tetrimino {

		/**
		 * 
		 */
		public ZBlock() {
			// TODO Auto-generated constructor stub
			this.color = Color.RED;
		}

	}


}