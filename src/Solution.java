/**
 * Kadane's���Z�@
 * @author black
 *
 */
public class Solution {
	public int maxSubArray(int[] nums) {
        int sum = negative(nums);		//��������,�S�ו��ɑ��B��ő�I,�ۑ��B��0
        if(sum<0)	return sum;			
        int max = nums[0];
        for(int i=0;i<nums.length;i++)
        {
        	sum = sum + nums[i];
        	sum = Math.max(0, sum);		//����`�a�ו��ɁC���s��
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
