class First{
	public static void main(String... args){		
		try{
			Thread.sleep(1000);
			System.out.println(args[0]);
			Thread.sleep(1000);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception occurs at end");
		}
		catch(InterruptedException e){
			System.out.println("Inside IE");
		}		
		try {
			Thread.sleep(3000);
			System.out.println(args[0]);
		}
		catch(Exception e){
			System.out.println("Inside IE for all");
		}
		finally{
			System.out.println("Exception occurs in finally");
		}
	}
}
