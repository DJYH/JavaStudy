import java.util.Scanner;
import java.util.*;
public class BinarySearch {
	public static void main (String[]args) {
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10}; //init
		int left = 0, mid;
		int right = 10, size = 10;
		Scanner scan = new Scanner(System.in);
		System.out.println("1���� 10 ������ ���� �Է��� �ּ��� :") ;
		int x  = scan.nextInt();
		
		while(left <= right) {
			 mid = (left +right)/2;
			 
			 if(x < array[mid]) {
				 right = mid -1 ;
			 }
			 else if (array[mid] < x) {
				 left = mid +1 ;
			 }
			 else {
				 System.out.println(x+"�� �ε�������" + mid +"�Դϴ�");
				 break; 
			 }
			 
		}

		
		
		
		
	}
	
	
}
