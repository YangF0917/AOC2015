package advent2015;
import java.util.*;
public class day1q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		int open = 0;int closed = 0;int val = 0;
		for (int i = 0; i < user.length(); i++) {
			if (user.charAt(i) == '(') {
				open += 1;
			}
			else {
				closed += 1;
			}
			if (closed - open == 1 && val == 0) {
				val = i;
			}
		}
		System.out.println(val);
	}
}

