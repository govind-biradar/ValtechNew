package day2;

public  class ArithmeticImpl implements Arithmetic {
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
	@Override
	public int div(int a, int b) throws DivideByZero{
		if(b==0) {
			throw new DivideByZero("Zero cannot be used as denominator");
		}
		
		return a/b;
	}
	
	@Override
	public int mul(int a, int b) {
		
		return a*b;
	}
	
	@Override
	public int sub(int a, int b) {
		
		return a-b;
	}
	public static void main(String[] args) {
		Arithmetic z = new ArithmeticImpl();
		System.out.println(z.add(2,3));
		try {
			System.out.println(z.div(5,0));
		} catch (DivideByZero e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			
		}finally {
			System.out.println("seen always");
		}
		System.out.println(z.mul(4,2));
		
	}
	

}
