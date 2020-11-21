import java.util.Scanner;

public class Truebooleanvariables {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 String a=sc.nextLine();
		String b=sc.nextLine();
		String c=sc.nextLine();
		
		boolean x=Boolean.parseBoolean(a);
		boolean y=Boolean.parseBoolean(b);
		boolean z=Boolean.parseBoolean(c);
		
		if((x&&y)|| (y&&z)|| (z&&x)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}	

	}

}
