/**
 * The original question is from coding session 6/30/13-7/6/13, as follows:
 * Given an orthogonal polygon, calculate the area, and print it on screen. 
 * You will be given input as pairs of direction and length.
 * Input will be provided in the form, direction indicator NEWS, followed by the distance indicator 1-99.
 * SampleInput=>N5 E5 S5 W5.
 * Output=>25
 * Reason => This is a square of side 5, area is 25.
 * Input =>N10 E2 S8 E8 S2 W10
 * Output =>36
 * Reason=> Depicts L shape. This can be computed as Vertical Rectangle = 2x8, HorizontalRectangle = 2x8 and common square = 2x2.
 */

/**
 * Main method.
 * @author fayang.pan
 * Received hints from SDEGuru from sdeskills forum, and http://www.mathopenref.com/coordpolygonarea.html.
 */
public class Area_Calculator_Main {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "N5 E5 S5 W5";
		String input2 = "N10 E2 S8 E8 S2 W10";
		String input3 = "N10 E2 S8 E8 S2 Wp10 W10f";
		DirectionParser dirpar = new DirectionParser();
		dirpar.run(input2);
		OrthoPolygonCalculator calc = new OrthoPolygonCalculator(dirpar.getXList(), dirpar.getYList());
		System.out.println(calc.calculation());
		
	}

}
