package lab2;
import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int time=scan.nextInt();
		System.out.println("minute :"+time/60);
		System.out.println("seconds :"+time%60);
		scan.close();
	}

}
