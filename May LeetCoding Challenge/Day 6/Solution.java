// https://leetcode.com/problems/majority-element/
class Solution {
  // Approach using Hash Map
    public int majorityElement(int[] nums) {
        int majority = nums.length/2;
        Map<Integer,Integer> map = new HashMap();
        
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        }

        for(Integer i : map.keySet()) {
             if(map.get(i) > majority)
                return i;
        }
        return 0;
    }
  // Approach using sorting
  public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
