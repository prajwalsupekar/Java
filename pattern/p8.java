class p8{

	public static void main(String[] args){
	
	int n=4;
	int j=1;
	char ch='A';
	int x=1;

	for(int i=1;i<=n;){
		
		if(j<=n){

			if(j%2!=0){
				System.out.print(ch+" ");
				ch++;
			}

				else{
				
					System.out.print(x+" ");
					x++;
				}

				j++;
				continue;
			}
		
	       	if(j>n){
			
			System.out.println();
			j=1;
			i++;
			ch='A';
			x=1;
		
		}
		}

	}
}
