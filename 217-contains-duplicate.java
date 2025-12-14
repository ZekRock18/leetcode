class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seenNumbers = new HashSet<>();
        for(int num = 0; num<nums.length; num++ )
        {
            if (seenNumbers.contains(nums[num])){
                return true;
            }

            seenNumbers.add(nums[num]);
        } 

        return false;
        
    }
}
