class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double maxsum = Double.NEGATIVE_INFINITY;
        int i=0;int j=0;
        int sum =0;
        while(j<nums.length){
            sum +=nums[j];
            if(j-i+1<k){
                j++;
            }
            else if(j -i+1==k){
                maxsum=Math.max(sum,maxsum);
                sum-=nums[i];
                i++;
                j++;
            }
            
        }
        return maxsum/k;



    }
}