public class Main{
	public static void main(String[] args){
		//220-284 friend numbers ,friend numbers are if the sum of the divisors of one is equal to  
		//the other number and the sum of the divisors of the other number is equal to the other
		int num1=220,num2=284,sum1=0,sum2=0,i;
		for(i=1;i<num1;i++) {
			if(num1%i==0)
				sum1+=i;
		}
		for(i=1;i<num2;i++) {
			if(num2%i==0)
				sum2+=i;
		}
		if(sum1==num2 && sum2==num1) {			
			System.out.println(num1+" and "+num2+" are friends numbers!");			
		}
		else
			System.out.println(num1+" and "+num2+" are not friends numbers!");
	}
}