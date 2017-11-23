// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Model;

import Model.IMission;
import java.util.List;

// Manual imports
import java.awt.Point;
// End of manual imports

/************************************************************/
/**
 * 
 */
public class Strategy {
	/**
	 * 
	 * @param mission 
	 * @return 
	 */
	public List<Point> getStrategy(IMission mission) {
		List<Point> strategy = calculateStrategy(mission);
		//returns the order of the list because now it will get the right list
		return strategy; 
	}

	/**
	 * 
	 * @param mission 
	 * @return 
	 */
	private List<Point> calculateStrategy(IMission mission) {
		return mission.getPoints();
		
	}
};
