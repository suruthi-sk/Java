//Polymorphism- Method Overloading

class MethodOverload{
	int c,d;
	void add(int a, int b){
		c = a+b;
		System.out.println("Sum = " +c);
	}
	
	void add(int a, int b, int e){
		d = a+b+e;
		System.out.println("Sum = " +d);
	}
	
	public static void main(String args[]){
		//int c,d;
		MethodOverload obj = new MethodOverload();
		System.out.println("First add");
		obj.add(9,11);
		System.out.println("Second add");
		obj.add(3,8,10);
	}
}