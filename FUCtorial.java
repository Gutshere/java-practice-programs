package ippo;
import java.util.*;
public class FUCtorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number : ");
int a = sc.nextInt();
if(a<=1) {
	System.out.println("The factorial of "+a+" is : 1");
}
int b=1;
int c=a;
while(a>0) {
 b *=a;
 a--;
}
System.out.println("The factorial of "+c+" is : "+b);
	}}