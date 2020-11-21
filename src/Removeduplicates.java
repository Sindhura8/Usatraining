import java.util.Scanner;

public class Removeduplicates {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		// String input="abcabc";
		String output="";
		
		for(int i=0;i<=input.length()-1;i++) {
			char ch = input.charAt(i);
            if(ch!=' ')
               output = output + ch;
            input = input.replace(ch,' '); //Replacing all occurrence of the current character by a space
        }
 
       System.out.println("Word after removing duplicate characters : " + output);
		}
		

	}

