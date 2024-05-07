class ex1{
//mention which error is this to check it particularly or if you dont know then simply thorw in function
	static void help() {  //throws NullPointerException{
			try {
				throw new NullPointerException("unknown error");
			}
			catch(NullPointerException exception){
				System.out.println("exception caught in help()");
				//System.out.println(exception);
				throw exception;
			}
		}
		
	public static void main(String args[]){
		try{
			help();
		}
		
		catch(NullPointerException exception){
		System.out.println("in function main");
			System.out.println(exception);
		}
		
	}
}
