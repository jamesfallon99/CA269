import java.util.Scanner;
public class SumNumber {

		public static void main(String [] args)
		{
				Scanner in = new Scanner(System.in);
				
				int num = in.nextInt();
				int i = 1;
				int sum = 0;
				while (i <= num) {
					sum = sum + i;
					i ++;
				}
		System.out.println("The sum of the numbers from 1 to " + num + " is " + sum);
		}
}