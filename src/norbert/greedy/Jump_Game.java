package norbert.greedy;

//https://leetcode.com/problems/jump-game/description/
public class Jump_Game {

    public boolean canJump(int[] nums) {
        int maxcover = 0;

        for(int i=0; i<=maxcover; i++){
            if(i==nums.length-1){return true;}
            if((i+nums[i])>maxcover){maxcover = i+nums[i];}
        }
        return false;
    }
}
