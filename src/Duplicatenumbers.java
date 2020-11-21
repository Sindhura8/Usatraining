import java.util.Arrays;
import java.util.HashMap;

public class Duplicatenumbers {

	public static void main(String[] args) {
		
		int[] a = { 10, 1, 8, 90, 1, 1,1,1,5 };
		int length=a.length;
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for (int i = 0; i <= length - 1; i++) {

			int key = a[i];
			
			Integer value=hm.get(key);
			if(value==null) {
				
				hm.put(a[i],1);
			}
			else {
				hm.put(a[i],value+1);
			}	
		}
		System.out.println(hm);
	}
	}


