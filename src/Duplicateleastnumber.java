
public class Duplicateleastnumber {

	public static void main(String[] args) {

		String input="ITHIHAAS";
		int[] dupliactecount=new int[26];
		int count=0;
		char x=' ';
		char alphabet;
		int result=0;
		
		for(alphabet='A'; alphabet<='Z';alphabet++) {
		for(int i=0;i<=input.length()-1;i++) {
			if(input.charAt(i)==alphabet) {
				count++;
				result=input.charAt(i)-'A';	
			}
		}
       if(count>0) {
			System.out.println("count of the alphabet "+ alphabet +" : " +count);
			count=0;
	}	
}
}
}

