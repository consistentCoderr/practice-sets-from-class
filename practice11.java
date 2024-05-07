class year{
	final int totalStudents;
	int students[];
	final int regular_students;
	final int dsy_students;
	final int tfws_students;
	year(int totalStudents,int regular_students,int tfws_students,int dsy_students){
		this.totalStudents = totalStudents;
		this.regular_students = regular_students;
		this.tfws_students = tfws_students;
		this.dsy_students = dsy_students;
		generateStudents();
	}
	
	private void generateStudents(){
		student = new int [totalStudents];
		int i=0,j=151,k=501;
		for(;i<totalStuents;i++){
			if(i<=regular_students){
				students[i]=i+1;
			}else if(j<=150+tfws_students){
			students[i]=j;
			j++;
			}
			else if(k<=500+dsy_students){
			students[i]=k;
			k++;
			}
		}
	}
	void displayStudentRegNumber(){
		for(int rollnumber:students){
		SYstem.out.println(rollNumber);	
		}
	}
	public static void main(String args[]){
		Year inftSY = newYear(78,64,3,11);
		inftSY.displayStudentsRegNumber();
		
		 //int selectStudents(){
		//	return studentRegNumber[(int)(System.nanotime()%totalStudents)];
		//}
	}
}
