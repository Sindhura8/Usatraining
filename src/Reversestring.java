import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		
		int length=a.length();
		String reverse="";
		
		for(int i=length-1;i>=0;i--) {
			 reverse=reverse+a.charAt(i);
			
		}
		System.out.println(reverse);

	}

}
