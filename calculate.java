import java.lang.Math;
public class calculate {
	public static void main (String[] arg) {
		System.out.println("Calculate...");
		
		int a = Integer.valueOf(arg[0]);
		int b = Integer.valueOf(arg[1]);
		int sum = a+b;
		int sub = a-b;
		double div = a/b;
		int mult = a*b;
		double power = Math.pow(a,b);
		
		System.out.println(a+"+"+b+"="+sum);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"*"+b+"="+mult);
		System.out.println(a+"^"+b+"="+power);
	}
}