class Solution {
    public List < List < Integer >> threeSum(int[] nums) {

        //x+y=-z
        List < List < Integer >> output = new ArrayList < > ();
        Arrays.sort(nums);

        HashSet < List < Integer >> sumset = new HashSet < > ();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];

                int x = j;
                int y = nums.length - 1;


                while (x <= y) {
                    int mid = (x + y) / 2;

                    if (nums[mid] == -1 * sum && mid != i && mid != j) {
                        List < Integer > val = new ArrayList < > ();
                        val.add(nums[i]);
                        val.add(nums[j]);
                        val.add(nums[mid]);
                        sumset.add(val);
                        break;
                    } else if (nums[mid] > -1 * sum) {
                        y = mid - 1;
                    } else {
                        x = mid + 1;
                    }
                }
            }
        }

        for (List ele: sumset) {
            output.add(ele);
        }

        return output;

    }
}
