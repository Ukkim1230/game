package d0117;

public class Static2 {
	int age = 1;
	static int height;
	
	void test(int n) {
		//return = 값을 내거나 종료하거나.
		System.out.println("테스트 시작");
		if(n==1) {
			return;
		}
		System.out.println("테스트 종료");
	}
	
	public static void main(String[] args) {
		//시작점은 16라인
		height = 1;
		System.out.println(height);
		Static2 s = new Static2();
		System.out.println(s.age);
		System.out.println(s.height);
		s.test(1);
	}
}
