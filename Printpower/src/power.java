
public class power {

	


		public static void main(String[] args) {
			printPowersOfN(2,7);
			System.out.println();
			printPowersOfN(5,3);
			System.out.println();
			printPowersOfN(3,6);

		}
		
		public static void printPowersOfN(int x, int y) {
			int  n=1;
			System.out.print (1 + " ");
			for (int i=0; i<y; i++) {
				n= x*n ;
				System.out.print (n + " ");
			
				
			}
		
		}
	
}

