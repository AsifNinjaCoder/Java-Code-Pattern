package pattern;
import java.util.Scanner;
public class pattern6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n) {
			int sp = 1;
			while(sp<=n-i) {
				System.out.print(" ");
				sp =sp+1;
			}
			int j = 1;
			while(j<=i+(i-1)) {
				System.out.print("*");
				j =j+1;
			}
			System.out.println(" ");
			i = i+1;
		}

	}

}
