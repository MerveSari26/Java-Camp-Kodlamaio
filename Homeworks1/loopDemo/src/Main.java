public class Main{
	public static void main(String[] args) {
		int i;
		//For loop, prints even numbers from 0 to 10 (except 10) on the screen
		for(i=0;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("the for loop over");
		
		//While loop, prints odd numbers from 1 to 10 on the screen
		i=1;
		while (i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("the while loop over");
		
		//Do while loop, prints odd numbers from 1 to 10 on the screen
		i=1;
		do {   //always works at least once
			System.out.println(i);
			i+=2;
		} while (i<10);
		System.out.println("the do while loop over");
	}
}