//palindrome using for.


class for1{
	public static void main(String[] args){
		int no=12321;
		int rev=0,i=no;

		for(;i!=0;){
			
			int rem=i%10;

			rev=(rev*10)+rem;

			i=i/10;
		
		}
		if(rev==no)
		System.out.println(no+" is palindrome");
		
		else	
		System.out.println(no+" is palindrome");	
	}
}
