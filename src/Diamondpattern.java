
public class Diamondpattern {

	public static void main(String[] args) {
		
		int lines=5;
		int spaces=lines;
		for(int i=lines;i>0;i--) {
			for(int s=1;s<spaces;s++) {
				System.out.print(" ");
			}
			spaces--;
			for(int j=i;j<=lines;j++) {
				System.out.print("*");
				System.out.print(" ");
				
		
		}	
			System.out.println(" ");
		}
		spaces=lines;
	for(int i=lines-1;i>0;i--) {
		for(int s=i;s<spaces;s++) {
			System.out.print(" ");
		}
		for(int j=0;j<i;j++) {
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println(" ");
		
	}
}

}