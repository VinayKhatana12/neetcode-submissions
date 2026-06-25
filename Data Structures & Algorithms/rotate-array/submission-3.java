class Solution {
    public static void reverse(int[] arr,int s,int end){
        while(s<end){
            int temp = arr[s];
            arr[s] = arr[end];
            arr[end] =  temp;
            s++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) return;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    }
}