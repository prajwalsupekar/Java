class p3{
	public static void main(String args[]){
		int n=4;
		int j=1;
		for(int i=1;i<=n;){

			if(j<=n){
			System.out.print("* ");
			j++;
			continue;
			}

			else if(j>n){
				System.out.println();
			}

			j=1;
			i++;
		}
	}
}
