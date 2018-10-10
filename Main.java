import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double c = 573/(0.73 * 2.58 * Math.cos(Math.PI/4.0));
		double g = (0.73 * Math.sqrt(2.0) * c)/2.58;
		double x, y, k, angle;
		
		Scanner input = new Scanner(System.in);
		x = input.nextDouble();
		y = input.nextDouble();
		angle = input.nextDouble() * (Math.PI/180.0);
		
		double num = g*x*x;
		double den = c*c*(x*Math.sin(2.0*angle) - 2.0*y*Math.pow(Math.cos(angle), 2.0));
		
		/*System.out.println(String.valueOf(num));
		System.out.println(String.valueOf(den));*/
		
		k = Math.sqrt(num/den);
		System.out.println(String.valueOf(k*100));

	}

}
