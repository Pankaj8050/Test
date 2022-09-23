package array;

import java.util.Scanner;

public class Add10ToMatrix {

	public static void main(String[] args) {
		
		
		int i,j , row =0 , column=0;
		
		Scanner scanner = new Scanner(System.in);
		row = scanner.nextInt();
		column = scanner.nextInt();
		
		int[][] array = new int[row][column];

		
		for( i = 0 ; i < row ; i++) { //row
			
			for(j = 0 ; j < column ; j++) { //column
				
				if(i == 0 || i == row-1 ||  j == 0  ||  j == column-1)
				System.out.print("* "); 
				else
					System.out.print("  ");
			}
			
			System.out.print("\n");
		}
	}

}
