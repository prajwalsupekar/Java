class p6{
	public static void main(String[] args){
	
		int n=4;
		int j=1;
		int x=3;

		for(int i=1;i<=4;)
		{
			if(j<=i){
				System.out.print(x+" ");
				j++;
				continue;
			}

			if(j>i){
			
				System.out.println();
			}
			j=1;
			i++;
			x++;
		}
	}
}
