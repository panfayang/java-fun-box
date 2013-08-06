import java.util.ArrayList;
import java.lang.Integer;
/**
 * This class parses the directions into two ArrayLists of x and y coordinates.
 * @author fayang.pan
 */
public class DirectionParser {
  private int tempX;
	private int tempY;
	private ArrayList<Integer> xList;
	private ArrayList<Integer> yList;
	
	public DirectionParser(){
		this.tempX = 0;
		this.tempY = 0;
		this.xList = new ArrayList<Integer>();
		this.yList = new ArrayList<Integer>();
		this.xList.add(this.tempX);
		this.yList.add(this.tempY);
	}
	
	public void singleParser(String single){
//		System.out.println(single);
		assert single.matches("^([NWESnwes]{1})([0-9]+)$"): String.format("This location doesn't match the standard notation of direction-number %s",single);
		if (single.charAt(0)=='E'){
			this.tempX += Integer.valueOf(single.substring(1));
		}
		if (single.charAt(0)=='W'){
			this.tempX += Integer.valueOf(single.substring(1))*(-1);
		}
		if (single.charAt(0)=='N'){
			this.tempY += Integer.valueOf(single.substring(1));
		}
		if (single.charAt(0)=='S'){
			this.tempY += Integer.valueOf(single.substring(1))*(-1);
		}
		this.xList.add(this.tempX);
		this.yList.add(this.tempY);
	}
	
	public void parse_all(String all){
//		System.out.println(all.split(" ").toString());
		for (String i: all.split(" ")){
			singleParser(i);
		}
	}
	
	public ArrayList<Integer> getXList(){
		return this.xList;
	}
	
	public ArrayList<Integer> getYList(){
		return this.yList;
	}
	
	public void run(String all){
		this.parse_all(all);
		System.out.println(this.getXList());
		System.out.println(this.getYList());
	}

}
