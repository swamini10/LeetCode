class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
             for (int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
        return new int[]{i, j};
        }
        }
    }
    return new int[]{-1, -1}; // if not found
    }
     public static void main(String args[]) {
               Scanner sc = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Take array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Take target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        Solution s = new Solution();
        int[] result = s.twoSum(nums, target);

    }
}