 class Demo1{
	int a;
	int b;
	
	public Demo1(){
		System.out.println("Inside Demo1 Default constructor");
	}
	
	public Demo1(int a , int b){
	this();
		this.a=a;
		this.b=b;
		System.out.println("inside Demo1 parameterized constructor " +a );
	}
}

class Demo2 extends Demo1{
	int a = 10;
	int b=20;
	
	Demo2(){
		this(10,20);
		System.out.println("Inside Demo2 Default constructor ");
	}
	
	Demo2(int a,int b){
		super(10,20);
		System.out.println("Inside Demo2 parameterized constructor " +this.a );
	}

public static void main(String args[]){
	Demo2 d2 = new Demo2();
	//Demo2 d = new Demo2(10,30);
	}
}
