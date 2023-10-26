package corejava;

public class AdderImpl implements Adder{

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
	public static void main(String[] args) {
		Adder a = new AdderImpl();
		System.out.println(a.add(5, 6));
		Adder a1 =new Adder() {
			@Override
			public int add(int i, int j) {
				// TODO Auto-generated method stub
				return i+j;
			}
		};
		
		Adder a2 = (i,j) -> {return i+j;};
		System.out.println(a2.add(5, 5));
		
	}

}
