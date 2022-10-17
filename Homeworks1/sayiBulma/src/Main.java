public class Main{
	public static void main(String[] args) {
		int[] numbers=new int[]{1,2,5,7,9,0};
		int search=5; 
		boolean isThere=false;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==search) {
				isThere=true;
				break;
			}
		}
		if(isThere)
			System.out.println("Number sought is available in array.");
		else
			System.out.println("Number sought is not available in array.");
	}
}