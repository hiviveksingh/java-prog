package Leethcode.seventyfive.db_bank;

import java.util.Arrays;

public class PourWaterInBucket {

	public static void main(String[] args) {

		System.out.println(" Output...." + PourWaterInBucket.equalizeWater(new int[] { 1, 2, 7 }, 80));

	}

	public static double equalizeWater(int[] buckets, int loss) {

		final double acceptedDiff = .000005 ;//1e-5;
		
		final double effectiveGain = (100 - loss) / (double) 100;
		System.out.println("effectiveGain--" + effectiveGain);
		double minW = 0.0;
		double maxW = Arrays.stream(buckets).max().getAsInt();

		System.out.println("r--" + String.valueOf(maxW));

		while (maxW - minW > acceptedDiff) {

			final double median = (minW + maxW) / 2;

			System.out.println("m--" + median);
			if (canReAdjustWater(buckets, median, effectiveGain))
				minW = median;
			else
				maxW = median;
		}

		return maxW;

	}

	private static boolean canReAdjustWater(int[] buckets, double target, double effectiveGain) {

		double extra = 0.0;
		double need = 0.0;

		for (final int bucket : buckets) {
			if (bucket > target)
				extra += bucket - target;
			else
				need += target - bucket;
		}

		System.out.println("extra--" + extra);
		System.out.println("need--" + need);

		return extra * effectiveGain >= need;
	}

}