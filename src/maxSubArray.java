/**
 * 找出任意一段子序列的元素總和最大值
 * @author black
 *
 */
public class maxSubArray {
	public static void main(String []args){
		Solution Solution = new Solution();
		int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
//		int [] nums = {-1,1,-1,-3};
		System.out.println(Solution.maxSubArray(nums));
	}
}
