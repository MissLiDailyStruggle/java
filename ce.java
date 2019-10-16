
import java.util.ArrayList;
import java.util.Collections;

public class ce implements Comparable<ce> {
	
    public int x;
    public int y;
    public ce(int x,int y)
    {
    	this.x = x;
    	this.y = y;
    }
    
    public int compareTo(ce point)
    {
    	int s1 = x*x + y*y;
    	int s2 = point.x*point.x + point.y*point.y;
		return s1-s2;
    }
    
    public String toString()
    {
    	return "[" + x  + "," + y + "]";
    }
    
    
	public static void main(String[] args) 
	{
		if(new ce(3,4).compareTo(new ce(1,1)) > 0)
			System.out.println("true");
		ArrayList<ce> points = new ArrayList<ce>();
		points.add(new ce(1,6));
		points.add(new ce(3,4));
		points.add(new ce(5,2));
		System.out.println(points);
		Collections.sort(points);
		System.out.println("排序后的情况：");
		System.out.println(points);
	}
}
