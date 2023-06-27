public class MyClass {
    public static void moveZeroes(int[] nums) {
        // Initialize two pointers
        int left = 0;
        int right = 0;

        // Move non-zero elements to the left side
        while (right < nums.length) {
            if (nums[right] != 0) {
                // Swap non-zero element to the left side
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                // Move the left pointer forward
                left++;
            }

            // Move the right pointer forward
            right++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
