package arrlu;
import java.util.*;
public class CountEF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the arry size : ");
		int size=sc.nextInt();
		int box[] = new int[size];
		for(int i=0;i<size;i++) {
			box[i]=sc.nextInt();
		}
		for(int i=0;i<box.length;i++) {
			if(box[i]==-1) continue;
			int count =1;
			for(int j=i+1;j<box.length;j++) {
				if(box[i]==box[j]) {
					count++;
					box[j]=-1;
				}
			}
			System.out.println(box[i]+" occurs "+count+" time/s.");
		}
}}