//Logical operator

class Demo{
	public static void main(String[] args){
		int x=8;
		int y=10;

		int ans= ++x + y++ - x-- + ++y;

		System.out.println(ans);
		
		System.out.println(x);

		System.out.println(y);
	}
}
