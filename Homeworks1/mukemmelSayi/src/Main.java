public class Main{
	public static void main(String[] args){
		//6 -> 1,2,3 ->1+2+3=6
		int number=6,sum=0,i=1;
		for(;i<number;i++) {
			if(number%i==0)
				sum+=i;
		}
		if(sum==number)
			System.out.println(number +" is the perfect number");
		else
			System.out.println(number +" is not the perfect number");
	}
}