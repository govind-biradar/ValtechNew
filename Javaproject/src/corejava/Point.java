package corejava;


import java.io.Serializable;

public class Point implements Comparable<Point>,Serializable{
		 public static final Point ORIGIN = new Point();
		 
		 static {
			 ORIGIN.x=1000;
			 ORIGIN.y=2000;
			 System.out.println(ORIGIN);
}
		 protected int x;
		  protected transient int y;
		 
		
   public  Point() {
	   
	 System.out.println("Point Method");
	   
}
   public Point(int x,int y) {
	   System.out.println("in the point");
	   this.x=x;
	   this.y=y;
	 
   }
   public int compareTo(Point o) {
	   return (x-o.x)==0 ? (y-o.y):(x-o.x);
   }
  @Override
public boolean equals(Object obj) {
return super.equals(obj);
}
@Override
public int hashCode() {
	   
return toString().hashCode();
}
@Override
public String toString() {
// TODO Auto-generated method stub
return "X="+x+"Y="+y;
}
public double distance(Point p) {
	System.out.println("Distance with another point");
	
	System.out.println("print --distance method");
	return p.x+p.y;
	
}
public double distance() {
	System.out.println("Distance in point ");
	int diffx =x-ORIGIN.x;
	int diffy =y-ORIGIN.y;
	
	return Math.sqrt(x*x+y*y);
}
  public static void main(String[] args) {
	   Point p=new Point();
	   p.x=10;
	   p.y=20;
	   System.out.println(p);
	   
   }
}
