
public class Reversethreenumbers {

	public static void main(String[] args) {
		
		int[] a= {1,3,5,7,8,3,2,6,9,4,5,8,9,6,5,1,2};
		int k=3;
		int x=0;
		int z=0;
		int[] y=new int[20];
		while(a.length>=k) {
		for(int i=k-1;i>=z;i--) {
			x=a[i];
			System.out.print(","+ x);	
		}
	    k=k+3;
        z=z+3;
	}
		
		

}
}
