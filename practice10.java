class SGGS{

	int a;
	int b;
	SGGS(float a,float b){
		this.a = a;
		this.b = b;
		System.out.println(a);System.out.println(b);
	}
	SGGS(int a , int b){
		System.out.println("constfg");
	}

	public static void main(String... args){
	//System.out.println(args[0]);
	//System.out.println(args[1]);
	//System.out.println(args[2]);
	
	int a = 45;
	double b = a;		//implicit typecasting
	double c = 123.123;
	int d = (int)c;       //explicit typecasting
	
	int n1 = 12;
	int n2 = 5;
	int r = n1/n2;
	System.out.println(r);
	System.out.println(d);
	SGGS sggs1 = new SGGS(10.8f,20.7f);
	SGGS sggs2 = new SGGS(10,20);
	StringBuilder sb = new StringBuilder("Sachin");
	System.out.println(sb);
	System.out.println(sb.capacity());
	
	
	
	}
}
