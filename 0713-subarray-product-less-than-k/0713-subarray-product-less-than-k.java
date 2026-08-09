class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       	int si = 0, ei = 0, p = 1, ans = 0;
		while (ei < nums.length) {
			// window grow
			p = p * nums[ei];
			// window shrink
			while (p >= k && si<=ei) {
				p = p / nums[si];
				si++;
			}
			// answer update
			ans += (ei - si + 1);
			ei++;
		}
		return ans; 
    }
}