import java.util.Scanner;

public class Totals {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		
		Totals t=new Totals();
		t.upperLower(a);
		t.countInt(a);
		t.specialCharac(a);
		
	}
		
		public void upperLower(String a) {
			int upper=0; 
			int lower=0;
			
			for(int i=0;i<=a.length()-1;i++) {
				
				char p=a.charAt(i);
				
				if(Character.isUpperCase(p)) {
					upper++;
				}
				else if(Character.isLowerCase(p)) {
					lower++;
				}
				
			}
			System.out.println("Count of Uppercase letters are: " + upper);
			System.out.println("Count of Lowercase letters are: "+ lower);
		}
		
		public void countInt(String a) {
			
			int count=0;
			
			
			for(int i=0;i<=a.length()-1;i++) {
				
				char x=a.charAt(i);
				
				//String s=Character.toString(x);
				
				//Integer in=Integer.parseInt(s);
				
				if(x>='0' && x<='9') {
					count++;
				}
			}
			System.out.println(count);
		}
		public void specialCharac(String a) {
			int special =0;
			for(int i=0;i<=a.length()-1;i++) {
				
				char x=a.charAt(i);
				
				if(!(x>='0' && x<='9') && !(x>='a' && x<='z') && !(x>='A' && x<='Z')) {
					
					special++;
				}
			
		}
			System.out.println(special);
		

	}
}


