package ippo;
import java.util.*;
public class Rgear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string : ");
String word = sc.nextLine();
StringBuilder sb = new StringBuilder(word);
System.out.print("Now your string is in reverse gear : ");
/*for(int i=word.length()-1;i>=0;i--) {
	System.out.print(word.charAt(i));
}*/
System.out.println(sb.reverse()); //stringbuilder method
}}