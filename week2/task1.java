public class SquareRoot {
	public static void main(String[] args) {
		double a = 3;
		double b = 2.5;
		double c = -0.5;

        String x1 = "x1=", x2 = "x2=";
        
        if (a != 0) {
            double d = b*b - 4*a*c;

            if (d > 0) {
                x1 += Double.toString((-b + Math.sqrt(d)) / (2 * a));
                x2 += Double.toString((-b - Math.sqrt(d)) / (2 * a));
            } else if (d == 0) {
                String temp = Double.toString(-b / (2 * a));
                x1 += temp;
                x2 += temp;
            }    
        } else if (c == 0 && b != 0) {
            x1 += "0.0";
            x2 += "0.0";
        }

        System.out.println(x1 + '\n' + x2);
	}
}
