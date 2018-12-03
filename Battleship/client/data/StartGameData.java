// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package client.data;


import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import java.util.ArrayList;

/************************************************************/
/**
 * 
 */
public class StartGameData implements Serializable
{

	
	private byte[][] stateMatrix;
	private Ship[] ships;
	private static int TOTAL_SHIPS = 5;
	private static int LENGTHS[] = {2, 3, 3, 4, 5};
	private int row[];
	private int col[];
	
	//constructor that passes the data types
	public StartGameData(Rectangle2D square)
	{
		
		
		for(int i = 0; i < TOTAL_SHIPS; i++)
		{
			ships[i].setLength(LENGTHS[i]);
		}
		
		
		
	}
	
	
	
}
