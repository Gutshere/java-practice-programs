package ippo;
import java.util.*;
public class Calulu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
while(true) {try {System.out.println("Enter two numbers : ");
int a = sc.nextInt();
int b = sc.nextInt();
int c;
while(true) {
System.out.println("Choose your option : \n1. Add \n2. Diff \n3. Mul \n4. Div \n5. Rem");
c = sc.nextInt();
if(c>=1&&c<=5) {break;}
else {System.out.println("Invalid input!");}}
switch(c) {
case 1: System.out.println("Result : "+(a+b));
break;
case 2: System.out.println("Result : "+(a-b));
break;
case 3: System.out.println("Result : "+(a*b));
break;
case 4: System.out.println("Result : "+(a/b));
break;
case 5: System.out.println("Result : "+(a%b));
break;
}}
catch(InputMismatchException w) {System.out.println("invalid input!");
sc.next();}
}
}}