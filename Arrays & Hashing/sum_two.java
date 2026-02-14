class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> x = new HashMap<>();
        for(int i = 0; i<nums.length; i++ ){
            for(int y = 0; y<nums.length; y++){
                x.put(i,y);
                if(y!=i && nums[i]+nums[y]==target && x.get(i)!=i){
                    return new int[]{i,y};
                }
            }
        }
        return null;
    }
}
