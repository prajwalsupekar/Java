//fibonacci using while


class for3{
	public static void main(String[] args){

	int no=32;
	int a=0,b=1;
	int fib=1;
	
	System.out.println(0);
	while(fib<=no){
		System.out.println(fib);
	
		fib=a+b;
		
		a=b;
		b=fib;

		}
	}


}
