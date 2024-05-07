class ex3{
	public static void main(String args[]){
		int a=10;
		int b=10;
			try{
			//throw new ArithmeticException("cant divide by zero");
			int c=a/b;
			System.out.println(c);
		}
		finally{
		System.out.println("cant divide by zero");
		}
	}
	
}
