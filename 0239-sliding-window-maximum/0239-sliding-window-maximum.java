class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
		int[] ans = new int[n - k + 1];
		int j = 0;
		Deque<Integer> dq = new ArrayDeque<>();
		// 1st window ki
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && nums[i] > nums[dq.getLast()]) {
				dq.removeLast();
			}
			dq.add(i);
		}
		ans[j++] = nums[dq.getFirst()];
		for (int i = k; i < nums.length; i++) {
			// 1. window grow
			while (!dq.isEmpty() && nums[i] > nums[dq.getLast()]) {
				dq.removeLast();
			}
			dq.add(i);
			// 2. wimdow shrink
			if (i - k == dq.getFirst()) {
				dq.removeFirst();
			}
			// 3. ans update
			ans[j++] = nums[dq.getFirst()];
		}
		return ans;
    }
}