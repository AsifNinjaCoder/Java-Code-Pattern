// Hello this is Asif 
// in this code i make n=5
//// 1
//   23
//   456
//   78910
////
//
//
//
package pattern;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		int val = 1;
		while(i<=n) {
			int j = 1;
			while(j<=i) {
				System.out.print(val);
				val = val+1;
				j = j+1;
				
			}
			System.out.println();
			i =i+1;
		}

	}

}
