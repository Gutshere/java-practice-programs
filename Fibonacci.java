package ippo;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter how many terms :");
int a = sc.nextInt();
int n=2;
int first =0;
int second = 1;
System.out.print("The fibonacci sequence : "+first+" "+second+" ");
while(1<n&&n<=a-1) {
	int z =first+second;
	first = second;
	second = z;
	System.out.print(z+" ");
	n++;
}
}}