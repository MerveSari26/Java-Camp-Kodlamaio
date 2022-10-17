public class Main{
	public static void main(String[] args){
		int number=25,i;
		int remainder=number%2;		
		boolean isPrime=true;
		System.out.println("remainder of division by 2 : " + remainder);
		if(number<1) {
			System.out.println("Invalid number!");
			return;
		}
		else if(number==1) {
			System.out.println("Number is not prime.");
			return;
		}
		for(i=2;i<number;i++) {
			if(number%i==0)
				isPrime=false;
		}
		if(isPrime)
			System.out.println("Number is prime.");
		else
			System.out.println("Number is not prime.");
	}
}