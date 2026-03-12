package ippo;
import java.util.*;
public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
while(true) {try { System.out.println("Enter three numbers : ");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if(a>b&&a>c) {
	System.out.println("The largest number among them is : "+a);
}
else if(b>c){System.out.println("The largest number among them is : "+b);}
else if(a==b&&b==c) {System.out.println("All numbers are equal.");}
else{System.out.println("The largest number among them is : "+c);}}
catch(InputMismatchException e) { System.out.println("Invalid input!");}
sc.next();}}
}