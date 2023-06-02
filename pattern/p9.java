class p9{
	public static void main(String[] args){
		int n=5;
		int j=1;

		for(int i=1;i<=n;){
			if(j<=n){
				if(j==1 || j==n){
					System.out.print("* ");
					j++;
				}
				else{
				
					System.out.print("  ");
					j++;
				}
				continue;
			}

			if(j>n){
			
				System.out.println();

			}
			j=1;
			i++;

		}
	
	}

}
