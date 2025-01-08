package d0108;

import java.util.Random;

public class Lotto3 {
	
	public static void main(String[] args) {
		int[] nums = new int[3];
		Random r = new Random();
		//nums[0] = r.nextInt(1)
		//nums[1] = r.nextInt(2)
		//nums[2] = r.nextInt(3)
		for(int i = 0; i<3; i++) {
			nums[i] = r.nextInt(100);
		}
		for(int i=0;i<3;i++) {
			System.out.println(nums[i]);
			//System.out.println(nums[0]);
			//System.out.println(nums[1]);
			//System.out.println(nums[2]);
		}
		
		
	}
}
