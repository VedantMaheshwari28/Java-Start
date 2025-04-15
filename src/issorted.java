import java.util.Scanner;
public class issorted{
	public static void main(String[] args) {
		int [][]arr;
		Scanner O = new Scanner(System.in);
		arr= new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++){
				System.out.println("Enter The elemets to be stored in array for row " +i +" and colomb "+j);
				arr[i][j]= O.nextInt();
			}
		}
		int p=arr[0][0],n=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++){
				if(p<=arr[i][j]) {
					p=arr[i][j];
				}
				else {
					p=arr[i][j];
				    n=1;
				}
			}
		}
		if(n==0) {
			System.out.println("Array is in increasing oder");
		}
	}
}