// Write a function for power
public class PowFunction {

	/**
	 * @param args
	 */
	public static double power(double a, int b){
		if(b == 0){
			if(a == 0.0){
				System.out.println("Error");
				return 0.01;
			}
			else
				return 1.0;
		}else if(b == 1)
			return a;
		else if(b > 1){
			double xa = a;
			xa = xa * power(a,b-1);
			return xa;
		}else if(b == -1)
			return 1.0/a;
		else{
			double xma = a;
			int xmb = (-1) * b;
			xma = xma * power(a,xmb-1);
			return 1.0/xma;
		}
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1 =5.0;
		int b1 = -2;
		
		double xpow = power(a1,b1);
		
		System.out.println(xpow);
	}

}
