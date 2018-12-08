package advent2015;
import java.util.*;
public class day1q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		int floor = 0;
		for (int i = 0; i < user.length(); i++) {
			if (user.charAt(i) == '(') {
				floor += 1;
			}
			else {
				floor -= 1;
			}
		}
		System.out.println(floor);
	}

}
