package nDoms;
import java.util.*;
public class X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array size : ");
int size = sc.nextInt();
int array[] = new int[size];
System.out.println("Enter your array elements : ");
for(int i=0;i<size;i++) {
	array[i] = sc.nextInt();
}
System.out.print("Your array elements are : ");
for(int i=0;i<array.length;i++) {
System.out.print(array[i]+" ");}
System.out.println("\nWhich element you want to search : ");
int x = sc.nextInt();
boolean found = true;
for(int i=0;i<array.length;i++) {
	if(x == array[i]) {
		System.out.println("Element found at index : "+i);
found = false;
break;}
}
if(found){System.out.println("Element not found in the list.");}
	sc.close();}
}