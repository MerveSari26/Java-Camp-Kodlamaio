public class Main{
	public static void main(String[] args) {
		String student1="Merve";
		String student2="Edward";
		String student3="Peri";
		String student4="Love";
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		System.out.println("*********************************");
		//create student list using array
		
		String[] students=new String[4];
		students[0]="Merve";
		students[1]="Edward";
		students[2]="Peri";
		students[3]="Love";
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
	
		System.out.println("*********************************");
		
		for(String student:students) {    //student nickname for array elements
			System.out.println(student);
		}
	}
}