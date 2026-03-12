package arrlu;
import java.util.*;
public class Minax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array : ");
int size = sc.nextInt();
int[] arr = new int[size];
System.out.println("Enter your elements.");
for(int i=0;i<size;i++) {
	arr[i] = sc.nextInt();
}
System.out.print("Your array elements are : ");
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
while(true) {
	System.out.println("\nChoose your opinion : \n1. Maximum element \n2. Minimum element");
int b=sc.nextInt();
if(b==1) {int max=arr[0];
for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
		max =arr[i];
		}
	}
System.out.println("\nMax of the array : "+max); break;}
else if(b==2) {int min=arr[0];
for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
		min =arr[i];
		}
	}
System.out.println("\nMin of the array : "+min); break;}
else {System.out.println("Invalid input!");}
}
	}}