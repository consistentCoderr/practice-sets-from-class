 class SGGS{
	public static void main(String... args){
	StringBuffer sb = new StringBuffer("pranali");
	sb.append("sawadh");
	System.out.println(sb);
	SGGS sggs1 = new SGGS();
	System.out.println(sggs1);
	System.out.println(args[0]);
	System.out.println(args[1]);
	//System.out.println(args[2]);
	}
	public String toString(){
	return "" +getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
}

//java --enable-preview -
