 class MyException extends Exception{
	MyException(String s){
		super(s);
		System.out.println("Inside Constructor");
	}
}

class ex5{
		public static void main(String args[]){
		System.out.println("inside main");
		try{
			throw new MyException("Sorry : My Exception occurs");
			//System.out.println("Inside try block");
		}
		
		catch(MyException e){
			System.out.println(e.getMessage());
		}
	}
}
	

