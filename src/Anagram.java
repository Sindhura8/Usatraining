import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1="keep";
		String s2="peek";
		
		String s1a= s1.replaceAll(" ", "");
		String s2a= s2.replaceAll(" ", "");
		
		boolean status=true;
		
		if(s1a.length()!=s2a.length()) {
			
			status=false;
		}
		else {
			
		char[] s1array=s1a.toLowerCase().toCharArray();
		char[] s2array=s2a.toLowerCase().toCharArray();
		
		Arrays.sort(s1array);
		Arrays.sort(s2array);
	
		status=Arrays.equals(s1array, s2array);
		}
		System.out.println(status);
}
}
