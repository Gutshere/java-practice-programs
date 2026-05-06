package ippo;
import java.util.*;
import java.util.InputMismatchException;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
while(true) { try {
System.out.print("Enter your first number : ");
int a = sc.nextInt();
System.out.print("Now enter your second number : ");
int b = sc.nextInt();
System.out.println("(Swapping the numbers...)");
int temp = a;
a = b;
b = temp;
System.out.println("After swapping\na is : "+a);
System.out.println("b is : "+b);
System.out.println("Do you want to continue ? (yes/no)");
String c = sc.next();
if(c.equalsIgnoreCase("yes")) {
	System.out.println("Okay");
	continue;
}
else { System.out.println("Thank you");
break;}
}
catch(InputMismatchException e) {
	System.out.println("Invalid input!");
sc.next();}}
sc.close();
	}

}
