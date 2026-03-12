package ippo;
import java.util.Scanner;
class VowelCount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter any string/word : ");
	String a = sc.nextLine();
	String b = a.toLowerCase();
	int c = 0;
	char[] d = b.toCharArray();
	for(char e : d) {
		if(e=='a' || e=='e' || e=='i' || e=='o' || e=='u') {
		c++;
		}
		else {}}
		System.out.println("Number of vowels in the given string : "+c);
		sc.close();}}