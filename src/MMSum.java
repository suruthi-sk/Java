//Memory Management

class MMSum{
	static int c=5;
	int add(int a, int b){
		return a+b;
	}
	
	public static void main(String args[]){
		MMSum obj = new MMSum();
		int num = obj.add(3,4);
		System.out.println(num);
		System.out.println(c);
	}
}



//Memory Management
//Giving Static method, so that function can be invoked without creating object 
class MMSum2{
	int c=5;
	static int add(int a, int b){
		return a+b;
	}
	
	public static void main(String args[]){
		//MMSum obj = new MMSum();
		int num = MMSum2.add(5,7);
		System.out.println(num);
		//System.out.println(c);
	}
}