package DIV4;

import java.util.*;

public class Osumania {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- > 0) {
			int n = sc.nextInt();
			sc.nextLine();
			List<Integer> ans = new ArrayList<>();

			for(int i = 0; i < n; i++) {
				String curr = sc.nextLine();
				for(int j = 0; j < 4; j++) {
					if(curr.charAt(j) == '#') {
						ans.add(j + 1);
						break;
					}
				}
			}

			for(int i = n - 1; i >= 0; i--) {
				System.out.print(ans.get(i) + " ");
			}
		}
	}
}
