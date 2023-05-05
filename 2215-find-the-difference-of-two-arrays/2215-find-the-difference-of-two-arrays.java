class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> unique1 = new HashSet<>();
        HashSet<Integer> unique2 = new HashSet<>();
        
        for(int k:nums1)
            unique1.add(k);
        
        for(int k:nums2)
            unique2.add(k);
        
        HashSet<Integer> unique1_clone = (HashSet)unique1.clone();
        
        unique1.removeAll(unique2);
        unique2.removeAll(unique1_clone);
            
        List<Integer> diff1 = new ArrayList<>(unique1);
        List<Integer> diff2 = new ArrayList<>(unique2);
        
        
        
        List<List<Integer>> output = new ArrayList<>();
        
        output.add(diff1);
        output.add(diff2);
        
        return output;
        
        
    }
}