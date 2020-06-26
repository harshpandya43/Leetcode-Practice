package amazon;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] heights = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		TrappingRainWater tp = new TrappingRainWater();

		int height = tp.trappedRainWaterSol(heights);

		System.out.println(height);

	}

	public int trappedRainWaterSol(int[] heights) {
		if (heights.length == 0 || heights.length <= 2) {
			return 0;
		}
		int res = 0;
		int[] left = new int[heights.length];
		int[] right = new int[heights.length];

		int max = heights[0];
		left[0] = heights[0];

		for (int i = 1; i < heights.length; i++) {
			if (heights[i] < max) {
				left[i] = max;
			} else {
				left[i] = heights[i];
				max = heights[i];
			}
		}

		max = heights[heights.length - 1];
		right[heights.length - 1] = heights[heights.length - 1];

		for (int i = heights.length - 2; i >= 0; i--) {
			if (heights[i] < max) {
				right[i] = max;
			} else {
				right[i] = heights[i];
				max = heights[i];
			}
		}

		for (int i = 0; i < heights.length; i++) {
			res += Math.min(left[i], right[i]) - heights[i];
		}

		return res;

	}

}
