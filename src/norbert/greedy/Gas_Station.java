package norbert.greedy;

//https://leetcode.com/problems/gas-station/description/
public class Gas_Station {

    // 思想是这样的，gas和cost取差值，这个差值 就是经过某个加油站后的 剩余油量。
    // 这个差值数组的  所有元素和，如果大于0，就说明存在可能性。
    // 然后，通过这个差值数组，我们从index0开始尝试，就是假设0是我们的开始index
    //后面不断地累加，累加和<0就说明这个区间内都不是 startIndex, 就只能假设startIndex是后面一位
    //然后从0重新计算累加和

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int startInedx =0;
        int curSum=0;
        int allSum=0;

        int[] temp = new int[gas.length];
        for(int i=0; i<gas.length; i++){
            curSum+=(gas[i]-cost[i]);
            allSum+=(gas[i]-cost[i]);
            if(curSum <0){
                startInedx=i+1;
                curSum=0;
                continue;
            }
        }
        if(allSum <0 ){return -1;}
        return startInedx;

    }
}
