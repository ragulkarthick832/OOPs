package lab2;
import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("even numbers");
		for(int i=1;i<n;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
		scan.close();

	}

}
