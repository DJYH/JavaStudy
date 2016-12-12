
//QuickCoding3 Exception
import java.util.*;
import java.util.Scanner;

public class QuickCoding03 {
	static int int1;
	static int int2;
	
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2���� ������ �Է����ּ���");
		
		String string1 = scan.next();
		String string2 = scan.next();
		
		try {
			int1 = Integer.parseInt(string1);
			int2 =Integer.parseInt(string2);
			int int3  = int1/int2;
			if(int1 >= 1000 || int2 >= 1000 ) {
				throw new Exception();
			}
			System.out.println(int3);
			
		}catch(ArithmeticException x) {
			System.out.println("0���� ������ �����ϴ�.");
		}catch(NumberFormatException y) {
			System.out.println("������ �Է��� �ּ���.");
		}catch(Exception e) {
			System.out.println("1000 �̾��� ���ڸ� �Է����ּ���.");
		}
	}
	
}
