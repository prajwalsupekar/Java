class p10{
	public static void main(String[] args){
	
		int n=5;
		int j=1;
		int x=1;

		for(int i=1;i<=n;){
		
			if(j<=i){
				System.out.print(x+" ");
				j++;
				x++;
				continue;
			
			}

			else if(j>i){

				System.out.println();
			}
			j=1;
			i++;

		}
		
	}

}
