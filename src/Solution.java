/**
 * Kadane's‰‰Z–@
 * @author black
 *
 */
public class Solution {
	public int maxSubArray(int[] nums) {
        int sum = negative(nums);		//‘ª•‰É,‘Sˆ×•‰É‘¥™B‰ñÅ‘å“I,”Û‘¥™B‰ñ0
        if(sum<0)	return sum;			
        int max = nums[0];
        for(int i=0;i<nums.length;i++)
        {
        	sum = sum + nums[i];
        	sum = Math.max(0, sum);		//áæã`˜aˆ×•‰ÉC‘¥•sæ
        	max = Math.max(max, sum);
        }
        return max;
    }
	public int negative(int[] nums)
	{
		int max = nums[0];
		for(int i =0;i<nums.length;i++)
		{
			if(nums[i]>=0)	return 0;
			max = Math.max(nums[i], max);
		}
		return max;
	}
}
