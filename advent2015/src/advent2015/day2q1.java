package advent2015;
import java.util.*;
public class day2q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int product = 0;
		while (!a.equals("0")) {
			String [] bwh = a.split("x");
			int [] numbwh = new int[3];
			for (int i = 0; i < 3; i++) {
				numbwh[i] = Integer.parseInt(bwh[i]);
			}
			int bw = numbwh[0] * numbwh[1];
			int wh = numbwh[1] * numbwh[2];
			int bh = numbwh[0] * numbwh[2];
			product += (bw * numbwh[2]);
			if (bh <= wh && bw <= wh) {
				product += 2*bh + 2*bw;
			}
			else if (bh <= bw && wh <= bw) {
				product += 2*bh + 2*wh;
			}
			else {
				product += 2*bw + 2*wh;
			}
			a = sc.nextLine();
		}
		System.out.println(product);
	}

}
