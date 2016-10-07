package cn.jeans.array;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target){
                  res[0]=i;
                  res[1]=j;
                }
            }
        }
        return res;
    }
	public static void main(String[] args) {
        int[] tar = {3,2,4};
        int[] result = twoSum(tar,6);
        System.out.println(result[0]+","+result[1]);
        
	}
}