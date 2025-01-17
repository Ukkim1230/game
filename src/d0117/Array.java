package d0117;

public class Array {

	public static void main(String[] args) {
		//방개수 지정,늘리거나 줄일 수 없다
		int[] nums = new int[2];
		nums[0] = 20;
		nums[1] = 22;
		
		int[] tmps = nums;//{20,22}
		nums = new int[nums.length+1];//3
		for(int i=0;i<tmps.length;i++) {//012
			nums[i] = tmps[i];
		}
	}
}
