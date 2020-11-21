import java.util.Scanner;

public class Removespecificcharacter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String one=sc.nextLine();
		
		String two= sc.nextLine();
		
		String output="";
		
		for(int i=0;i<=one.length()-1;i++) {
			char ch = one.charAt(i);
			char ar=two.charAt(0);
            if(ch!=ar) {
               output = output + ch;
        
        }
		}
 
       System.out.println("Word after removing duplicate characters : " + output);

	}

}
