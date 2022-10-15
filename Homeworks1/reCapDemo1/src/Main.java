public class Main{
	public static void main(String[] args) {
		//code to find largest number
		int num1,num2,num3,biggestNum;
		num1=20;
		num2=25;
		num3=2;
		biggestNum=num1; //first,one of the variables is chosen as the biggest randomly.
		//comparison is made for the other two variables that are not biggestNum selected
		if(biggestNum<num2)
			biggestNum=num2;
		if(biggestNum<num3)
			biggestNum=num3;
		System.out.println("The biggest number is : "+biggestNum);
		
	}
}