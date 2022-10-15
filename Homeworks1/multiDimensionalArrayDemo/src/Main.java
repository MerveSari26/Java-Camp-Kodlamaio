public class Main{
	public static void main(String[] args) {
		int i,j;
		String[][] cities=new String[3][3];
		cities[0][0]="İstanbul";
		cities[0][1]="Bursa";
		cities[0][2]="Eskişehir";
		cities[1][0]="Bilecik";
		cities[1][1]="Kayseri";
		cities[1][2]="Malatya";
		cities[2][0]="Adıyaman";
		cities[2][1]="Hatay";
		cities[2][2]="Yozgat";
		for(i=0;i<3;i++) {
			System.out.println("******************");
			for(j=0;j<3;j++) { 
				System.out.println("The cities : "+cities[i][j]);
			}
		}
	}
	
}