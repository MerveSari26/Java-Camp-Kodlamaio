public class Main{
	public static void main(String[] args) {
		//code that prints a message to the screen according to a student's grade
		char grade='A'; //value can be changed here
		switch (grade) {
		case 'A': {
			System.out.println("congratulations you passed the class.");
			break;
		}
		case 'B':{
			System.out.println("Great!");
			break;
		}
		case 'C':{
			System.out.println("Good!");
			break;
		}
		case 'D':{
			System.out.println("Narrowly!");
			break;
		}
		case 'F':{
			System.out.println("You failed the class");
			break;
		}
		default:
			System.out.println("invalid value entered");
		}
	}
}