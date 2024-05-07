class ex7{
	public static void main(String main[]){
		try{
			int[] num = new int[5];
			int divisor = 0;
			for(int i=0;i<num.length;i++){
				int result=num[i]/0;
				System.out.println(result);
			}
		}
		catch(ArithmeticException ex){
            // create a new exception with the original exception as the cause 
            throw new RuntimeException("Error: division by zero", ex); 
        	}
	}
}
