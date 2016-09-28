package Classes.IncreasingSequence;

import java.util.Arrays;

public class SequencesMerger {
    public static int[] GetMergeIndices(double[] firstSequence, double[] secondSequence) {
        int[] indices = new int[secondSequence.length];
        for (int i = 0; i < indices.length; i++) {
            int index = Arrays.binarySearch(firstSequence, secondSequence[i]);
            indices[i] = (index >= 0) ? index + 1 : Math.abs(index) - 1;
        }

        return indices;
    }
}
