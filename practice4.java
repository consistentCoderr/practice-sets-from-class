class Father{
static int balance;
	public static void main(String[] args){
		Father son;
		Father daughter1=new Father(0.2f);
		Father daughter=new Father(456);
		System.out.println(daughter.balance);
		System.out.println(daughter1.balance);
	}
	public Father(){
		//this(24);
		int balance = 576;
		//System.out.println(balance +0.2);
		System.out.println(balance);
		System.out.println("inside Default constructor");
	}
	
//	public Father(int a){
//		System.out.println("inside constructor");
//	}
	
	public Father(int balance){		//456
		//this.balance = balance;
		int x = balance = balance;	//assigning 456 to balance
		System.out.println(x);		//456
		System.out.println(balance=12345);
		System.out.println(balance);
	}
	
	public Father(float balance){
		if(balance+0.2 == 4){
		System.out.println(balance);
		}
		System.out.println(balance+0.2);
	}	
}
