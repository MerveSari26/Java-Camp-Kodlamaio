public class Main{
	public static void main(String[] args) {
		double total=0,max;
		double[] mylist= {1.2,1.3,2.8,4.5};
		max = mylist[0]; //randomly
		for(double number:mylist) { //number nickname for mylist's elements
			if(max<number)    
				max=number;
			total+=number; //sum elements
			System.out.println(number);
		}
		
		System.out.println("The sum of mylist's elements : "+total);
		System.out.println("The max of mylist's elements : "+max);
		
	}	
}