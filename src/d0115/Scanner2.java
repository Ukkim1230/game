package d0115;

import java.util.Scanner;

public class Scanner2 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("1-9원하는 숫자를 적어주세요 : ");
		String numStr = s.nextLine();
		//1-100까지 출력
		//3이 들어가면 "짝"
		int num = Integer.parseInt(numStr);
		for(int i = 1 ;i<101;i++) {
			    if(i % 10 == 3 || i/10==3
				|| i % 10 ==6 || i/10==6
				|| i%10==9 ||i/10==9) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
		}
	}

}
