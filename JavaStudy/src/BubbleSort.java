
import java.util.*;

public class BubbleSort {
	
	
	public static void main(String args[]) {
		
		int[] list = {10,9,8,7,6,5,4,3,2,1};
		
		for(int i = 0 ; i < list.length; i++) {
			for (int j = 0 ; j < list.length-1;j ++) {
				if(list[j] > list[j+1] ) {
					
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
		for (int i =0 ; i < list.length;i ++) {
			System.out.print(list[i]);
		}
	}
	
}
