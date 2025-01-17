package d0117;

import d0117.Static3;

public class Static3 {
	static int age = 10;//static 찍히기전에는 s1,s2는 다른것
						//찍히고 나서는 s1,s2는 같은 것
	public static void main(String[] args) {
		Static3 s1 = new Static3();
		System.out.println(s1.age);//10
		s1.age = 20;
		Static3 s2 = new Static3();
		System.out.println(s2.age);//10 static이 찍히고 난 후 = 20
	}

}
