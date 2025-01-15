package d0115;

public class Static {
	static int i;//메모리 하지 않아도 되는 레퍼런스 데이터 타입
	static int test() {
		return 1;
	}
	
	public static void main(String[] args) {
		System.out.println(i);
		test();
	}

}
