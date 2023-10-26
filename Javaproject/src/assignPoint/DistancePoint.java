package assignPoint;



public class DistancePoint implements Point{

	public int x;
	public int y;
	public DistancePoint(int x,int y) {
		this.x=x;
		this.y=y;

	}

@Override
	public DistancePoint add(DistancePoint p,DistancePoint p1, DistancePoint p2) {
	 p2.x=p.x+p1.x;
	 p2.y=p.y+p1.y;

		return p2 ;

	}
	@Override

	public DistancePoint sub(DistancePoint p,DistancePoint p1,DistancePoint p2) {
		p2.x=p.x-p1.x;
		 p2.y=p.y-p1.y;
			return p2 ;
	}
	@Override
	public double dis(DistancePoint p, DistancePoint p1) {
		int diffx=p1.x-p.x;
		int diffy=p1.y-p.y;

		return Math.sqrt(diffx*diffx+diffy*diffy);
	}
	public String tostring() {
		return (this.x+" "+this.y);
	}
	public static void main(String[] args) {
		DistancePoint p=new DistancePoint(1,3);
		DistancePoint p1=new DistancePoint(2,3);
		DistancePoint p2 = new DistancePoint(0, 0);
		DistancePoint si=new DistancePoint(0,0);
    	System.out.println(si.add(p, p1, p2));
		p2.display();
		System.out.println(si.sub(p, p1, p2));
     	p2.display();
		System.out.println(si.dis(p2, p1));
		}
	@Override
	public void display() {
		System.out.println(this.x);
		System.out.println(this.y);

		

	}

}
