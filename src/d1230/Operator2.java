package d1230;

public class Operator2 {
	
	public static void main(String[] args) {
			int num = 1;
			num = num + 1;
			num += 1;
			num++;//후순연산자(후위연산자)
			++num;//전위연산자
			System.out.println(num++);
			System.out.println(num);
			
			num--;
			--num;
			num -= 1;
			num = num - 1;
			System.out.println(--num);
			
		
	}
}
