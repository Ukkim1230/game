package d1230;

public class Scope1 {
	
	public static void main(String[] args) {
		int i = 1;
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		
//string i;변수는 어떤영역에서 선언되면 그 영역이 끝날때까지 다시 선언할 수 없다.
		
		if(1==1) {
			int str = 1;
		}
		
		String str = "123";
	}
}

