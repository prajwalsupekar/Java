
/*
   
     *
   * * *
 * * * * *
 
*/

class p7{
	public static void main(String[] args){
		
	int n=5;
	int x=1;

	for(int i=1;i<=n;i++){
		
		for(int k=i;k<=n-1;k++){

			System.out.print("  ");
		}

		for(int j=1;j<=x;j++){
		
			System.out.print(" *");

		}
		x=x+2;
		System.out.println();		
			
	}	
		
	}
}
