/**
 * This class takes two ArrayLists of x and y coordinates and calculates the area using the equation from 
 * http://www.mathopenref.com/coordpolygonarea.html
 */
import java.util.ArrayList;

public class OrthoPolygonCalculator {
  private ArrayList<Integer> xList;
	private ArrayList<Integer> yList;
	public OrthoPolygonCalculator(ArrayList<Integer> xList, ArrayList<Integer> yList){
		this.xList = xList;
		this.yList = yList;
	}
	
	public float calculation(){
		float sum = 0;
		for(int i = 0; i < this.xList.size()-1; i++){
			sum += this.xList.get(i) * this.yList.get(i+1) - this.xList.get(i+1) * this.yList.get(i);
		}
		
		return Math.abs(sum/2);
	}
}
