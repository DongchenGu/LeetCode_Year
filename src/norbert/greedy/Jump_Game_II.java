package norbert.greedy;


public class Jump_Game_II {
    public int jump(int[] nums) {
        int result =0;
        int limit =nums[0];
        if(nums.length==1){return 0;}

        int loopMax = nums[0];
        for(int i=0; i<=limit && i<nums.length; i++){
            if(i + nums[i]> loopMax){
                loopMax = i+nums[i];
            }
            if(i==limit || i==nums.length-1){
                limit = loopMax;
                result++;
            }
        }

        return result;
    }
}
