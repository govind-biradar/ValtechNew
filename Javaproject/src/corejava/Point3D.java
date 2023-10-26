package corejava;

public class Point3D extends Point{
	public static final Point3D ORIGIN = new Point3D();
	
	private int z;
	public Point3D() {
		System.out.println("print3D- no parameter");
	}
	public Point3D(int x,int y,int z) {
		super(x,y);
	   this.z=z;
		System.out.println("print3d PARAMETER");
		
	}
	@Override
	public boolean equals(Object obj) {
		Point3D p=(Point3D) obj;
		return p.x==x && p.y==y&& p.z==z;
	}
	@Override
	public String toString() {
		System.out.println("point 3D");
		return "X="+x+"Y="+y+"Z="+z;
	}
	public double distance(Point3D p) {

		System.out.println("point 3d -- called distance method - point3D p");
		return distance(p.x ,p.y , p.z);	
	}

	public double distance(int x, int y, int z) {
		int diffx = this.x - x;
		int diffy = this.y - y;
		int diffz = this.z - z;
		System.out.println("point 3d -- called distance method - int x,int y, int z");
		return Math.sqrt(diffx*diffx + diffy*diffy + diffz*diffz);

	}
	@Override
	public double distance() {
		System.out.println("point 3d -- called distance method - no parameter");
		return Math.sqrt(x*x + y*y + z*z);

	}


	public static void main(String[] args) {
		ORIGIN.z = 50;
		System.out.println(Point.ORIGIN.distance());
		System.out.println(ORIGIN.distance());
		Point p = new Point(10,20);
		double dist = p.distance(new Point3D(20,30,40));
		System.out.println(p);
	}

}

