import java.util.Scanner;
import java.awt.*;

@SuppressWarnings("serial")
public final class Grapher extends GraphingCalc{
	public static void graphLin(Graphics g) {
		
	}
	public static void graphQua(Graphics g) {
		
	}
	public static void graphCub(Graphics g) {
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Choose an equation type\n1. Linear\n2. Quadratic\n3. Cubic\n(Input the number)\n");
		switch(in.nextInt()) {
			case 1:
				System.out.println("Linear\n---------------\n");
				System.out.print("Enter m, then x, then b for y = mx+b\n");
				double m = 2d; m = in.nextDouble();
				double x = 1d; x = in.nextDouble();
				double b = 3d; b = in.nextDouble();
				System.out.println("y = " + getLinear(m, x, b));
				break;
			case 2:
				System.out.println("Quadratic\n---------------\n");
				System.out.print("For ax^2+bx+c, enter a, b, c, then x\n");
				double qa = 1d; qa = in.nextDouble();
				double qb = 2d; qb = in.nextDouble();
				double qc = 3d; qc = in.nextDouble();
				double qx = 4d; qx = in.nextDouble();
				System.out.println("y = " + getQuadratic(qa, qb, qc, qx));
				break;
			case 3:
				System.out.println("Cubic\n---------------\n");
				System.out.print("For ax^3+bx*2+cx+d, enter a, b, c, d, then x\n");
				double ca = 1d; ca = in.nextDouble();
				double cb = 2d; cb = in.nextDouble();
				double cc = 3d; cc = in.nextDouble();
				double cd = 4d; cd = in.nextDouble();
				double cx = 5d; cx = in.nextDouble();
				System.out.println("y = " + getCubic(ca, cb, cc, cd, cx));
				break;
			default: //in case the user is a cheeky bastard
				System.out.println("Moronic\n---------------\nyou");
				break;
		}
	}
}
